<%@ page contentType="text/html;charset=utf-8" language="java" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<title>error page</title>
</head>
<body>
this is error page!
<div><% exception.getMessage();%></div>
<div><% exception.printStackTrace();%></div>
</body>
</html>