<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>��� �о߿� �����ϰ� �ͳ���?</h1>
<form action="${contextPath}/clubreco/surveysubmit5" method="post">
<input type="radio" name="selectedclub" value="language">���
<input type="radio" name="selectedclub" value="startup">������/â��
<input type="radio" name="selectedclub" value="study">�����й�
<input type="radio" name="selectedclub" value="it">IT
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>