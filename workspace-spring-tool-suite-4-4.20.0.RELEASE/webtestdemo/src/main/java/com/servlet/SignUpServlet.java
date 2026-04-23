package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;


@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.getRequestDispatcher("Signup.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String username = request.getParameter("username");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        
	        

	       User u = new User();
	       u.setUsername(username);
	       u.setEmail(email);
	       u.setPassword(password);
	       
	       
	       UserService service = new UserServiceImpl();
	       service.signup(u);
	       
	       //store signup data in db
	        request.getRequestDispatcher("LoginForm.jsp").forward(request,response);
	}

}
