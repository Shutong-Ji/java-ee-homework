package com.example.HW5_3;

import com.example.HW5_3.User.UserCheck;
import com.example.HW5_3.User.UserManagement;
import com.example.HW5_3.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("user");//从login.jsp中取的
        String password = request.getParameter("pwd");

        if(UserCheck.checkUserLogin(username,password)){
            User user=UserManagement.getUserByName(username);
            int id=user.getId();
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("id", id);
            response.sendRedirect("user");//userservlet
        }
        else {
            response.sendRedirect("login-error.jsp");
        }
        return;
    }
}
