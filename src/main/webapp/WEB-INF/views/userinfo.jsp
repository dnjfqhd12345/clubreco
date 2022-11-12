<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>당신의 이름은?</h1>
<form action="${contextPath}/clubreco/userinfo" method="post">
    <input type="text" name="name" size="20"></input>
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>


</body>
</html>