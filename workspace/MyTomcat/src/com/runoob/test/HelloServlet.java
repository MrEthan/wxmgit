package com.runoob.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
       
	public void init() throws ServletException
	{
		//��ʼ��
		message = "Hello world!";
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) 
				   throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.setCharacterEncoding("GBK");
		response.setContentType("text/html");
		//ʵ�ʵ�ҵ���߼�������
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void destory()
	{
		//do nothing
	}

}
