<%--
  Created by IntelliJ IDEA.
  User: dxschool
  Date: 24. 8. 14.
  Time: 오후 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="send" method="post">
    <h3>강건 컴퓨터에게 채팅 전송하기</h3>
    <label>
        DATA :
        <input type="text" name="data">
    </label>
    <input type="submit" value="send">
    <p>보낸 메세지 : <%= request.getAttribute("data") %></p>
</form>

</body>
</html>
