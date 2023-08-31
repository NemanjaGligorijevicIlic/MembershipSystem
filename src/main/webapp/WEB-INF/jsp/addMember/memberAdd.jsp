<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a new member</title>
</head>
<body>
<h1>Add a new member</h1>
<form:form modelAttribute="member" action="sendToCheck">
    <table>
        <tr>
            <div>
                Firstname: <form:input path="firstName"/>
            </div>
            <div>
                Lastname: <form:input path="lastName"/>
            </div>
            <div>
                Description: <form:input path="description"/>
            </div>
        </tr>
        <tr>
            <td colspan="3"> <input type="submit" value="Confirm">
            </td>
        </tr>
    </table>
</form:form>
<c:if test="${not empty errorMessage}">
    <p>${errorMessage}</p>
</c:if>
<button onclick="window.location.href = 'goToFirstPage'">Go to first page</button>
</body>
</html>