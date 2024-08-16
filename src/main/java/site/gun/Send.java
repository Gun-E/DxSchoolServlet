package site.gun;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

@WebServlet(urlPatterns = "/send")
public class Send extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommonPeople commonPeople = new CommonPeople();
        HashMap<String, String> person = commonPeople.getPerson();
        String client_ip = request.getRemoteHost();
        String name = person.get(client_ip);
        if (name != null && !name.isEmpty()) {
            System.out.print(person.get(client_ip) + " : ");
        }
        String data = request.getParameter("data");
        System.out.println(data);
        response.sendRedirect("get?data=" + URLEncoder.encode(data, StandardCharsets.UTF_8));
    }
}
