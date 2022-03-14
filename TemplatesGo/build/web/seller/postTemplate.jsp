<%-- 
    Document   : postTemplate
    Created on : Feb 22, 2022, 8:52:52 PM
    Author     : Thanh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700" rel="stylesheet">
<title>Submit Template</title>
</head>
<body>

<!-- HEADER =============================-->
<header class="item header margin-top-0">
<div class="wrapper">
	<%@include file="../layout/navBar.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<div class="text-pageheader">
					<div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.0s">
						 Submit Template
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</header>

<!-- CONTENT =============================-->
<section class="item content">
<div class="container toparea">
	<div class="underlined-title">
		<div class="editContent">
			<h1 class="text-center latestitems">Template Info</h1>
		</div>
		<div class="wow-hr type_short">
			<span class="wow-hr-h">
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			</span>
		</div>
	</div>
	<div id="edd_checkout_wrap" class="col-md-8 col-md-offset-2">
		<div id="edd_checkout_form_wrap" class="edd_clearfix">
			<form action="${pageContext.request.contextPath}/Seller/add" method="POST" enctype="multipart/form-data">
				<fieldset>
					<legend>Template Info</legend>
					<p >
						<label >
						Name <span class="edd-required-indicator">*</span></label>
                                                <input class="edd-input" type="text" name="name" placeholder="Template's name" value="" required="">
					</p>
                                        <p>
                                            <label>
                                                Category <span class="edd-required-indicator">*</span>
                                            </label>
                                            <select name="categoryId" required="">
                                                <c:forEach var="cate" items="${requestScope.cateList}">
                                                    <option value="${cate.id}">${cate.category}</option>
                                                </c:forEach>
                                            </select>

                                        </p>
					<p>
						<label>
						Description <span class="edd-required-indicator">*</span></label>
                                                <input class="edd-input" type="text" name="description" placeholder="Template's description" value="" required="">
					</p>
                                        <p>
						<label>
						Live Demo <span class="edd-required-indicator">*</span></label>
                                                <input class="edd-input" type="text" name="hostURL" placeholder="Host URL" value="" required="">
					</p>
                                        <p>
						<label>
						Images <span class="edd-required-indicator">*</span></label>
                                                <input type="file" name="images" accept="image/*" multiple="" required="">
					</p>
                                        <p>
						<label>
						Price <span class="edd-required-indicator">*</span></label>
                                                <input class="edd-input" type="number" name="price" placeholder="Price" value="" required="">
					</p>
                                        <p>
						<label>
						Source Code <span class="edd-required-indicator">*</span> (.zip file only)</label>
                                                <input type="file" name="sourceCode" accept=".zip" required="">
					</p>
                                        <input type="hidden" name="sellerId" value="4">
				</fieldset>
				<fieldset id="edd_purchase_submit">
                                    <input type="submit" class="edd-submit button" value="SUBMIT">
				</fieldset>
			</form>
		</div>
	</div>
</div>
</section>


<%@include file="../layout/footer.jsp" %>

<!-- SCRIPTS =============================-->
<script src="${pageContext.request.contextPath}/js/jquery-.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/anim.js"></script>

</body>
</html>
