<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Show Employee</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" ></script>
<script>
$(document).ready(function(){
    $('#empTable').dataTable();
});
</script>
<style>
/*#horizontal-form{
width:60%;
}*/
/* .emp_panel {
	width: 100%;
} */
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
							<div class="panel panel-primary">
								<div class="panel-heading" style="align-self: center;">Employee
									Details</div>
								<div class="panel-body">
								<!-- <label>Search Employee </label><input type="text" value="srchEmpUid"> -->
									<table id="empTable" class="table table-bordered table-striped">
										<thead>
											<tr>
												<th scope="col">Sr no</th>
												<th scope="col">Employee ID</th>
												<th scope="col">Name</th>
												<th scope="col">Email</th>
												<th scope="col">Phone</th>
												<th scope="col">Designation</th>
												<th scope="col">Joining Date</th>
												<th scope="col">Manager</th>
												<th scope="col">Project Name</th>
												<th scope="col">Action</th>
												
											</tr>
										</thead>
										<tbody>
											<tr>
												<th scope="row">1</th>
												<td>1317939</td>
												<td>Subahan Sayyad</td>
												<td>subahan@gmail.com</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
											</tr>
											<tr>
												<th scope="row">1</th>
												<td>12548</td>
												<td>Rahul</td>
												<td>rahul@gmail.com</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
												<td>1325689546</td>
											</tr>
											
										</tbody>
									</table>
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