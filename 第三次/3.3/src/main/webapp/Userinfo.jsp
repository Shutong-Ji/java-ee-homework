<%--
  Created by IntelliJ IDEA.
  User: 24508
  Date: 2021/6/7
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">


    <title> ${user.name} </title>

</head>
<!-- Static navbar -->
<!--content-->
<div class="row thumbnail">
    <div class="col-sm-4">

        <div class="caption center">
            <h3>${user.name}</h3>
            <p>ID：${user.id}</p>
            <p><a class="btn btn-danger btn-block" role="button" href="Login.jsp">Quit</a> </p>
        </div>
    </div>
    <div class="col-sm-8">
        <div class="caption">

        </div>

    </div>

</div>

<!--footer-->

</div>
</body>
</html>
