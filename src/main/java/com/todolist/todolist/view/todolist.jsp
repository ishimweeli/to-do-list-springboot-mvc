<!-- todo-list.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo List</title>
</head>
<body>
<h1>ToDo List</h1>
<ul>
    <c:forEach items="${todos}" var="todo">
        <li>${todo.title}</li>
    </c:forEach>
</ul>
<!-- Button to navigate to the add form -->
<a href="/todo/add">Add New</a>
</body>
</html>
