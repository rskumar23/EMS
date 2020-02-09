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
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
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
							<div class="panel panel-primary emp_panel">
								<div class="panel-heading">Employee</div>
								<div class="panel-body">
									<div class="col-sm-10">
										<form class="form-horizontal" action="saveEmployee"
											method="post">
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Employee
													ID</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="emp_uid" placeholder="Employee ID" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">First
													Name</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="emp_fname" placeholder="Employee Name" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Middle
													Name</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="emp_mname" placeholder="Employee Name" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Last
													Name</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="emp_lname" placeholder="Employee Name" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Email</label>
												<div class="col-sm-8">
													<input type="email" class="form-control col-sm-10"
														name="email" placeholder="Email Address" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Phno</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="contactNumber" placeholder="Phone number"
														maxlength="10" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Country</label>
												<div class="col-sm-8">
													<select class="form-control" name="country">
														<option>India</option>
														<option>Other</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">State</label>
												<div class="col-sm-8">
													<select class="form-control" name="state">
														<option>Maharashtra</option>
														<option>Other</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Address</label>
												<div class="col-sm-8">
													<textarea type="text" class="form-control col-sm-10"
														name="txtAddr" placeholder="Address"></textarea>

												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Gender</label>
												<div class="col-sm-8">
													<input type="radio" name="gender" value="M">Male <input
														type="radio" name="gender" value="F">Female
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Designation</label>
												<div class="col-sm-8">
													<select class="form-control" name="designation">
														<option value="1">Developer</option>
														<option value="2">Other</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Role</label>
												<div class="col-sm-8">
													<!-- <select class="form-control" name="roleID">
<option value="1">Employee</option>
<option value="2">Manager</option>
<option value="3">HR</option>
</select> -->
													<select name="roleID" class="form-control">
														<option items="${roleList} }"></option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Date
													of Joining</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="joiningDate" placeholder="MM/DD/YYYY" required>
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Marital
													Status</label>
												<div class="col-sm-8">
													<input type="radio" name="marital" value="Y">Married
													<input type="radio" name="marital" value="N">Unmarried
												</div>
											</div>
											<div class="form-group">
												<label for="focusedinput" class="control-label col-sm-4">Blood
													Group</label>
												<div class="col-sm-8">
													<input type="text" class="form-control col-sm-10"
														name="txtBloodGroup" placeholder="Bool Group" required>
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