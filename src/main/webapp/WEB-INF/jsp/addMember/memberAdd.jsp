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
    <input type="hidden" name="memberId" value="${member.memberId}" />
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
<p id="errorMessage" class="hidden">${errorMessage}</p>
<button onclick="window.location.href = 'goToFirstPage'">Go to start</button>
<script>
    // Display error message if present
    var errorMessage = document.getElementById("errorMessage");
    if (errorMessage.textContent.trim() !== "") {
        errorMessage.classList.remove("hidden");
    }
</script>
<button onclick="window.location.href = 'goToFirstPage'">Go to first page</button>
</body>
</html>