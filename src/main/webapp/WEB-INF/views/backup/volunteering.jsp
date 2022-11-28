<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>누구에게 도움의 손길을 주고 싶나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit11" method="post">
<input type="radio" name="selectedclub" value="people" checked="checked">사람
<input type="radio" name="selectedclub" value="animal">동물
<input type="radio" name="selectedclub" value="social">환경 및 사회공간
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

</body>
</html>