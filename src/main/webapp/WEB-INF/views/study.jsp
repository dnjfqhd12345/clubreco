<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떠한 분야에 도전하고 싶나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit5" method="post">
<input type="radio" name="selectedclub" value="language">언어
<input type="radio" name="selectedclub" value="startup">공모전/창업
<input type="radio" name="selectedclub" value="study">순수학문
<input type="radio" name="selectedclub" value="it">IT
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>