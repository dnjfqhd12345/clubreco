<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>5���� ������ �߿��� �ϳ��� �������ּ���.</h1>
<form action="${contextPath}/clubreco/survey" method="post">
<input type="radio" name="selectedclub" value="exercise" checked="checked">�
<input type="radio" name="selectedclub" value="study">�м�
<input type="radio" name="selectedclub" value="art">����
<input type="radio" name="selectedclub" value="volunteering">����
<input type="radio" name="selectedclub" value="religious">����
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

</body>
</html>