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
<p id="errorMessage" class="hidden" style="color: red;">
    <img id="errorImage" src="${pageContext.request.contextPath}/pictures/exclamation_mark.png" width="15" height="15" alt="Exclamation Mark">
    ${errorMessage}
</p>
<button onclick="window.location.href = 'goToFirstPage'">Go to start</button>
<script>
    // Display error message and image if present
    var errorMessage = document.getElementById("errorMessage");
    var errorImage = document.getElementById("errorImage");

    if (errorMessage.textContent.trim() === "") {
        errorMessage.style.display = "none"; // Hide the error message
        errorImage.style.display = "none";    // Hide the image
    } else {
        errorMessage.style.display = "block"; // Show the error message
        errorImage.style.display = "inline";  // Show the image
    }
</script>
<button onclick="window.location.href = 'goToFirstPage'">Go to first page</button>
</body>
</html>