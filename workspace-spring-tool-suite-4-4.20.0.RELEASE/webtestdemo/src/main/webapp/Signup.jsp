
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="SignUpServlet" method="POST">
  <h2>Create an Account</h2>
  
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" required>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required>

  <button type="submit">Sign Up</button>
</form>
</body>
</html>