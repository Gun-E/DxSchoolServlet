package site.gun;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(urlPatterns = "/team-test")
public class TeamTest extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommonPeople commonPeople = new CommonPeople();
        HashMap<String, String> person=commonPeople.getPerson();

        String client_ip = request.getRemoteHost();
        String name = person.get(client_ip);
        System.out.println(client_ip);
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if(name != null && !name.isEmpty()){
            System.out.println(person.get(client_ip)+"님 입장!");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>강건 사이트</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div><h1>"+ person.get(client_ip) +"님 안녕하세요!</h1></div>");
            out.println("</body>");
            out.println("</html>");
        }
        else {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>에러 사이트</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\"color: red\"><h1>다른팀</h1></div>");
            out.println("<div style=\"color: red\"><h1>잘못 들어왔습니다.</h1></div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
