package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.GetCurrentDateTime;
import com.util.SimpleOTPGenerator;

/**
 * @author Rahul Moundekar
 */
@WebServlet("/OTPServletcontroller")
public class OTPServletcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mailId = request.getParameter("message");
		System.out.println("mail id : " + mailId);

		String otp = SimpleOTPGenerator.random(4);
		System.out.println("otp : " + otp);

		String date = GetCurrentDateTime.getCurrentDatetime();

		long s = System.currentTimeMillis();
		System.out.println("Starting time : " + s);

		HttpSession session = request.getSession();
		session.setAttribute("otp", otp);
		session.setAttribute("date", date);
		session.setAttribute("time", s);
		System.out.println("Date : " + date);
		
		
		//if u want to send sms and mail,  write here to apply sms and mail sending  code 

	}

}
