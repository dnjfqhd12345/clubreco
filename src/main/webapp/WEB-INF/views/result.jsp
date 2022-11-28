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
<meta charset="UTF-8">
<title>전남대학교 동아리 추천 어플리케이션</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" 
    rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css"> 
</head>
<body>
<div>
<section id = "main" class="mx-auto mt-5 pt-5 px-5 py-5">
<h3>${username} 님의 동아리 추천 결과</h3>
<div class="col-6 mx-auto">
  <img src="${pageContext.request.contextPath}/resources/img/04.png" class="img-fluid pt-3">
</div>
<div class="mt-4">
<c:forEach items="${nameList}" var="name">
<tr align="center" class="table-light">
	<td><ol>${name.id}</ol></td>
	<br>
</tr>
</c:forEach>
</div>
</body>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/main.css">

</html>