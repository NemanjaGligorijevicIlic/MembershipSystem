<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%; /* Adjust the width as needed */
            border: 1px solid #000; /* Add a 1px solid black border */
        }

        th, td {
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2; /* Gray background for table headers */
        }
    </style>
</head>
<body>
<h1>Car will be added to this member:</h1>
<form:form modelAttribute="member">
    <table>
        <tr>
            <th>Attribute</th>
            <th>Value</th>
        </tr>
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
<form:form modelAttribute="car">
    <table>
        <tr>
            <td></td>
        </tr>
    </table>
</form:form>
</body>
</html>
