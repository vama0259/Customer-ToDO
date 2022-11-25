<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.11/css/mdb.min.css" rel="stylesheet">
<title>Login User</title>
</head>
<body>
<!-- Default form register -->
<form class="text-center border border-light p-5" method="post" action="/login">
    <p class="h4 mb-4">Login Form</p>

    <div class="form-row mb-4">
        <div class="col">
            <!-- Username -->
            <input name="username" type="text" class="form-control mb-3" placeholder="User Name"/>
        </div>
        <!-- Password -->
    	<input name="password" type="password" class="form-control mb-3" placeholder="Password"/>
         <!-- Submit button -->
    	<button class="btn btn-info my-4 btn-block" type="submit">Submit</button>
    </div>
</form>
</body>
</html>