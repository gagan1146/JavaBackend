package in.sp.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sp.dbcon.DbConnection;

@WebServlet("/regForm")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        String myName = req.getParameter("name");
        String myUserName = req.getParameter("uname");
        String myAge = req.getParameter("age");
        String myCity = req.getParameter("city");
        String myMobileNo = req.getParameter("mob");
        String myPassword = req.getParameter("pswd");

        Connection connection = null;
        PreparedStatement pStatement = null;

        try {
            connection = DbConnection.getConnection();

            String sql =
              "INSERT INTO REGISTER(name, username, age, city, mobile, password) VALUES (?,?,?,?,?,?)";

            pStatement = connection.prepareStatement(sql);

            pStatement.setString(1, myName);
            pStatement.setString(2, myUserName);
            pStatement.setString(3, myAge);
            pStatement.setString(4, myCity);
            pStatement.setString(5, myMobileNo);
            pStatement.setString(6, myPassword);

            int count = pStatement.executeUpdate();

            if (count > 0) {
                req.setAttribute("msg", "User Registered Successfully");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.forward(req, resp);
            } else {
                req.setAttribute("msg", "Registration Failed");
                RequestDispatcher rd = req.getRequestDispatcher("/register.html");
                rd.forward(req, resp);
            }

        } catch (Exception e) {
            e.printStackTrace(); // 🔴 MUST
        } finally {
            try {
                if (pStatement != null) pStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
