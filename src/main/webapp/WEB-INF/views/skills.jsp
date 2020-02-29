<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">
<!-- jQuery -->
<script type="text/javascript">

	function load() {
        $.ajax({ //create an ajax request to load_page.php
            type: 'GET',
            url: 'skills.jsp',
            /* dataType: "html", //expect html to be returned  */               
            success: function (response) {
                $("#responsecontainer").html(response);
                /* setTimeout(load, 1000) */
            }
        });
    }

    load(); 
	
</script>
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
<body onload="load()">
	<div id="wrapper">
		<%@include file="fragments/header.jsp"%>
		<%@include file="fragments/sidebar.jsp"%>
		<div id="page-wrapper">
			<div class="graphs">
				<div class="xs">
					<div class="row">
						<div class="col-md-12">
							<div class="tab-content">
								<div class="tab-pane active" id="horizontal-form">
									<div class="panel panel-primary">
										<div class="panel-heading">
											<c:out value="${skills.skillId != null ? 'Update' : 'Add' }" />
											Skills
										</div>
										<div class="panel-body">
											<div class="row">
												<div class="col-sm-10">
													<form class="form-horizontal" action="addSkills" method="post">
														<div>
															<input type="hidden" name="skillId"
																value="${skills.skillId}">
														</div>
														<div class="form-group">
															<label for="focusedinput" class="control-label col-sm-4">Name:
															</label>
															<div class="col-sm-8">
																<input type="text" class="form-control col-sm-10"
																	name="skillName" value="${skills.skillName }"
																	placeholder="Skill Name" required>
															</div>
														</div>
														<div class="form-group">
															<div class="col-sm-4"></div>
															<div class="col-sm-5">
																<input type="submit" class="btn btn-primary"
																	value="<c:out value="${skills.skillId != null ? 'Update' : 'Save' }" />">
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
							<%-- <div class="panel panel-primary" id="responsecontainer">
								<div class="panel-heading">All Skills</div>
								<div class="panel-body">
									<div class="table-responsive">
										<div class="col-md-2"></div>
										<div class="col-md-8">
												<table class="table table-bordered" >
													<thead>
														<tr>
															<th>Sr.NO</th>
															<th>Skill Name</th>
															<th>Action</th>
														</tr>
													</thead>
													<tbody>
														<%
															int i = 1;
														%>
														<c:forEach var="skills" items="${skills}">
															<tr>
																<td>
																	<%
																		out.print(i++);
																	%>
																</td>
																<td>${skills.skillName }</td>
																<td><a class="btn btn-primary"
																	href="/updateSkills?skillId=${skills.id}">Update</a>
																	<button type="button" class="btn btn-danger"
																		data-toggle="modal" data-target="#exampleModal">Delete</button>
																</td>
															</tr>
															<div class="modal fade" id="exampleModal" tabindex="-1"
																role="dialog" aria-labelledby="exampleModalLabel"
																aria-hidden="true">
																<div class="modal-dialog" role="document">
																	<div class="modal-content">
																		<div class="modal-header"
																			style="background-color: #337ab7;">
																			<h5 class="modal-title" id="exampleModalLabel">Delete
																				Skill</h5>
																			<button type="button" class="close"
																				data-dismiss="modal" aria-label="Close">
																				<span aria-hidden="true">&times;</span>
																			</button>
																		</div>
																		<div class="modal-body">Do you really want to
																			delete the course having Skill "${skills.skillName}"?
																		</div>
																		<div class="modal-footer">
																			<button type="button" class="btn btn-secondary"
																				data-dismiss="modal">No</button>
																			<a class="btn btn-danger"
																				href="/deleteCourse?courseId=${courses.id}"> Yes
																			</a>

																		</div>
																	</div>
																</div>
															</div>
														</c:forEach>
													</tbody>
												</table>
										</div>
										<div class="col-md-2"></div>
									</div>
								</div>
								<!--End of body-->
							</div> --%>
							<!--End of Panel-->
						</div>
					</div>
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