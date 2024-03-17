<!-- add-todo.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New ToDo Item</title>
</head>
<body>
<h1>Add New ToDo Item</h1>
<form action="/todo/add" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title">
    <button type="submit">Add</button>
</form>
</body>
</html>
