<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="member">
    <h1>Here are information about the member</h1>
    <tr>
        <p>
            MemberId:
        <td>${member.memberId} </td>
        </p>
        <p>
            Firstname:
        <td>${member.firstName}</td>
        </p>

        <p>
            Lastname:
        <td>${member.lastName}</td>
        </p>

        <p>
            Description:
        <td>${member.description}</td>
        </p>

    </tr>
</form:form>
<button onclick="window.location.href='goToFirstPage'">Go to first page</button>
</body>
</html>
