<head>
	<script type="text/javascript" src='js/jquery.min.js'></script>
<script type='text/javascript'>
	$(document).ready(
			function() {
				$("#otpreg").hide();
				
				$('#UpdateButton').click(function() {
					var MSG = $("#Message").val();
					var dataString = 'message=' + MSG;
					$.ajax({
						type : "POST",
						url : "OTPServletcontroller",
						data : dataString,
						cache : false,
						success : function(data) {
							$("#otpreg").show();
						}
					});
					return false;
				});
				
				$('#optSubmit').click(function() {
					var MSG = $("#otp").val();
					var dataString = 'message=' + MSG;
					$.ajax({
						type : "POST",
						url : "OTPVerificationServletController",
						data : dataString,
						cache : false,
						success : function(data) {
							alert(data);
						}
					});
					return false;
				});
			});
</script>

</head>
<div id="popup_box">
	<!-- OUR PopupBox DIV-->
	<a id="popupBoxClose" style="margin: -40px;"><img
		src="resources/assets/images/red-cross.png"></img></a>

	<div role="tabpanel" class="tab-pane active" id="flight">
		<h3>Fill this form and get best deals on "Motor Training Schools"</h3>
		<hr>
			<div class="col-md-6 col-sm-6 search-col-padding">
				<label>Your Name</label>
				<div class="input-group">
					<input type="text" name="name" class="form-control" required
						placeholder="E.g. Raju"> <span class="input-group-addon"><i
						class="fa fa-user"></i></span>
				</div>
			</div>
			<br>
			<div class="clearfix"></div>
			<div class="col-md-6 col-sm-6 search-col-padding">
				<label>Your Mobile Number</label>
				<div class="input-group">
					<input type="text" name="mobileNo" class="form-control" required
						placeholder="E.g. 9856525636"> <span
						class="input-group-addon"><i class="fa fa-mobile"></i></span>
				</div>
			</div>
			<br>
			<div class="clearfix"></div>
			<div class="col-md-6 col-sm-6 search-col-padding">
				<label>Your Mail Id</label>
				<div class="input-group">
					<input type="text" name="mailId" class="form-control" required
						placeholder="E.g. abc@xyz.com" id="Message"> <span
						class="input-group-addon"><i class="fa fa-mobile"></i></span>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-12 search-col-padding">
				<input type="submit" class="search-button btn transition-effect" id="UpdateButton"
					value="Submit">

			</div>
		<hr>
		<div id="otpreg">
			<div class="col-md-6 col-sm-6 search-col-padding">
				<label>OTP</label>
				<div class="input-group">
					<input type="text" name="otp" class="form-control" required
						placeholder="e.g. 1234" id="otp"> <span
						class="input-group-addon"><i class="fa fa-mobile"></i></span>
				</div>
			</div>
			<div class="col-md-12 search-col-padding">
				<input type="submit" class="search-button btn transition-effect" id="optSubmit"
					value="Submit">

			</div>
		</div>
	</div>

</div>
