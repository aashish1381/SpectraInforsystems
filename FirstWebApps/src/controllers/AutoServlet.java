package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MyDao;


@WebServlet("/AutoServlet")
public class AutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AutoServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<h1> Hey, I'm directly using the servlet class</h1>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
		String pass=request.getParameter("password");
		
		MyDao m=new MyDao();
		 int y=m.loginCheck(uid,pass);
		 if(y==1) {
			 HttpSession session=request.getSession();
				session.setMaxInactiveInterval(30000);
				session.setAttribute("uid",uid);
			 response.sendRedirect("AdminHome.jsp");
		 }
		 else {
			 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			 request.setAttribute("msg"," Login failed! Are you stupid or something ?");
			 rd.forward(request, response);
		 
		 
		
	
		
	}

}
}
