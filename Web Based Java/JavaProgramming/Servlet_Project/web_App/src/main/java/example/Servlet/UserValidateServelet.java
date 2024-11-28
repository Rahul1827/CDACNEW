package example.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.User;
import example.bean.UserValidator;

/**
 * Servlet implementation class UserValidateServelet
 */
@WebServlet(description = "Welcome to user Servelet", urlPatterns = { "/doValidate" })
public class UserValidateServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		//Capturing values of 2 request parameters : uid and pwd
		String userId=request.getParameter("uid");
		String password = request.getParameter("pwd");
		System.out.println(userId+" "+password);
		
		
		
		//Creating a user object based upon userId and password
		User currentUser= new User(userId,password);
		
		boolean valid =UserValidator.isValid(currentUser);
		
		String successResponse = "<h1 style='color:green'>Congratulations !!, You are In😍</h1>";
		
		String failureResponse = "<h1 style='color:Red'>Sorry , access denied due to invalid credentials.👺</h1>";
		
		if(valid)
		{
			
			out.println(successResponse);
			
		}
		else 
		{
			
			out.println(failureResponse);
		}
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
