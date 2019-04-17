<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <%@ include file="/partials/head.jsp"%>
    </head>
    <body>
    <%@ include file="/partials/navbar.jsp"%>
<div class = "container">
    <table class="table table-striped table-dark">
        <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Description</th>
        </tr>
<c:forEach var="ad" items="${ads}">
        </thead>
        <tbody>
        <tr>
            <td>${ad.title}</td>
            <td>${ad.description}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>





        <%--<table class="table table-dark">--%>
            <%--<th>Title</th>--%>
            <%--<th>Description</th>--%>
            <%--<c:forEach var="ad" items="${ads}">--%>
                <%--<tr>--%>
                    <%--<td>${ad.getTitle()}</td>--%>
                    <%--<td>${ad.getDescription()}</td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>
        <%--</table>--%>
    </body>
</html>
