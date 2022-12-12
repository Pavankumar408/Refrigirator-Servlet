package com.project.refrigirator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lgservlet  extends HttpServlet{
	public lgservlet() {
	System.out.println("object is created"+this.getClass().getName());
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("lgservlet.service()");
		response.setContentType("text/html");
		String brand=request.getParameter("brand");
		String color=request.getParameter("color");
		String price=request.getParameter("price");
		System.out.println("details of LG refrigirator");
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
		System.out.println("price:"+price);
		PrintWriter writer=response.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("save is sucess for LG details");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
			
		
	}

}
