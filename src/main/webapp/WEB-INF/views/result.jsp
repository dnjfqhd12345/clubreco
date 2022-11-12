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
<title>Insert title here</title>
</head>
<body>
<h1>동아리 추천 결과</h1>
<c:forEach items="${nameList}" var="name">
<tr align="center">
	<td><c:out value="${name.id}"/></td>
	<td>${name.id}</td>
</tr>
</c:forEach>

<c:forEach var="index" begin="1" end="10">
        <c:out value="${index}" />
</c:forEach>
</body>
</html>