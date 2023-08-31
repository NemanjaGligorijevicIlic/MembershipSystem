<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form:form modelAttribute="member" method="post" action="submitMember">
  <h1>Here are information about the member. Please check and submit or go back and change, if something is wrong!</h1>
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
      <td>Description:</td>
      <td>${member.description}</td>
    </tr>
  </table>
  <input type="submit" value="Submit!">
</form:form>
<button onclick="window.location.href='goToFirstPage'">Go to first page</button>
<button onclick="window.location.href='goBackNewMember'">Go back</button>
</body>
</html>
