package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Myservlet
 */

public class MyServlet implements Servlet {

	private ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		this.config = config;
		System.out.println("iniside init method : " + config.getServletName());
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		System.out.println("inside service method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<b> Servlet Interface Example</b>");
		out.print("</body></html>");

	}

	@Override
	public String getServletInfo() {

		return "Demonstrated implementaton of Servlet interface";
	}

	@Override
	public void destroy() {
		System.out.println("inside destroy method");

	}

}
