<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>��� ������ ���븦 �ٸ纸�� �ͳ���?</h1>
<form action="${contextPath}/clubreco/surveysubmit8" method="post">
<input type="radio" name="selectedclub" value="instrument" checked="checked">�Ǳ�
<input type="radio" name="selectedclub" value="dance">��
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

<h1>${msg} ${selectedclub}</h1>

</body>
</html>