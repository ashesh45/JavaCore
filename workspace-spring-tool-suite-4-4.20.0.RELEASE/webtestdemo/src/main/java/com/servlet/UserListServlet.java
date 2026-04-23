package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class UserListServlet
 */
@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService service = new UserServiceImpl();
		request.setAttribute("ulist", service.getAllUsers());
		request.getRequestDispatcher("UserList.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
