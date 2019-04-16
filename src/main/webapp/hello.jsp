<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int counter = 0; %>
<% counter += 1; %>
<% String name = "Zion"; %>
<%@ include file="partials/bootstrap.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>The current count is <%= counter %>.</h1>
<h2> Hello <%= name %>!</h2>
<%@ include file="partials/navbar.jsp" %>




<c:forEach var="i" begin="1" end="30">
    <c:choose>
        <c:when test="${i % 15 == 0}">
            Fizzbuzz<br>
        </c:when>
        <c:when test="${i % 3 == 0}">
            Fizz<br>
        </c:when>
        <c:when test="${i % 5 == 0}">
            Buzz<br>
        </c:when>
        <c:otherwise>
            ${i}<br>
        </c:otherwise>
    </c:choose>
</c:forEach>

View the page source!

Dad?

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
