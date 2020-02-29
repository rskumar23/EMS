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
					<li><a href="/roles">Add Role</a></li>
					<li><a href="grids.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-cubes" style="color:white" aria-hidden="true"></i> Designation<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/addDesignation">Add Desg.</a></li>
					<li><a href="/user/compose">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="widgets.html"><i class="fa fa-flask nav_icon"></i>Courses<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/course">Add Courses</a></li>
					<li><a href="/courseDetails">Show All</a></li>
				</ul></li>
			<li><a href="#"><i class="fa fa-check-square-o nav_icon"></i>Notice<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/notice">Add Notice</a></li>
					<li><a href="/notice_details">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-table nav_icon"></i>Leave
					Mang.<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/addLeaveCategories">Add Categories</a></li>
					<li><a href="/user/compose">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-code-fork" style="color:white" aria-hidden="true"></i> &nbsp; Training
					Mang.<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
				<li><a href="/addTrainer">Add Trainer</a></li>
					<li><a href="/addTrainingCategory">Add Training Catg.</a></li>
					<li><a href="login.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-graduation-cap" style="color:white" aria-hidden="true"></i> Degree<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/degree">Add Degree</a></li>
					<li><a href="/degreeDetails">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-tasks" style="color:white" aria-hidden="true" ></i>&nbsp; Project<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/addProject">Add Project</a></li>
					<li><a href="login.html">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-bar-chart" style="color: white" aria-hidden="true"></i> Skills<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/skills">Add Skill</a></li>
					<li><a href="/showAllSkills">Show All</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-file" style="color: white" aria-hidden="true"></i> Reports<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="/empReport">Employee</a></li>
					<li><a href="/leaveReport">Leave</a></li>
					<li><a href="/courseReport">Courses</a></li>
					<li><a href="/projectReport">Project</a></li>
					<li><a href="/timesheetReport">Timesheet</a></li>
				</ul> <!-- /.nav-second-level --></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>