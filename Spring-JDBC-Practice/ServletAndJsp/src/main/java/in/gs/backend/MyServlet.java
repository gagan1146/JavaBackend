package in.gs.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name1 = req.getParameter("name1");
		String email1 = req.getParameter("email1");
		
		PrintWriter out = resp.getWriter();
		out.print("Login Successfully\n");
		out.print("Name : " + name1 + "               ");
		out.print("Email : " + email1);
	}
}
