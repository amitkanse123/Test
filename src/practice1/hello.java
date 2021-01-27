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
 * Servlet implementation class hello
 */
@WebServlet("/practice")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* PrintWriter out=response.getWriter();
		String usr=request.getParameter("username");
		String pass=request.getParameter("password");
		*/
		 response.setContentType("text/html");  
	
		MyDatabaseOperations obj=new MyDatabaseOperations();
		PrintWriter out=response.getWriter();
		String usr=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(obj.validate(usr, pass))
		{
			out.println("username is"+usr+ " password is "+pass); 
			RequestDispatcher d=request.getRequestDispatcher("hello1");
		//	d.include(request, response);
			d.forward(request, response);
			
		}
		else
		{
			  out.print("Sorry username or password error"); 
			  
		        RequestDispatcher rd=request.getRequestDispatcher("/practice.html");  
		        rd.include(request,response);  
			
		}
		
		
	}

}
