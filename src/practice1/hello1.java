package practice1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello1
 */
@WebServlet("/hello1")

public class hello1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public hello1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 response.setContentType("text/html");  
		out.println("WELCOME TO SERVLET TWO");
	
	/* 	String usr=request.getParameter("username");
		String pass=request.getParameter("password");
		out.println("username is"+usr+ " password is "+pass);  */
		 RequestDispatcher rd=request.getRequestDispatcher("/practice1.html");  
		 rd.include(request,response);  
		
	}

}
