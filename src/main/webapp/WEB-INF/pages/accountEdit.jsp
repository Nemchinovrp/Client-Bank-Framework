<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" ; charset="UTF-8">
    <style>
        <%@include file="/WEB-INF/css/bootstrap.css"%>
    </style>
    <title>Add Account</title>
</head>
<body>
<div class="container" style="padding:150px 0">
    <div class="row">
        <div class="col-md-offset-5 col-md-10">
            <form  action="addAccount" method="post">
                <fieldset>
                    <div class="form-group">
                        <%--@declare id="id"--%><label for="id"> Id </label>
                        <input  type="text"  name="id" value="<c:out value="${account.id}"/>" placeholder="ID"/>
                    </div>
                    <div class="form-group">
                        <label>Account</label>
                        <select id='checkAccount' name='accountType'>
                            <option value='Credit'>CREDIT</option>
                            <option value='Debit'>DEBIT</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Currency</label>
                        <select id='check' name='idCurrency'>
                            <option value='1'>EUR</option>
                            <option value='2'>USD</option>
                            <option value='3'>RUB</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <%--@declare id="balance"--%><label for="balance">Balance</label>
                        <input type="text" name="balance" value="<c:out value="${account.balance}"/>" placeholder="balance"/>
                    </div>
                    <div class="form-group">
                        <%--@declare id="usersId"--%><label for="usersId">User</label>
                        <input  type="text" name="usersId" value="<c:out value="${account.usersId}"/>" placeholder="user"/>
                    </div>
                    <div>
                        <button type="submit" class="btn-success" >Save Account</button>
                    </div>
                </fieldset>

            </form>
        </div>
    </div>
</div>
</body>
</html>
