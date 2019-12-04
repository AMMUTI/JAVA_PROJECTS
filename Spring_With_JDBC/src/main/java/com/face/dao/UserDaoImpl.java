package com.face.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.face.model.Login;
import com.face.model.User;


public class UserDaoImpl implements UserDao{

DataSource dataSource;
@Autowired
JdbcTemplate jdbctemplate;
 public void register(User user ) {
	 System.out.println("register dao");
	 System.out.println(user.getUsername());
	 
	 String sql="insert into users values(?,?,?,?,?,?,?)";
	 jdbctemplate.update(sql, new Object[] {user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getEmail(),user.getAddress(),user.getMobile()});
 }
 
public User validateUser(Login login) {
	String sql="select * from users where username='"+login.getUsername()+"'";
	 
	 List<User>users=jdbctemplate.query(sql, new UserMapper());
	 return users.size()>0? users.get(0):null;
}

}
class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user=new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setMobile(rs.getString("phone"));
		return user;
	}

}