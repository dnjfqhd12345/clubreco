<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>어떠한 분야에 관심이 있나요?</h1>
<form action="${contextPath}/clubreco/surveysubmit6" method="post">
<input type="radio" name="selectedclub" value="music" checked="checked">음악 및 공연
<input type="radio" name="selectedclub" value="picture">그림
<input type="radio" name="selectedclub" value="trip">다른 활동을 통해 친구를 만들고 싶다 (여행,친목)
  <input type="submit" value="제출">
  <input type="reset" value="다시 입력">
</form>

</body>
</html>