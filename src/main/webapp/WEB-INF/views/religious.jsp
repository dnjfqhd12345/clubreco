<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>� ������ �����ó���?</h1>
<form action="${contextPath}/clubreco/surveysubmit14" method="post">
<input type="radio" name="selectedclub" value="christian" checked="checked">�⵶��
<input type="radio" name="selectedclub" value="buddhism">�ұ�
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>