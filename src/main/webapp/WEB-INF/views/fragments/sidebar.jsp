<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li><a href="/dashboard"><i
					class="fa fa-dashboard fa-fw nav_icon"></i>Dashboard</a></li>
			<li><a href="#"><i class="fa fa-user" style="color:white" aria-hidden="true"></i> Employee<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/employee">Add Employee</a></li>
					<li><a href="/employee_details">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-users" style="color:white" aria-hidden="true"></i> Roles<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level collapse">
					<li><a href="grids.html">Add Role</a></li>
					<li><a href="grids.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-cubes" style="color:white" aria-hidden="true"></i> Designation<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/inbox">Add Desg.</a></li>
					<li><a href="/user/compose">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="widgets.html"><i class="fa fa-flask nav_icon"></i>Courses<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/courses">Add Courses</a></li>
					<li><a href="/course_details">Show All</a></li>
				</ul></li>
			<li><a href="#"><i class="fa fa-check-square-o nav_icon"></i>Notice<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/notice">Add Notice</a></li>
					<li><a href="/user/compose">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-table nav_icon"></i>Leave
					Mang.<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/leaveCategories">Add Categories</a></li>
					<li><a href="/user/compose">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-code-fork" style="color:white" aria-hidden="true"></i> &nbsp; Training
					Mang.<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
				<li><a href="/addTrainer">Add Trainer</a></li>
					<li><a href="/trainingCategory">Add Training Catg.</a></li>
					<li><a href="login.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-graduation-cap" style="color:white" aria-hidden="true"></i> Degree<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="media.html">Add Degree</a></li>
					<li><a href="login.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-tasks" style="color:white" aria-hidden="true" ></i>&nbsp; Project<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="media.html">Add Project</a></li>
					<li><a href="login.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-bar-chart" style="color: white" aria-hidden="true"></i> Skills<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="media.html">Add Skill</a></li>
					<li><a href="login.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-file" style="color: white" aria-hidden="true"></i> Reports<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="media.html">Employee</a></li>
					<li><a href="login.html">Leave</a></li>
					<li><a href="login.html">Courses</a></li>
					<li><a href="login.html">Project</a></li>
					<li><a href="login.html">Timesheet</a></li>
				</ul> <!-- /.nav-second-level --></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>