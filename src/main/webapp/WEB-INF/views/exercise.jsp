<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떤 종류의 운동을 좋아하시나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit2" method="post">
<input type="radio" name="selectedclub" value="ball" checked="checked">나는 공을 무서워 하지 않는다.
<input type="radio" name="selectedclub" value="body">나는 강해지고 싶다.
<input type="radio" name="selectedclub" value="leisure">운동을 위해서 돈을 아끼지 않는다.
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

</body>
</html>