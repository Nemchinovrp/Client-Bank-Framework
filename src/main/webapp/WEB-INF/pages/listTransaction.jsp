<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="UTF-8">
    <style>
        <%@include file="/WEB-INF/css/bootstrap.css"%>
    </style>
    <title>Transaction</title>
</head>
<body>
<table class="table table-bordered table-hover">
    <thead class="thead-inverse">
    <tr>
        <th>Id</th>
        <th>Account</th>
        <th>Operation</th>
        <th>Amount</th>
        <th>Action</th>
    </tr>
    </thead>
    <c:forEach items="${transactions}" var="transaction">
        <tr>
            <td>${transaction.id}</td>
            <td>${transaction.idAccount}</td>
            <td>${transaction.operation}</td>
            <td>${transaction.amount}</td>
            <td><a href="${pageContext.request.contextPath}/Transaction/deleteTransaction/${transaction.id}">Delete</a>
            </td>

        </tr>
    </c:forEach>
</table>
<p>
    <a href="${pageContext.request.contextPath}/Transaction/addTransactionForm">Add Transaction</a>
</p>
</body>
</html>

