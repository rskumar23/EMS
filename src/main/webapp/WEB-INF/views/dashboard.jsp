<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
<!----webfonts--->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<!---//webfonts--->
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
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
							<div class="col_3">
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-users icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong>45</strong>
											</h5>
											<span>Employees</span>
										</div>
									</div>
								</div>
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-users icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong>10</strong>
											</h5>
											<span>Active Employees</span>
										</div>
									</div>
								</div>
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-users user1 icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong>12</strong>
											</h5>
											<span>Inactive Employees</span>
										</div>
									</div>
								</div>
								<div class="col-md-3 widget">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-graduation-cap icon-rounded"></i>
										<!-- <i class=" fa fa-graduation-cap "></i> -->
										<div class="stats">
											<h5>
												<strong>450</strong>
											</h5>
											<span>Courses</span>
										</div>
									</div>
								</div>
								
								<div class="clearfix"></div>
							</div>
							<div class="col_1">
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-users icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong>45</strong>
											</h5>
											<span>Trainer</span>
										</div>
									</div>
								</div>
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-tasks icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong>20</strong>
											</h5>
											<span>Projects</span>
										</div>
									</div>
								</div>
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-calendar icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong></strong>
											</h5>
											<span>Leave</span>
										</div>
									</div>
								</div>
								<div class="col-md-3 widget widget1">
									<div class="r3_counter_box">
										<i class="pull-left fa fa-file icon-rounded"></i>
										<div class="stats">
											<h5>
												<strong></strong>
											</h5>
											<span>Report</span>
										</div>
									</div>
								</div>
							</div>
							
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
	</div>
	<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->
	<!-- Nav CSS -->
	<link href="css/custom.css" rel="stylesheet">
	<!-- Metis Menu Plugin JavaScript -->
	<script src="js/metisMenu.min.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>
