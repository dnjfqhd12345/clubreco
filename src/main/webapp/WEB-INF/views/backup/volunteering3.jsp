<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>나는 편견이 있는 편인가요?</h1>
<form action="${contextPath}/clubreco/surveysubmit13" method="post">
<input type="radio" name="selectedclub" value="yes" checked="checked">예
<input type="radio" name="selectedclub" value="no">아니오
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>


</body>
</html>