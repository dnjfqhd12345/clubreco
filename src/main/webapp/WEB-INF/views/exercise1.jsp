<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떠한 형태의 구기종목을 선호하나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit3" method="post">
<input type="radio" name="selectedclub" value="cooper" checked="checked">나는 다수의 사람들과 협력하는 것을 즐긴다.
<input type="radio" name="selectedclub" value="compete">나는 상대방과 경쟁하는 것을 즐긴다.
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

</body>
</html>