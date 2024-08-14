package site.gun;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Ex01_request", urlPatterns = "/Ex01_request")
public class Ex01_request extends HttpServlet {

    // service 메소드 : java의 main메소드와 같은 역할
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Servlet  : Java기반의 웹 어플리케이션 프로그래밍 기술
        //         : .java확장자, HttpServlet클래스를 상속 받는다
        //          : Client의 요청에 동적으로 작동하고 HTML문서로 응답한다

        // 1. request객체 : client가 요청을 했을 때, 요청에 대한 정보를 담고 있는 객체
        //     ex) 요청이 들어온 주소, 요청을 할 때 필요한 데이터(id, pw등)

        // 실습1. 내 servlet(페이지)를 요청한 ip주소 확인하기
        // 내 ip주소 확인 : cmd -> ipconfig -> IPv4주소

        String client_ip = request.getRemoteHost();
        String hyo = "192.168.219.70";
        String dong = "192.168.219.69";
        String yun = "192.168.219.74";

        System.out.println(client_ip);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if(client_ip.equals(hyo) || client_ip.equals(dong) || client_ip.equals(yun)){
            out.println("<html>");
            out.println("<head>");
            out.println("<title>강건 사이트</title>");
            out.println("<style>");
            out.println("h1 {color: #bcf552;}");
            out.println("h2 {color: #f552ed;}");
            out.println("h3 {color: #f5b452;}");
            out.println("h4 {color: #52f5e7;}");
            out.println("h5 {color: #b452f5;}");
            out.println("h5 {color: #b452f5;}");
            out.println("div {padding: 24px;margin: 7px;background: #000000;color: #ffffff;opacity: 1;}");
            out.println("div:hover {background: white;color: black;transform: translateX(4cm);transition: opacity 0.3s ease, transform 0.3s ease,background 1s ease;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div><h1>안녕하세요!</h1></div>");
            out.println("<div><h2>안녕하세요!</h2></div>");
            out.println("<div><h3>안녕하세요!</h3></div>");
            out.println("<div><h4>안녕하세요!</h4></div>");
            out.println("<div><h5>안녕하세요!</h5></div>");
            out.println("<div><img src='./images/my-image.png' alt='My Image' /></div>");
            out.println("</body>");
            out.println("</html>");
        }
        else {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>에러 사이트</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div><h1>잘못 들어왔습니다.</h1></div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}

