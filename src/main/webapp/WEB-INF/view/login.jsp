<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
<link href="<c:url value="resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="resources/css/animate.css" />"
	rel="stylesheet">
<link href="<c:url value="resources/css/default.css" />"
	rel="stylesheet">
<link href="<c:url value="resources/css/component.css" />"
	rel="stylesheet">
</head>
<body>
	<div class="md-modal md-effect-18" id="modal-18">
		<div class="md-content">
			<h3>Login</h3>
			<div>
				<form name="f" action="<c:url value='j_spring_security_check'/>"
					method="POST">
					<div class="form-group">
						<label for="email">Email address:</label> <input type="text"
							class="form-control" name="j_username">
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control" name='j_password'>
					</div>
					<div class="form-group form-check">
						<label class="form-check-label"> <input
							class="form-check-input" type="checkbox"> Remember me
						</label>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
	<div class="container">
		<!-- Top Navigation -->

		<div class="codrops-top clearfix"></div>
		<header>
			<div class="row">
				<div class="col-sm-12 my-auto">
					<div class="mx-auto w-60 p-3 text-white text-center poni">
						<h2>ByRA's Web Service</h2>
						<p>please login before you change something!!!</p>
					</div>
				</div>
			</div>
		</header>
		<div class="main clearfix">
			<div class="row">
				<div class="col-sm-12 my-auto">
					<div class="mx-auto w-60 p-3 text-white text-center poni">
						<button class="md-trigger md-setperspective" data-modal="modal-18">Make
							way!</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<div class="md-overlay"></div>
	<!-- the overlay element -->

	<!-- classie.js by @desandro: https://github.com/desandro/classie -->
	<script src="<c:url value="resources/js/classie.js" />"></script>
	<script src="<c:url value="resources/js/modalEffects.js" />"></script>

	<!-- for the blur effect -->
	<!-- by @derSchepp https://github.com/Schepp/CSS-Filters-Polyfill -->
</body>
</html>