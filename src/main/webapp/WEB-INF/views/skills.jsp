<!DOCTYPE HTML>
<html>
<head>
<title>Employee Management System</title>
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

.panel-primary {
	width: 60%;
}
</style>
</head>
<body>
	<div id="wrapper">
		<%@include file="fragment/header.jsp"%>
		<%@include file="fragment/sidebar.jsp"%>
		<div id="page-wrapper">
			<div class="graphs">
				<div class="xs">
					<div class="row">
						<div class="col-md-12">
							<div class="tab-content">
								<div class="tab-pane active" id="horizontal-form">
									<div class="panel panel-primary">
										<div class="panel-heading">Skills</div>
										<div class="panel-body">
											<div class="row">
												<div class="col-sm-10">
													<form class="form-horizontal">
														<div class="form-group">
															<label for="focusedinput" class="control-label col-sm-4">Name:
															</label>
															<div class="col-sm-8">
																<input type="text" class="form-control col-sm-10"
																	name="txtSkillName" placeholder="Skill Name" required>
															</div>
														</div>
														<div class="form-group">
															<div class="col-sm-4"></div>
															<div class="col-sm-5">
																<input type="submit" class="btn btn-primary"
																	value="Save" name="btnSave">
															</div>
															<div class="col-sm-2">
																<input type="Reset" class="btn btn-primary" name="reset">
															</div>
															<div class="col-sm-3"></div>
														</div>
													</form>
												</div>
											</div>
										</div>
									</div>
									<!--End of body-->
								</div>
								<!--End of Panel-->
							</div>
							<!-- Tab-pane -->
							<div class="panel panel-primary">
								<div class="panel-heading">All Skills</div>
								<div class="panel-body">
									<div class="table-responsive">
										<div class="col-md-2"></div>
										<div class="col-md-8">
											<table class="table table-bordered">
												<thead>
													<tr>
														<th>#</th>
														<th>Skill Name</th>
														<th>Action</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<th scope="row">1</th>
														<td>Table cell</td>
														<td><input type="submit" class="btn btn-primary"
															value="Edit"> <input type="submit"
															class="btn btn-danger" value="Delete"></td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="col-md-2"></div>
									</div>
								</div>
								<!--End of body-->
							</div>
							<!--End of Panel-->
						</div>
					</div>
				</div>
			</div>
			<!--End of xs-->
		</div>
		<!--Graphs-->
	</div>
	<%@include file="fragment/footer.jsp"%>
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