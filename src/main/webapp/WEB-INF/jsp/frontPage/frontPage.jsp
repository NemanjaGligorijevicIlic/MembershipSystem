<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .header {
            margin-top: 20px;
            text-align: center;
            position: absolute;
            top: 0;
            width: 100%;
            background-color: #f0f0f0; /* Light gray background */
            padding: 10px 0;
        }

        .button-container {
            display: flex;
            gap: 20px;
            margin-top: 80px; /* Adjust this margin to create space below the title */
        }

        .button {
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
    </style>
</head>
<body>
<div class="header">
    <h1>Hello and welcome to the membership system</h1>
</div>
<div class="button-container">
    <a class="button" href="memberShow">Show member with member-id</a>
    <a class="button" href="memberAdd">Add new member</a>
    <a class="button" href="showAllMember">Show all members</a>
    <a class="button" href="findMemberByIdPage">Update existing member</a>
    <a class="button" href="addNewCar">Add a new car</a>
</div>
</body>
</html>
