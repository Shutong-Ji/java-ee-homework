<%@ page import="com.swufe.javaee.jsp.Counter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="BootStrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="BootStrap/js/bootstrap.min.js"></script><!//一般导入这两个 link是css，script是js!>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<a href="foo.jsp">Foo-Counter</a>
<br/>
<a href="counter.jsp">Counter</a>
<br/>
<a href="sameHobby.html">Find friends</a>
<br/>
<a href="el">Expression Language</a>
<br/>
<a href="jstl">JSTL</a>
</body>
</html>