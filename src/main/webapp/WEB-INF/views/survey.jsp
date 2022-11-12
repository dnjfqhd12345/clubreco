<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>5가지 선택지 중에서 하나를 선택해주세요.</h1>
<form action="${contextPath}/clubreco/survey" method="post">
<input type="radio" name="selectedclub" value="exercise" checked="checked">운동
<input type="radio" name="selectedclub" value="study">학술
<input type="radio" name="selectedclub" value="art">문예
<input type="radio" name="selectedclub" value="volunteering">봉사
<input type="radio" name="selectedclub" value="religious">종교
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

</body>
</html>