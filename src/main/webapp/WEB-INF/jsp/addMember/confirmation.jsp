<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation that new member is added in database</title>
</head>
<body>
<form:form modelAttribute="member">
    <h1>Receipt</h1>
    <h1>You have added a new member. Here is the data.</h1>
    <table>
        <tr>
            <td>Member ID:</td>
            <td>${member.memberId}</td>
        </tr>
        <tr>
            <td>Firstname:</td>
            <td>${member.firstName}</td>
        </tr>
        <tr>
            <td>Lastname:</td>
            <td>${member.lastName}</td>
        </tr>
        <tr>
            <td>Description:</td>
            <td>${member.description}</td>
        </tr>

    </table>
</form:form>
<button onclick="window.location.href='goToFirstPage'">Go to first page</button>
</body>
</html>
