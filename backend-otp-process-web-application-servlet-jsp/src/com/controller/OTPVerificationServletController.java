package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.util.GetCurrentDateTime;

/**
 * @author Rahul Moundekar
 */
@WebServlet("/OTPVerificationServletController")
public class OTPVerificationServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String startingDate = (String) session.getAttribute("date");
		String otp = (String) session.getAttribute("otp");
		Long startingTime = (Long) session.getAttribute("time");

		String currentDate = GetCurrentDateTime.getCurrentDatetime();
		String currentOTP = request.getParameter("message");

		PrintWriter pw = response.getWriter();
		if (startingDate.compareTo(currentDate) > 0) {
			System.out.println("Date1 is after Date2");
			pw.print("<a href='#'>Resend Otp</a>");
		} else if (startingDate.compareTo(currentDate) < 0) {
			System.out.println("Date1 is before Date2");
			Long minTime = System.currentTimeMillis() - startingTime;
			System.out.println(minTime);
			if ((minTime) > 300000) {
				pw.println("Time out!");
			} else if (!currentOTP.equals(otp)) {
				pw.println("Incorrect OTP!");
			} else {
				pw.println("Logged In!");
			}
		} else if (startingDate.compareTo(currentDate) == 0) {
			System.out.println("Date1 is equal to Date2");
			pw.print("<a href='#'>Resend Otp</a>");
		} else {
			System.out.println("How to get here?");
		}

	}

}
