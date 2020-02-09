<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Employee Management System Login</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords" content="" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!-- //Meta tag Keywords -->

<!-- Custom-Files -->
<!-- <link rel="stylesheet" href="css/index/bootstrap.css"> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- Bootstrap-Core-CSS -->
<link rel="stylesheet" href="css/index/style.css" type="text/css"
	media="all" />
<!-- Style-CSS -->
<link href="css/index/font-awesome.min.css" rel="stylesheet">
<!-- Font-Awesome-Icons-CSS -->
<!-- //Custom-Files -->

<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<!-- Web-Fonts -->
<link
	href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=devanagari,latin-ext"
	rel="stylesheet">
</head>
<body>
<form action="/login" method="post" class="form-horizontal" style=" padding: 0% 6% 0% 6%">
				<div class="row" style="margin-top:5%;">
					<div class="col-md-4 col-sm-4">
					</div>
					<div class="col-md-4 col-sm-4">
						<div class="form-group">
							<label for="username">Username</label>: <input type="text"
								id="username" name="uid" class="form-control"
								autofocus="autofocus" placeholder="Username">
						</div>
						<div class="form-group">
						<label for="password">Password</label>: <input type="password"
							id="password" name="password" class="form-control"
							placeholder="Password">
						</div>
						<div class="clearfix">
							<label class="pull-left checkbox-inline"><input type="checkbox"> Remember me</label> 
							<a href="#" class="pull-right">Forgot Password?</a>
						</div>
						<div>
							<input type="submit" name="login-submit" id="login-submit"
								class="btn btn-info" value="Log In">
						</div>
					</div>
					<div class="col-md-4 col-sm-4">
					</div>
				</div>
			</form>
</body>
</html>