<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Modern an Admin Panel Category Flat Bootstarp Resposive
	Website Template | Forms :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />

<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
<!----webfonts--->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<!---//webfonts--->
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js">
	$('.datepicker').pickadate();
</script>
<style>
/*#horizontal-form{
width:60%;
}*/
.emp_panel {
	width: 60%;
}
</style>
</head>
<body>
	<div id="wrapper">
		<%@include file="fragments/header.jsp"%>
		<%@include file="fragments/sidebar.jsp"%>
		<div id="page-wrapper">
			<div class="graphs">
				<div class="xs">
					<div class="tab-content">
						<div class="tab-pane active" id="horizontal-form">
							<div class="panel panel-primary emp_panel">
								<div class="panel-heading">Leave Category</div>
								<div class="panel-body">
									<div class="col-sm-10">
										<form class="form-horizontal" action="addCourses">
											
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Category </label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="category" placeholder="Leave Category" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4"> Leave Count</label>
												<div class="col-sm-8">
													<input type="text"  class="form-control col-sm-10"
														name="leaveCount" placeholder="Leave Count" required>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-2"></div>
												<div class="col-sm-4">
													<input type="submit" class="btn btn-primary" value="Save"
														name="btnSave">
												</div>
												<div class="col-sm-4">
													<input type="Reset" class="btn btn-primary" name="reset">
												</div>
												<div class="col-sm-2"></div>
											</div>
										</form>
									</div>
									<!--End of body-->
								</div>
								<!--End of Panel-->
							</div>
							<!-- Tab-pane -->
						</div>
						<!-- Tab-Content -->
					</div>
					<!--End of xs-->
				</div>
				<!--Graphs-->
			</div>
			<%@include file="fragments/footer.jsp"%>
		</div>

		<!-- /#wrapper -->
		<!-- Nav CSS -->
		<link href="css/custom.css" rel="stylesheet">
		<!-- Metis Menu Plugin JavaScript -->
		<script src="js/metisMenu.min.js"></script>
		<script src="js/custom.js"></script>
</body>
</html>