<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<style>
		<%@include file="/WEB-INF/css/bootstrap.css"%>
	</style>
</head>
<body>
	<h1>Client-Bank-Framework</h1>
	<a href="${pageContext.request.contextPath}/User">Список пользователей</a>
	<br>
	<a href="${pageContext.request.contextPath}/Account">Список счетов</a>
	<br>
	<a href="${pageContext.request.contextPath}/Transaction">Список транзакций</a>

</body>
</html>