<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show the member</title>
</head>
<body>
<h1>Show the member</h1>
<form:form modelAttribute="member">
<table>
    <tr>
        <div>
            Member id: <form:input path="memberId"/>
        </div>

    </tr>
    <tr>
        <td colspan="1">
            <input type="submit" value="Find">
        </td>
    </tr>
</table>
</form:form>
<button onclick="window.location.href='goToFirstPage'">Go to first page</button>
<body/>
<html/>