<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="logout">
		<input type="submit" name="submit">
	</form>
	<h3>${logoutMsg}</h3>
	<h1>some thing shown here!</h1>
	
	 <form action="ListConnectedUsers" method="get">
                    <input type="hidden" name="username" value="<%=%>" />
                    <input type="submit" class="btn btn-default pull-left" value="Back"/>               
          </form>

</body>
</html>