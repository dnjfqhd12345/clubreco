<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>��� ������ ���������� ��ȣ�ϳ���?</h1>
<form action="${contextPath}/clubreco/surveysubmit3" method="post">
<input type="radio" name="selectedclub" value="cooper" checked="checked">���� �ټ��� ������ �����ϴ� ���� ����.
<input type="radio" name="selectedclub" value="compete">���� ����� �����ϴ� ���� ����.
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

</body>
</html>