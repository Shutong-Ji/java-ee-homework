package com.example.HW5_3;

import com.example.HW5_3.User.UserManagement;
import com.example.HW5_3.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");

        try {
            // Hint: what if this id is not found?
            User user= UserManagement.getUserByName(name);
            request.setAttribute("user", user);
            request.getRequestDispatcher("Userinfo.jsp").forward(request, response);
        } catch (NumberFormatException e) {

        }
    }
}
