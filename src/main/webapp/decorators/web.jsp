<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><decorator:title default="Trang Chủ"/></title>
<!-- css -->
<link href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" type="text/css" media="all"/>
<link href="<c:url value='/template/web/css/style.css' />" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
	<!-- Header -->
	<%@include file="/common/web/header.jsp" %>
	<!-- Header -->

	<div class="container">
		<decorator:body/>
	</div>

	<!-- Footer -->
	<%@include file="/common/web/footer.jsp" %>
	<!-- Footer -->
<script type="text/javascript" src="<c:url value='/template/web/jquery/jquery.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script>
</body>
</html>