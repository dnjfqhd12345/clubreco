<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>���� ����� �ִ� ���ΰ���?</h1>
<form action="${contextPath}/clubreco/surveysubmit13" method="post">
<input type="radio" name="selectedclub" value="yes" checked="checked">��
<input type="radio" name="selectedclub" value="no">�ƴϿ�
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>


</body>
</html>