package site.gun.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        // 초기화 코드, 필요한 경우
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>" + message + "</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        // 정리 코드, 필요한 경우
    }
}
