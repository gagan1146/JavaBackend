package in.gs.backend;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name1 = req.getParameter("name1");
        String password1 = req.getParameter("password1");

        if ("gagan sharma".equals(name1) && "12345".equals(password1)) {

            req.setAttribute("name1", name1);

            RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
            rd.forward(req, resp);

        } else {
            resp.setContentType("text/html");
            resp.getWriter().print(
                "<h3 style='color:red'>Email id or password didn't match</h3>"
            );

            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, resp);
        }
    }
}
