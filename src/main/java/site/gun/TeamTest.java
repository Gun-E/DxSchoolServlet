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
        String client_ip = request.getRemoteHost();
        HashMap<String,String> person = new HashMap<>();
        person.put("192.168.219.70" , "송효진");
        person.put("192.168.219.54" , "권동현");
        person.put("192.168.219.74" , "강윤서");
        person.put("192.168.219.77" , "지영은");
        person.put("192.168.219.49" , "박성일");
        person.put("192.168.219.60" , "박채연");
        person.put("192.168.219.67" , "최명준");
        person.put("192.168.219.42" , "이태화");
        person.put("192.168.219.66" , "기노홍");
        person.put("192.168.219.47" , "주진완");
        person.put("192.168.219.72" , "이혜람");
        person.put("192.168.219.52" , "임진호");
        person.put("192.168.219.75" , "김민지");
        person.put("192.168.219.76" , "서진환");


        System.out.println(person.get(client_ip)+"님 입장!");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(!person.get(client_ip).isEmpty()){
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
