<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="room" method="post">
    <label for="num">방 개수 : </label>
    <input id="num" type="number" name="num" required>
    <label for="color">색깔 : </label>
    <input id="color" type="color" name="color" required>
    <button type="submit"> 확인</button>
</form>
</body>
</html>
