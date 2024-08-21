package site.gun;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/user-info")
public class UserInfo extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String pwCheck = request.getParameter("pwCheck");
        String gender = request.getParameter("gender");
        String blood = request.getParameter("blood");
        String birthday = request.getParameter("birthday");
        String hobby = request.getParameter("hobby");
        String likeColor = request.getParameter("likeColor");
        String textPlus = request.getParameter("textPlus");

        System.out.println(id + " " + pw + " " + pwCheck + " " + gender + " " + blood + " " + birthday + " " + hobby + " " + likeColor + " " + textPlus);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Room</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>아이디 : " + id + "</p>");
        out.println("<p>비밀번호 : " + pw + "</p>");
        out.println("<p>비밀번호 확인 : " + pwCheck + "</p>");
        out.println("<p>성별 : " + gender + "</p>");
        out.println("<p>혈액형 : " + blood + "형</p>");
        out.println("<p>생일 : " + birthday + "</p>");
        out.println("<p>취미 : " + hobby + "</p>");

        out.println("<span>색깔 : " + likeColor + "</span> <span style=\"display: inline-block; width: 100px; height: 20px; background-color: " + likeColor + ";\"></span>");
        out.println("<p>하고싶은 말 : " + textPlus + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
