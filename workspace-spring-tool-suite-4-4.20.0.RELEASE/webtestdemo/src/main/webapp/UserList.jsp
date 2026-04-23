
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>

<h1>UserList</h1>

<table border="2">
    <thead>
        <tr>
            <th>username</th>
            <th>email</th>
            <th>password</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="u" items="${ulist}">
            <tr>
                <td>${u.username}</td>
                <td>${u.email}</td>
                <td>${u.password}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>