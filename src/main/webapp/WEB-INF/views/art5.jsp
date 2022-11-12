<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>뭐가 가장 끌리나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit10" method="post">
<input type="radio" name="selectedclub" value="theater" checked="checked">연극
<input type="radio" name="selectedclub" value="magic">마술  
<input type="radio" name="selectedclub" value="edit">영상편집
<input type="radio" name="selectedclub" value="boardgame">보드게임
<input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>