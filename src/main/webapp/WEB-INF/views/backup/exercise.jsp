<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>� ������ ��� �����Ͻó���?</h1>
<form action="${contextPath}/clubreco/surveysubmit2" method="post">
<input type="radio" name="selectedclub" value="ball" checked="checked">���� ���� ������ ���� �ʴ´�.
<input type="radio" name="selectedclub" value="body">���� �������� �ʹ�.
<input type="radio" name="selectedclub" value="leisure">��� ���ؼ� ���� �Ƴ��� �ʴ´�.
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

</body>
</html>