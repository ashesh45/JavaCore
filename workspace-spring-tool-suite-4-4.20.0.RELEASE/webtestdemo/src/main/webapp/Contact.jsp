<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f4f4f4;
        }

        .container {
            width: 100%;
            max-width: 900px;
            margin: 50px auto;
            background: #fff;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            border-radius: 10px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .contact-form {
            display: flex;
            flex-direction: column;
        }

        .contact-form input,
        .contact-form textarea {
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 16px;
        }

        .contact-form textarea {
            resize: none;
            height: 120px;
        }

        .contact-form button {
            padding: 12px;
            background: #007BFF;
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }

        .contact-form button:hover {
            background: #0056b3;
        }

        .contact-info {
            margin-top: 30px;
            text-align: center;
        }

        .contact-info p {
            margin: 5px 0;
            color: #555;
        }

    </style>
</head>

<body>

<div class="container">
    <h2>Contact Us</h2>

    <form class="contact-form">
        <input type="text" placeholder="Your Name" required>
        <input type="email" placeholder="Your Email" required>
        <textarea placeholder="Your Message" required></textarea>
        <button type="submit">Send Message</button>
    </form>

    <div class="contact-info">
        <p>Email: support@example.com</p>
        <p>Phone: +977-9800000000</p>
        <p>Address: Kathmandu, Nepal</p>
    </div>
</div>

</body>
</html>

</body>
</html>