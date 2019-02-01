package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AutoServlet")
public class AutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
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
		
		if(uid.equalsIgnoreCase("admin") && pass.equals("admin")) {
			out.println("Login is Successful!!! YAYY!");
		}
		else {
			out.println("Dont try to hack!!!!");
		}
		
		
	}

}
