package com.face.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBo;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * Action Servlet implementation class to perform user registration
 * date 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec ->action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name= request.getParameter("name");
		String email=request.getParameter("emil");
		String dob= request.getParameter("dob");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		
		RegisterBo regbo= new RegisterBo();
		regbo.setName(name);
		regbo.setEmail(email);
		regbo.setDob(dob);
		regbo.setAddress(address);
		regbo.setPassword(password);
		
		ConnectionManager con=new ConnectionManager();
		
		try {
			RegisterDAO.save(con.getConnection(),regbo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}
	

}
