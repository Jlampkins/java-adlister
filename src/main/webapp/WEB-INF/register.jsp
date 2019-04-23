
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register a new User"/>
    </jsp:include>
</head>
<body>
    <div class="container">
        <h1>Register a new User</h1>
        <form method="post" action="/register">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" class="form-control" type="text" name="username">
            </div>
            <div class="form-group">
                <label for="email">Email Address</label>
                <input id="email" class="form-control" type="email" name="email">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" class="form-control" type="password" name="password">
            </div>

            <button type="submit" class="btn btn-block btn-primary">Submit me!</button>
        </form>
    </div>

</body>
</html>
