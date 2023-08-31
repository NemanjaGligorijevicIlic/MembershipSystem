<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Members</title>
    <style>
        /* Center-align the content */
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
        }

        button {
            padding: 10px 20px;
            background-color: #007bff; /* Blue color */
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-align: center;
            display: inline-block;
        }

        /* Add space between button and table */
        table {
            margin-top: 80px;
        }
    </style>
</head>
<body>
<h1>All Members</h1>
<p>Total Members: <c:out value="${members.size()}" /></p>
<table border="1">
    <tr>
        <th>Member ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Description</th>
    </tr>
    <c:forEach var="member" items="${members}">
        <tr>
            <td>${member.memberId}</td>
            <td>${member.firstName}</td>
            <td>${member.lastName}</td>
            <td>${member.description}</td>
        </tr>
    </c:forEach>
</table>
<button onclick="window.location.href='goToFirstPage'">Go to first page</button>
</body>
</html>
