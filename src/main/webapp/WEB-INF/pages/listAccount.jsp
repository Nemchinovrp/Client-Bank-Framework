<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="UTF-8">
    <style>
        <%@include file="/WEB-INF/css/bootstrap.css"%>
    </style>
    <title>User</title>
</head>
<body>
<table class="table table-bordered table-hover">
    <thead class="thead-inverse">
    <tr>
        <th>Id</th>
        <th>Account Type</th>
        <th>Currency</th>
        <th>Balance</th>
        <th>User</th>
        <th>Action</th>
    </tr>
    </thead>
    <c:forEach items="${accounts}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.accountType}</td>
            <td>${account.idCurrency}</td>
            <td>${account.balance}</td>
            <td>${account.usersId}</td>
            <td><a href="${pageContext.request.contextPath}/Account/deleteAccount/${account.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="Account/addAccountForm">Add Account</a>
</p>
</body>
</html>
