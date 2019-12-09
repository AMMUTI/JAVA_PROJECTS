package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.face.dao.Displaydao;
import com.face.utility.MySQLConnUtils;


/**
 * Servlet implementation class ProductDisplayServlet
 */
@WebServlet("/productdisplay")
public class ProductDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to display");
//		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/productdisplay.jsp");
//dispatcher.forward(request, response);
		
		MySQLConnUtils con=new MySQLConnUtils();
		try {
			Displaydao d= new Displaydao();
			
					List<String> dataList =new ArrayList<String>();
				dataList=Displaydao.List(con.getConnection());
				
				 request.setAttribute("data", dataList);
				 RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/productdisplay.jsp");
				
				
				
		              dispatcher.forward(request, response);
			 
		              
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
