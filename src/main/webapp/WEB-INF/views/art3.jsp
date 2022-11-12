<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떠한 종류의 무대를 꾸며보고 싶나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit8" method="post">
<input type="radio" name="selectedclub" value="instrument" checked="checked">악기
<input type="radio" name="selectedclub" value="dance">춤
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>