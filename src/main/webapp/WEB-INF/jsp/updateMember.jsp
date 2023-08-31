<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Member</title>
</head>
<body>
<form:form modelAttribute="member" method="post" action="saveUpdatedMember">
    <h1>Update Member Information</h1>
    <table>
        <tr>
            <td>MemberId:</td>
            <td><form:input path="memberId" readonly="true"/></td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><form:input path="description"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save"></td>
        </tr>
    </table>
</form:form>
<button onclick="window.location.href='goToFirstPage'">Go to first page</button>
</body>
</html>
