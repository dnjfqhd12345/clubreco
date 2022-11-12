<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떤 종교를 믿으시나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit14" method="post">
<input type="radio" name="selectedclub" value="christian" checked="checked">기독교
<input type="radio" name="selectedclub" value="buddhism">불교
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>