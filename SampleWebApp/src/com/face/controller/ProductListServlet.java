package com.face.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.face.bo.ProductBo;
import com.face.bo.UserAccount;
import com.face.dao.DBUtils;
import com.face.dao.MyUtils;
import com.face.dao.productdao;
import com.face.utility.MySQLConnUtils;


/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome to Product List Servlet");
		RequestDispatcher dispatcher //
        = this.getServletContext().getRequestDispatcher("/WEB-INF/views/product.jsp");
dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("welcome to product servlet do post");
				   String product = request.getParameter("product");
			       String quantity = request.getParameter("quantity");
			       String price = request.getParameter("price");
			       ProductBo bo=new ProductBo();
			       bo.setProduct(product);
			       bo.setQuantity(quantity);
			       bo.setPrice(price);
			       
			       MySQLConnUtils con=new MySQLConnUtils();
					try {
						productdao.save(con.getConnection(),bo);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
					

					
					response.sendRedirect(request.getContextPath() + "/productdisplay");
			       
			       
			           
			       }
	
	

}
