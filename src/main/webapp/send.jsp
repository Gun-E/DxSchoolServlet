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
