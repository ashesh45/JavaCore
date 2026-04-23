package com.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**

	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	

	}

	/**
	 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserService service = new UserServiceImpl();
        boolean status = service.login(username, password);

        if (status) {
            // Session create
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("Home.jsp");

        } else {
            request.setAttribute("message", "Invalid username or password");
            request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
        }
    }
		  
	}