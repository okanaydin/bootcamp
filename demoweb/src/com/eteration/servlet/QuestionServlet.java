package com.eteration.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eteration.entity.Question;
@WebServlet("/add")
public class QuestionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		
		String header = req.getParameter("header");
		String body = req.getParameter("body");
		System.out.println(header + " " + body);
		Question question = new Question();
		question.setHeader(header);
		question.setBody(body);
		question.setDate(new Date().toString());
		req.setAttribute("question", question);
		req.getRequestDispatcher("QuestionList.jsp").forward(req, resp);
	}
	
}
