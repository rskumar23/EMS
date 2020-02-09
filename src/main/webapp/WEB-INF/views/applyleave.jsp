<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<html>
<head>
<title>Modern an Admin Panel Category Flat Bootstarp Resposive Website Template | Forms :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
<!----webfonts--->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
<!---//webfonts--->  
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
>
<style>
	/*#horizontal-form{
		width:60%;
	}*/
	.emp_panel{
		width:80%;
	}
</style>
<script>
$(document).ready(function(){
    var date_input=$('input[name="from"]'); //our date input has the name "date"
    var date_to = $('input[name="to"]');
    var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
    var options={
      format: 'mm/dd/yyyy',
      container: container,
      todayHighlight: true,
      autoclose: true,
    };
    date_input.datepicker(options);
    date_to.datepicker(options);
    $('#leaveTable').dataTable();
  });
</script>
</head>
<body>
<div id="wrapper">
     	<%@include file="fragments/header.jsp" %>
     	<%@include file="fragments/sidebar.jsp" %>
        <div id="page-wrapper">
			<div class="graphs">
			<div class="xs">
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
						<div class="panel panel-primary emp_panel">
							<div class="panel-heading">Apply Leave <span style="float:right">EL: 20 &nbsp;SL: 6</span></div>
							<div class="panel-body">
								<div class="col-sm-10">
									<form class="form-horizontal" action="saveEmployee" method="post">									
										<div class="form-group">
											<label for="focusedinput" class="control-label col-sm-4">Type</label>
											<div class="col-sm-6">
												<select name="type" class="form-control">
													<option>--Select---</option>
													<option>Sick Leave</option>
												</select>
											</div>
											<div class="col-sm-2"></div>
										</div>
										
										<div class="form-group">
											<label for="focusedinput" class="control-label col-sm-4">Start Date</label>
											<div class="col-sm-6">
												<input type="text" class="form-control col-sm-10" id="date" placeholder="Start Date" name="from" required>
											</div>
											<div class="col-sm-2"></div>
										</div>
										<div class="form-group">
											<label for="focusedinput" class="control-label col-sm-4">End Date</label>
											<div class="col-sm-6">
												<input type="text" class="form-control col-sm-10" name="to" placeholder="End Date" required>
											</div>
											<div class="col-sm-2"></div>
										</div>
										<div class="form-group">
											<label for="focusedinput" class="control-label col-sm-4">No Of Days</label>
											<div class="col-sm-6">
												<!-- <span>0</span> -->
												<input type="text" class="form-control col-sm-10" name="no_of_days" value="0"  readonly required>
											</div>
											<div class="col-sm-2"></div>
										</div>
										<div class="form-group">
											<label for="focusedinput" class="control-label col-sm-4">Reason</label>
											<div class="col-sm-6">
												<textarea type="text" class="form-control" name="reason" placeholder="Reason"></textarea>
											</div>
											<div class="col-sm-2"></div>
										</div>
										<div class="form-group">
											<div class="col-sm-4"></div>
											<div class="col-sm-4">
												<input type="submit" class="btn btn-primary" value="Save" name="btnSave">
											</div>
											<div class="col-sm-4">
												<input type="Reset" class="btn btn-danger" name="reset">
											</div>
											<!-- <div class="col-sm-1"></div> -->
										</div>										
									</form>
								</div>
								
							</div><!--End of body-->
						</div><!--End of Panel-->
						<div class="panel panel-primary emp_panel">
							<div class="panel-heading">Applied Leaves</div>
							<div class="panel-body">
								<div class="col-sm-12">
									<table class="table table-bordered table-striped" id="leaveTable">
										<tr>
											<th>Leave Type</th>
											<th>Start Date</th>
											<th>End Date</th>
											<th>Reason</th>
											<th>No Of Days</th>
											<th>Action</th>
										</tr>
										<tr>
											<td>Sick Leave</td>
											<td>12/12/19</td>
											<td>13/12/19</td>
											<td>Reason</td>
											<td>1</td>
											<td>
												<input type="button" value="Save" class="btn btn-primary">
												<input type="button" value="Delete" class="btn btn-danger">
											</td>
										</tr>
									</table>
								</div>
							</div><!--End of body-->
						</div><!--End of Panel-->
					</div><!-- Tab-pane -->
				</div><!-- Tab-Content -->
			</div><!--End of xs-->
			</div><!--Graphs-->	
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