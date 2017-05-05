/**
 * 
 */
package com.runoob.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Refresh")
//扩展HttpServer类
public class Refresh extends HttpServlet
{
	public void doGet(HttpServletRequest request,
			          HttpServletResponse response)
	                  throws ServletException, IOException
	{
		//设置刷新自动加载时间
		response.setIntHeader("Refresh", 1);
		//设置相应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		//使用默认时区和语言环境获得一个日历
		Calendar cale = Calendar.getInstance();
		Date tasktime = cale.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = df.format(tasktime);
		PrintWriter out = response.getWriter();
		String title = "自动刷新 Header 设置 - 菜鸟教程实例";
	      String docType =
	      "<!DOCTYPE html>\n";
	      out.println(docType +
	        "<html>\n" +
	        "<head><title>" + title + "</title></head>\n"+
	        "<body bgcolor=\"#f0f0f0\">\n" +
	        "<h1 align=\"center\">" + title + "</h1>\n" +
	        "<p>当前时间是：" + nowTime + "</p>\n");
	  }
	  // 处理 POST 方法请求的方法
	  public void doPost(HttpServletRequest request,
	                     HttpServletResponse response)
	      throws ServletException, IOException {
	     doGet(request, response);
	  }
}

