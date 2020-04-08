package com.gmail.ptimofejev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Survey", urlPatterns = {"/survey"})
public class SurveyServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender = req.getParameter("gender");
        boolean driver = (req.getParameter("driver") == null);

        PrintWriter pw1 = resp.getWriter();
        pw1.println("<html><head><title>Survey results</title></head>");
        pw1.println("<body><table border=\"1\"><caption>Here are the survey results</caption>");
        pw1.println("<tr><td>Name </td><td align=\"center\">" + name + "</td></tr>");
        pw1.println("<tr><td>Surname </td><td align=\"center\">" + surname + "</td></tr>");
        pw1.println("<tr><td>E-mail address </td><td align=\"center\">" + email + "</td></tr>");
        pw1.println("<tr><td>Age </td><td align=\"center\">" + age + "</td></tr>");
        pw1.println("<tr><td>Gender </td><td align=\"center\">" + gender + "</td></tr>");
        if (!driver) {
            pw1.println("<tr><td>Driver license </td><td align=\"center\">Yes</td></tr>");
        } else {
            pw1.println("<tr><td>Driver license </td><td align=\"center\">No</td></tr>");
        }
        pw1.println("</table></body></html>");
    }
}
