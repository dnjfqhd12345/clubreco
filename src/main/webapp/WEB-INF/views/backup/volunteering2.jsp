<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>��� ������ �Բ� �ϰ� �ͳ���?</h1>
<form action="${contextPath}/clubreco/surveysubmit12" method="post">
<input type="radio" name="selectedclub" value="child" checked="checked">���̵�
<input type="radio" name="selectedclub" value="student">û�ҳ�
<input type="radio" name="selectedclub" value="old">���� �� �����
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

</body>
</html>