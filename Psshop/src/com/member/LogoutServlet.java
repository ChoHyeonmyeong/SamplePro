package com.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 HttpSession session = request.getSession();
		 MemberDTO dto = 
				 (MemberDTO)session.getAttribute("login");
		 String nextPage = "";
		 if(dto == null) {
			 session.setAttribute("mesg", "로그인이 필요합니다.");    
			 nextPage="LoginUIServlet";
			 session.setMaxInactiveInterval(5);
		 }else {
			 session.invalidate();
			 nextPage="home.jsp";
		 }

		 response.sendRedirect(nextPage);
		 
	}//

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
