<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<h2>Login</h2>

<form action="LoginServlet" method=post>

<p style="color:red"> ${message} </p>

    <label>Username:</label><br>
    <input type="text" name="username"><br><br>

    <label>Password:</label><br>
    <input type="password" name="password"><br><br>

    <button type="submit">Login</button>
</form>

</body>
</html>