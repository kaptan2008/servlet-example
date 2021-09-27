package com.servlet.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Obtaining the Server Port
		System.out.println("Server Port: " + request.getServerPort());

		// Getting the Server Name
		System.out.println("Server Name: " + request.getServerName());

		// Getting the Protocol Used
		System.out.println("Protocol: " + request.getProtocol());

		// Character Encoding which is set
		System.out.println("Character Encoding: " + request.getCharacterEncoding());

		// Getting the Content Type
		System.out.println("Content Type: " + request.getContentType());

		// Getting the Remote Address
		System.out.println("Remote Address: " + request.getRemoteAddr());

		// Getting Remote Host
		System.out.println("Remote Host: " + request.getRemoteHost());

		// Obtaining the Scheme
		System.out.println("Scheme: " + request.getScheme());

		// Get all the parameters passed from index.jsp
		Enumeration<String> parameters = request.getParameterNames();
		while (parameters.hasMoreElements()) {
			String parameterName = (String) parameters.nextElement();
			System.out.println("Parameter Name: " + parameterName + " " + "Parameter Value: "
					+ request.getParameter(parameterName));
		}

		// Setting the request attribute
		request.setAttribute("requestAttribute1", "requestAttribute1");
		request.setAttribute("requestAttribute2", "requestAttribute2");

		// Retrieving all the request attributes
		Enumeration<String> attributes = request.getAttributeNames();
		while (attributes.hasMoreElements()) {
			String attribute = (String) attributes.nextElement();
			System.out.println("Attribute name: " + attribute);
			System.out.println("Attribute value: " + request.getAttribute(attribute));

		}

	}
}
