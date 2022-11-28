<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떠한 사람들과 함께 하고 싶나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit12" method="post">
<input type="radio" name="selectedclub" value="child" checked="checked">아이들
<input type="radio" name="selectedclub" value="student">청소년
<input type="radio" name="selectedclub" value="old">노인 및 장년층
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

</body>
</html>