<%--
  Created by IntelliJ IDEA.
  User: jameslampkins
  Date: 2019-04-17
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="cats/add">
    <label for="name">Gimmie dat cat name</label>
    <input id="name" type="text" name="name">
    <label for="age">Gimmie dat cat age</label>
    <input id="age" name="age" type="number">
    <label for="picture">Gimmie dat cat pic</label>
    <input id="picture" name="picture" type="text">
    <button>Gimmie dat cat</button>

</form>

</body>
</html>
