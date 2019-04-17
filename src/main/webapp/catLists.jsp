<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <table>
            <c:forEach var="cats" items="${cats}">
                <tr>
                <td>${cats.name}</td>
                <td>${cats.age}</td>
                <td><img src="${cats.picture}" width = 200px> </td>
                </tr>
                </c:forEach>
        </table>

    </body>
</html>
