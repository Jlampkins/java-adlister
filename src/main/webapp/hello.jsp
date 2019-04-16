<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<nav>This is our navbar</nav>
<h2> Hello <%= name %>!</h2>
<%@ include file="partials/navbar.jsp" @%>

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
