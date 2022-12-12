package com.project.refrigirator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class voltas extends HttpServlet{
	public voltas() {
	System.out.println("object is created:"+this.getClass().getName());
	}
	@Override
	public void service(ServletRequest request, ServletResponse responce) throws ServletException, IOException {
		System.out.println("voltas.service()");
		responce.setContentType("text/html");
		String brand=request.getParameter("brand");
		String color=request.getParameter("color");
		String price=request.getParameter("price");
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
		System.out.println("price:"+price);
	PrintWriter writer=responce.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("save is sucess for voltas details");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		
	}

}
