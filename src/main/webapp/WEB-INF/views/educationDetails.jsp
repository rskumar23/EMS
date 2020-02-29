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
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>

</head>
<body>
	<div id="wrapper">
		<%@include file="fragments/header.jsp"%>
		<%@include file="fragments/sidebar.jsp"%>
		<div id="page-wrapper">
			<div class="graphs">
				<div class="xs">
					<div class="row">
						<!-- <div class="col-md-2"></div> -->
						<div class="col-md-8">
							<div class="tab-content">
								<div class="tab-pane active" id="horizontal-form">
									<div class="panel panel-primary">
										<div class="panel-heading">Education Details</div>
										<div class="panel-body">
											<div class="col-sm-10">
												<form class="form-horizontal">
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">School College</label>
														<div class="col-sm-8">
															<input type="text" class="form-control col-sm-10"
																name="" placeholder="School College" required>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">Board / University</label>
														<div class="col-sm-8">
															<input type="text" class="form-control col-sm-10"
																name="" placeholder="Board / University" required>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">degree</label>
														<div class="col-sm-8">
															<select class="form-control" name="">
																<option>BCA</option>
																<option>MCA</option>
															</select>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">Nature Of Education</label>
														<div class="col-sm-8">
															<select class="form-control" name="">
																<option value="Full Time">Full Time</option>
																<option value="Part Time">Part Time</option>
															</select>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">Status</label>
														<div class="col-sm-8">
															<input type="radio" name="status" value="Pass"> Pass
															<input type="radio" name="status" value="Fail"> Fail
															<input type="radio" name="status" value="Persuing"> Persuing
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">Percentage</label>
														<div class="col-sm-8">
															<input type="text" class="form-control col-sm-10"
																name="" placeholder="Percentage" required>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">Start Date</label>
														<div class="col-sm-8">
															<input type="text" class="form-control col-sm-10"
																name="startDate" placeholder="mm/dd/yyyy" required>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">End Date</label>
														<div class="col-sm-8">
															<input type="text" class="form-control col-sm-10"
																name="endDate" placeholder="mm/dd/yyyy" required>
														</div>
													</div>
													<div class="form-group">
														<label for="focusedinput" class="control-label col-sm-4">Document</label>
														<input type="file" name="" class="form-controll" required>
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
						<!-- <div class="col-md-2"></div> -->
					</div>

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
<script>
$(document).ready(function(){
    var start_date=$('input[name="startDate"]'); //our date input has the name "date"
    var end_date=$('input[name="endDate"]');
    var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
    var options={
      format: 'mm/dd/yyyy',
      container: container,
      todayHighlight: true,
      autoclose: true,
    };
    start_date.datepicker(options);
    end_date.datepicker(options);
  });
</script>