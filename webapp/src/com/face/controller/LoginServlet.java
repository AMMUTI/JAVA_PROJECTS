package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;

import com.face.util.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside login servlet");
		response.setContentType("text/html");
		String email= request.getParameter("email");
		String password=request.getParameter("password");
		LoginBO b=new LoginBO();
		b.setEmail(email);
		b.setPassword(password);
ConnectionManager con=new ConnectionManager();
		
		try {
			boolean status=LoginDAO.save(con.getConnection(),b);
			
			if(status==true) {
				
				
				
//				other way
//				try {
//			request.setAttribute("user", LoginDAO.get(b.getName()));
//				}
//				catch(Exception e) {
//					e.printStackTrace();
//				}
//				RequestDispatcher dispatcher= request.getRequestDispatcher("/welcome.jsp");
//				if (dispatcher != null){
//		              dispatcher.forward(request, response);
//
//		              }
//		            
//		         
//			}
//			else {
//				response.sendRedirect(request.getContextPath() + "/login.jsp");
//			}
//				end of the second way
			
			
			
				List<String> dataList =new ArrayList<String>();
				dataList.add(b.getName());
				 dataList.add(b.getEmail());
				 dataList.add(b.getDob());
				 dataList.add(b.getAddress());
				 request.setAttribute("data", dataList);
				RequestDispatcher dispatcher= request.getRequestDispatcher("/welcome.jsp");
				//response.sendRedirect(request.getContextPath() + "/welcome.jsp");
				
				if (dispatcher != null){
		              dispatcher.forward(request, response);
//		              response.sendRedirect(request.getContextPath() + "/home.jsp");
		              }
		            
		         
			}
			else {
				response.sendRedirect(request.getContextPath() + "/login.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.sendRedirect(request.getContextPath() + "/register.jsp");
	}
		
}
