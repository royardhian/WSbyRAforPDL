<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	
}

p {
	margin: 0px;
}

#container {
	width: 630px;
	margin: 0 auto;
	border: 1px solid wheat;
	border-radius: 10px;
	box-shadow: 0px 10px 10px black;
	padding: 8px;
	margin-top: 20px;
}

#box {
	border: 1px solid burlywood;
	width: 400px;
	padding: 10px;
	background: bisque;
	margin-bottom: 20px;
}

input {
	margin: 10px 0;
}

input[type=text] {
	padding: 2px;
}

.result {
	color: red;
	margin-left: 5px;
}
</style>
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <link href="<c:url value="resources/css/bootstrap.min.css" />" rel="stylesheet">

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#button")
								.on(
										"click",
										function() {
											var rowEsub = $("#rowEsub").val();
											$
													.ajax({
														type : "post",
														dataType : "json",
														url : "checkRowEsub",
														data : "name="
																+ rowEsub,
														success : function(data) {
															content = "<table width='100%'><tr><td>id</td><td>file</td></tr>";
															for (i = 0; i < data.length; i++) {
																content += "<tr><td>"
																		+ data[i].dbName
																		+ "</td><td>"
																		+ data[i].dbServer
																		+ "</td></tr>";
															}
															content += "</table>";

															$(".result").html(
																	content);
														},
														error : function(data) {
															alert(data);
														}
													});
										});
						$("#resetPassword")
								.on(
										"click",
										function() {
											var rowEsub = $("#server").val();
											$
													.ajax({
														type : "post",
														dataType : "json",
														url : "resetPass",
														data : "name="
																+ rowEsub,
														success : function(data) {
															content = "<table width='100%'><tr><td>id</td><td>file</td></tr>";
															for (i = 0; i < data.length; i++) {
																content += "<tr><td>"
																		+ data[i].dbName
																		+ "</td><td>"
																		+ data[i].dbServer
																		+ "</td></tr>";
															}
															content += "</table>";

															$(".result").html(
																	content);
														},
														error : function(data) {
															alert(data);
														}
													});
										});
					});
</script>
<title>Spring-jQuery</title>
</head>
<body>
	<h3>Welcome to Automation PDL (BETA)</h3>

	<div id="box">
		<table>
			<tr>
				<td><input type="button" value="Reset Password"
					id="resetPassword" style="width: 200px;" disabled /></td>
				<td><select name="server" id="server" style="width: 150px;">
						<c:forEach var="db" items="${webURL}">
							<option value="${db.dbServer}">${db.dbName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="button" value="Check EsubSOA" id="button"
					style="width: 200px;" /></td>
				<td><input type="number" id="rowEsub" value="10"
					style="width: 150px;" /></td>
			</tr>
		</table>
	</div>
	Hasil :
	<div class="result">-</div>
</body>
</html>
