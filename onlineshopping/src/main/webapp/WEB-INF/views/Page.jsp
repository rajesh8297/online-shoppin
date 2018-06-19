<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contxtRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>OnlineShopping - ${title}</title>
<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Bootstrap  -->
<%-- <link href="${css}/boosttrap-readable.css" rel="stylesheet"> --%>

<%-- <link href="${css}/personal-css.css" rel="stylesheet"> --%>
<link href="${css}/Slate.css" rel="stylesheet">
<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!--nav bar is loaded here  -->
		<%@include file="./shared/navbar.jsp"%>
		
		<div class="content">
			<!--home content load here  -->
			<!-- user click home loaded  this -->
			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- user clichk this loaded about us -->
			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>
			<!-- user click  -->
			<c:if test="${userClickServices == true}">
				<%@include file="service.jsp"%>
			</c:if>
			<!--user clichk this loaded contactus  -->
			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			<!-- user cliv branche load this  -->
			<c:if test="${userClickBranches == true}">
				<%@include file="branch.jsp"%>
			</c:if>

		</div>

		<!-- footer content load here -->
		<%@include file="./shared/footer.jsp"%>


		<!-- JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<!-- custom js-->
		<script src="${js}/myapp.js"></script>
	</div>
</body>


</html>
