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
<div class="container" style="padding:150px 0">
    <div class="row">
        <div class="col-md-offset-5 col-md-10">
            <form action="addTransaction" method="post">
                <fieldset>
                    <div class="form-group">
                        <%--@declare id="id"--%><label for="id">Id</label>
                        <input type="text" name="id" value="<c:out value="${transaction.id}"/>" placeholder="ID"/>
                    </div>
                    <div class="form-group">
                        <%--@declare id="idAccount"--%><label for="idAccount">Account</label>
                        <input type="text" name="idAccount" value="<c:out value="${transaction.idAccount}"/>"
                               placeholder="idAccount"/>
                    </div>
                    <div class="form-group">
                        <%--@declare id="operation"--%><label for="operation">Operation</label>
                        <input type="text" name="operation" value="<c:out value="${transaction.operation}"/>"
                               placeholder="operation"/>
                    </div>
                    <div class="form-group">
                        <%--@declare id="amount"--%><label for="amount">Amount</label>
                        <input type="text" name="amount" value="<c:out value="${transaction.amount}"/>"
                               placeholder="amount"/>
                    </div>
                    <div>
                        <button type="submit" class="btn-success">Add Transaction</button>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
