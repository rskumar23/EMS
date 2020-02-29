<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Show Employee</title>
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
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript"
	src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"></script>
<script>
	$(document).ready(function() {
		$('#skillTable').dataTable();
	});
</script>
<style>
#horizontal-form {
	width: 60%;
}
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
								<div class="panel-heading" style="align-self: center;">Course
									Details</div>
								<div class="panel-body">
									<table id="skillTable"
										class="table table-bordered table-striped">
											<thead>
												<tr>
													<th scope="col">Sr no</th>
													<th scope="col">Name</th>
													<th scope="col">Action</th>
												</tr>
											</thead>
											<tbody><%int i = 1;%>
											<c:forEach var="skills" items="${skills}">
												
												<tr>
													<td>
														<%out.print(i++);%>
													</td>
													<td>${skills.skillName}</td>
													<td><a class="btn btn-primary"
														href="/updateSkills?skillId=${skills.skillId}">Update</a>
														<a type="button" class="btn btn-danger"
															data-toggle="modal" data-target="#exampleModal">Delete</a>
													</td>
												</tr>
												<!-- Model -->
												<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
													<div class="modal-dialog" role="document">
														<div class="modal-content">
															<div class="modal-header"
																style="background-color: #337ab7;">
																<h5 class="modal-title" id="exampleModalLabel">Delete
																	Course</h5>
																<button type="button" class="close" data-dismiss="modal"
																	aria-label="Close">
																	<span aria-hidden="true">&times;</span>
																</button>
															</div>
															<div class="modal-body">Do you really want to
																delete ? <%--  the Skill ${skills.skillName} --%>
															</div>
															<div class="modal-footer">
																<button type="button" class="btn btn-secondary"
																	data-dismiss="modal">No</button>
																<a class="btn btn-danger"
																	href="/deleteSkills?skillId=${skills.skillId}"> Yes
																</a>

															</div>
														</div>
													</div>
												</div>
												</c:forEach>
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