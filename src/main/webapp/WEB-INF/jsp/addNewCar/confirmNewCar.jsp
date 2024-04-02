<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nemanjapeco
  Date: 2024-04-01
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm</title>
    <h1>Here are information about the car. Please check and submit or go back and change, if something is wrong!</h1>
</head>
<body>
<form:form modelAttribute="member">
    <table>
        <tr>
            <td>Firstname:</td>
            <td>${member.firstName}</td>
        </tr>
        <tr>
            <td>Lastname:</td>
            <td>${member.lastName}</td>
        </tr>
        <tr>
            <td>Description</td>
            <td>${member.description}</td>
        </tr>
        <tr>
            <td>MemberId</td>
            <td>${member.memberId}</td>
        </tr>
    </table>
</form:form>
<form:form modelAttribute="car" method="post" action="submitCar">

</form:form>

</body>
</html>
