package com.face.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.ProductBo;
import com.face.dao.Deteletdao;
import com.face.dao.Displaydao;
import com.face.dao.productdao;
import com.face.utility.MySQLConnUtils;

/**
 * Servlet implementation class DeleteproductServlet
 */
@WebServlet("/deleteproduct")
public class DeleteproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteproductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to delete product servlet");
		RequestDispatcher dispatcher //
        = this.getServletContext().getRequestDispatcher("/WEB-INF/views/delete_product.jsp");
dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product = request.getParameter("product");
		System.out.println(product);
		MySQLConnUtils con=new MySQLConnUtils();
		ProductBo bo=new ProductBo();
	       bo.setProduct(product);
	       try {
			Displaydao.delete(con.getConnection(),bo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       response.sendRedirect(request.getContextPath() + "/productdisplay");
	}

}
