<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������б� ���Ƹ� ��õ ���ø����̼�</title>
</head>
<body>
<h1>��� �о߿� ������ �ֳ���?</h1>
<form action="${contextPath}/clubreco/surveysubmit6" method="post">
<input type="radio" name="selectedclub" value="music" checked="checked">���� �� ����
<input type="radio" name="selectedclub" value="picture">�׸�
<input type="radio" name="selectedclub" value="trip">�ٸ� Ȱ���� ���� ģ���� ����� �ʹ� (����,ģ��)
  <input type="submit" value="����">
  <input type="reset" value="�ٽ� �Է�">
</form>

</body>
</html>