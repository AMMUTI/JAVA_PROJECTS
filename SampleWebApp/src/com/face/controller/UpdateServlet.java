package com.face.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.ProductBo;
import com.face.dao.productdao;
import com.face.utility.MySQLConnUtils;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
System.out.println("welcome to update servlet");
RequestDispatcher dis=this.getServletContext().getRequestDispatcher("/WEB-INF/views/update.jsp");
	dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to update post method");
		String product = request.getParameter("product");
	       String quantity = request.getParameter("quantity");
	       String price = request.getParameter("price");
	       System.out.println(product+" "+quantity+" "+price+" ");
	       if(quantity==null)
	       {System.out.println("quantity is null");
	    	   
	       }
	       ProductBo bo=new ProductBo();
	       bo.setProduct(product);
	       bo.setQuantity(quantity);
	       bo.setPrice(price);
	       MySQLConnUtils con=new MySQLConnUtils();
	       try {
			productdao.update(con.getConnection(),bo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       response.sendRedirect(request.getContextPath() + "/productdisplay");
	}

}
