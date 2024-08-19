package site.gun;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/room")
public class Room extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        int num = Integer.parseInt(request.getParameter("num"));
        String color = request.getParameter("color");
        System.out.println(num + color);
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Room</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Room</h1>");
        out.println("<table border=1 style='background:" + color + ";'>");

        out.println("<tr>");
        for (int i = 1; i <= num; i++) {
            out.println("<td>" + i + "</td>");
        }

        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
