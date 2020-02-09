<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Timesheet</title>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/calendar.css" rel="stylesheet" type='text/css'>
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="js/jquery.min.js"></script>
<script src="js/calendar.js"></script>
<!----webfonts--->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
<!---//webfonts--->  
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<style>
	#external-events {
		float: left;
		width: 150px;
		padding: 0 10px;
		text-align: left;
		}
		
	#external-events h4 {
		font-size: 16px;
		margin-top: 0;
		padding-top: 1em;
		}
		
	.external-event { /* try to mimick the look of a real event */
		margin: 10px 0;
		padding: 2px 4px;
		background: #3366CC;
		color: #fff;
		font-size: .85em;
		cursor: pointer;
		}
		
	#external-events p {
		margin: 1.5em 0;
		font-size: 11px;
		color: #666;
		}
		
	#external-events p input {
		margin: 0;
		vertical-align: middle;
		}

	#calendar {
/* 		float: right; */
        margin: 0 auto;
		width: 900px;
		background-color: #FFFFFF;
		  border-radius: 6px;
        box-shadow: 0 1px 2px #C3C3C3;
		-webkit-box-shadow: 0px 0px 21px 2px rgba(0,0,0,0.18);
-moz-box-shadow: 0px 0px 21px 2px rgba(0,0,0,0.18);
box-shadow: 0px 0px 21px 2px rgba(0,0,0,0.18);
		}
</style>
<script>
(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
	  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
	  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

	  ga('create', 'UA-55581850-1', 'auto', {'allowLinker': true});
	  ga('require', 'linker');
	  ga('linker:autoLink', ['danstools.com','unixtimestamp.com','url-encode-decode.com','cssfontstack.com','hexcolortool.com','htaccessredirect.net','jspretty.com','jsmini.com','jsobfuscate.com','md5hashgenerator.com','regextester.com','cleancss.com','favicon-generator.org','website-performance.org','permissions-calculator.org','conversoes.org','convertissez.fr','convertitore.net','elconvertidor.com','files-conversion.com','henkan-muryo.com','konvertirung.org','konvertor.org','tahwil.net','zhuan-huan.com','bootsnipp.com'] );
	  ga('send', 'pageview');

	        window.onload = function() {
	/*        $('body').append('<script type="text/javascript" src="https://srv.buysellads.com/ads/CVADLKQJ.json?callback=drop_ad" async><\/script>');
	        $('body').append("<style>.bsa-apiads {\
	  line-height: 1.5;\
	  display: inline-block;\
	  float: left;\
	  font-size: 12px;\
	  background-color: #5A8DB6;\
	  border: solid 1px #337799;\
	  box-shadow: inset 0 1px hsla(0, 0%, 100%, .1);\
	  box-sizing: border-box;\
	  background-image: url('http://www.danstools.com/devops/img/devoops_pattern_b10.png');\
	  margin: 1em 1em 0 2em;\
	  border-radius: 4px;\
	  text-align: center;\
	  padding: .25em;\
	}\
	 \
	.bsa-apiads a:before {\
	  margin-right: 4px;\
	  padding: 2px 6px;\
	  border-radius: 3px;\
	  background-color: #58B668;\
	  color: #fff;\
	  content: 'Ad';\
	}\
	 \
	  .bsa-apiads a {\
	    color: #fff;\
	  }\
	 \
	  .bsa-apiads a:hover {\
	    color: inherit;\
	  }</style>");*/
	        setTimeout(function() {
	          var ad = document.querySelector(".bsap_ac1f95c148ce6148393fd34e69a52240");
	          var promos = document.querySelectorAll(".nxmo");
		  var isblock = 0;
	          for (var i = 0; i < promos.length; i++) {
	                  var promo = promos[i];
	          if (isblock ==1 || (ad && ad.innerHTML.replace(/\s/g, "").length == 0)) {
		    isblock = 1;
//	            ad.style.cssText = 'display:block !important';
//	          promo.style.cssText = 'display:none !important';
	            promo.innerHTML = '';
		    promo.style.display= 'inline-block';
		    promo.style.visibility= 'visible';
	            promo.style.maxWidth= '';
	          } else if (promo) {
	            promo.innerHTML = '';
//	            var promotwo = document.querySelector("#toppromo2");
	            promo.childNodes[0].childNodes[0].style.width= '';
	          }
		  }
	        }, 1000);
	      };
	      
	      var fb_param = {};
	      fb_param.pixel_id = '6007046190250';
	      fb_param.value = '0.00';
	      (function(){
	        var fpw = document.createElement('script');
	        fpw.async = true;
	        fpw.src = '//connect.facebook.net/en_US/fp.js';
	        var ref = document.getElementsByTagName('script')[0];
	        ref.parentNode.insertBefore(fpw, ref);
	      })();
	      
	      (function(){
	    	  var bsa = document.createElement('script');
	    	     bsa.type = 'text/javascript';
	    	     bsa.async = true;
	    	     bsa.src = '//s3.buysellads.com/ac/bsa.js';
	    	  (document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);
	    	})();
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
							<div class="panel-heading">Timesheet</div>
							<div class="panel-body">
								<div class="col-sm-10">
									<div id='calendar'></div>

									<div style='clear:both'></div>
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
<script>
$(document).ready(function() {
    var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	
	/*  className colors
	
	className: default(transparent), important(red), chill(pink), success(green), info(blue)
	
	*/		
	
	  
	/* initialize the external events
	-----------------------------------------------------------------*/

	$('#external-events div.external-event').each(function() {
	
		// create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
		// it doesn't need to have a start or end
		var eventObject = {
			title: $.trim($(this).text()) // use the element's text as the event title
		};
		
		// store the Event Object in the DOM element so we can get to it later
		$(this).data('eventObject', eventObject);
		
		// make the event draggable using jQuery UI
		$(this).draggable({
			zIndex: 999,
			revert: true,      // will cause the event to go back to its
			revertDuration: 0  //  original position after the drag
		});
		
	});


	/* initialize the calendar
	-----------------------------------------------------------------*/
	
	var calendar =  $('#calendar').fullCalendar({
		header: {
			left: 'title',
			center: 'agendaDay,agendaWeek,month',
			right: 'prev,next today'
		},
		editable: true,
		firstDay: 1, //  1(Monday) this can be changed to 0(Sunday) for the USA system
		selectable: true,
		defaultView: 'month',
		
		axisFormat: 'h:mm',
		columnFormat: {
            month: 'ddd',    // Mon
            week: 'ddd d', // Mon 7
            day: 'dddd M/d',  // Monday 9/7
            agendaDay: 'dddd d'
        },
        titleFormat: {
            month: 'MMMM yyyy', // September 2009
            week: "MMMM yyyy", // September 2009
            day: 'MMMM yyyy'                  // Tuesday, Sep 8, 2009
        },
		allDaySlot: false,
		selectHelper: true,
		select: function(start, end, allDay) {
			var title = prompt('Event Title:');
			if (title) {
				calendar.fullCalendar('renderEvent',
					{
						title: title,
						start: start,
						end: end,
						allDay: allDay
					},
					true // make the event "stick"
				);
			}
			calendar.fullCalendar('unselect');
		},
		droppable: true, // this allows things to be dropped onto the calendar !!!
		drop: function(date, allDay) { // this function is called when something is dropped
		
			// retrieve the dropped element's stored Event Object
			var originalEventObject = $(this).data('eventObject');
			
			// we need to copy it, so that multiple events don't have a reference to the same object
			var copiedEventObject = $.extend({}, originalEventObject);
			
			// assign it the date that was reported
			copiedEventObject.start = date;
			copiedEventObject.allDay = allDay;
			
			// render the event on the calendar
			// the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
			$('#calendar').fullCalendar('renderEvent', copiedEventObject, true);
			
			// is the "remove after drop" checkbox checked?
			if ($('#drop-remove').is(':checked')) {
				// if so, remove the element from the "Draggable Events" list
				$(this).remove();
			}
			
		},
		
		events: [
			{
				title: 'All Day Event',
				start: new Date(y, m, 1)
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: new Date(y, m, d-3, 16, 0),
				allDay: false,
				className: 'info'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: new Date(y, m, d+4, 16, 0),
				allDay: false,
				className: 'info'
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d, 10, 30),
				allDay: false,
				className: 'important'
			},
			{
				title: 'Lunch',
				start: new Date(y, m, d, 12, 0),
				end: new Date(y, m, d, 14, 0),
				allDay: false,
				className: 'important'
			},
			{
				title: 'Birthday Party',
				start: new Date(y, m, d+1, 19, 0),
				end: new Date(y, m, d+1, 22, 30),
				allDay: false,
			},
			{
				title: 'Click for Google',
				start: new Date(y, m, 28),
				end: new Date(y, m, 29),
				url: 'https://ccp.cloudaccess.net/aff.php?aff=5188',
				className: 'success'
			}
		],			
	});
	
	
});
</script>