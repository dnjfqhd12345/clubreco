<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>전남대학교 동아리 추천 어플리케이션</title>
</head>
<body>
<h1>${username} 님의 동아리 추천 결과</h1>
<c:forEach items="${nameList}" var="name">
<tr align="center">
	<td><ol>${name.id}</ol></td>
	<br>
</tr>
</c:forEach>

</body>
</html>