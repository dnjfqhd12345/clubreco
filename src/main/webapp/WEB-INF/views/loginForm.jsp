<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="${contextPath}/clubreco/test/login.do">
		<tr>
			<td>아이디 <input type="text" name="userID" size="10"></td>
		</tr>
		<tr>
			<td>이름 <input type="text" name="userName" size="10"></td>
		</tr>	
		<input type="submit" value="로그인">
</form>

</body>
</html>