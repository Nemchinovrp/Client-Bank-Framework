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
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Date of birth</th>
        <th>Registration Date</th>
        <th>Gender</th>
        <th>Role</th>
        <th>Action</th>
    </tr>
    </thead>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td>${user.dateOfBirth}</td>
            <td>${user.registrationDate}</td>
            <td>${user.gender}</td>
            <td>${user.role}</td>
            <td><a href="${pageContext.request.contextPath}/User/deleteUser/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="${pageContext.request.contextPath}/User/addUserForm">Add User</a>
</p>
<p>
    <a href="${pageContext.request.contextPath}/">Home</a>
</p>
</body>
</html>
