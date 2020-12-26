package com.staragile;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWebApp extends HttpServlet {

	private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	         throws ServletException, IOException {
        	
        	PrintWriter out = resp.getWriter();
        	resp.setContentType("text/html");
        	
        	out.println("<html>");
        	out.println("<body bgcolor=\"Grey\">");
        	//out.println("<body bgcolor=\"Green\">");
        	out.println("<h1>Hello from Staragile</h1>");
        	
        	out.println("<h3>Demo Java Project for Staragile DevOps certification Jul-2020 from Prashant Beniwal Edited by Pawan Kumar</h3>");
        	
        	out.println("<p>A Random Number v1 : <strong>" + Math.random() + "</strong></p>");
           	
        	out.println("</body>");
        	out.println("</html>");   
        
        }


        public int add(int a, int b) {
            return a + b ;
        }

	public int sub(int a, int b) {
            return a - b;
        }
	public int mul(int a, int b) {
            return a * b ;
        }
}
