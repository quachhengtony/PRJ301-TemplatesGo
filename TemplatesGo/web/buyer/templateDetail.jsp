<%-- 
    Document   : templateDetail
    Created on : Feb 22, 2022, 8:55:30 PM
    Author     : Thanh
--%>

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
<link href="${pageContext.request.contextPath}/css/categoryStyle.css" rel="stylesheet" type="text/css"/>
<title>Template's Name</title>
</head>
<body>

<!-- HEADER =============================-->
<header class="item header margin-top-0">
<div class="wrapper">
    <%@include file="../layout/navBar.jsp" %>
    <!-- CATEGORY ====================-->
    
    <!------------------------------------->
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<div class="text-pageheader">
					<div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.0s">
						 Product Name
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
			<h1 class="text-center latestitems">Awesome Product</h1>
		</div>
		<div class="wow-hr type_short">
			<span class="wow-hr-h">
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			</span>
		</div>
	</div>
	<div class="row">
		<div class="col-md-8">
			<div class="productbox">
				<img src="${pageContext.request.contextPath}/images/product2-2.jpg" alt="">
				<div class="clearfix">
				</div>
				<br/>
				<div class="product-details text-left">
					<p>
						Your description here. Serenity is a highly-professional & modern website theme crafted with you, the user, in mind. This light-weight theme is generous, built with custom types and enough shortcodes to customize each page according to your project. You will notice some examples of pages in demo, but this theme can do much more.
					</p>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<a href="#" class="btn btn-buynow">$49.00 - Add to Cart</a>
			<div class="properties-box">
				<ul class="unstyle">
                                        <li><b class="propertyname">Name:</b> Scorilo</li>
                                        <li><b class="propertyname">Seller:</b> Thanh Pham</li>
					<li><b class="propertyname">Category:</b> Education</li>
					<li><b class="propertyname">Live Demo:</b> link...</li>
					<li><b class="propertyname">Created Date:</b> 1/3/2022</li>
					<li><b class="propertyname">Last Modified Date</b> 1/3/2022</li>
					<li><b class="propertyname">Sold Quantity:</b> 3</li>
				</ul>
			</div>
		</div>
                <div class="col-md-4">
			<div class="properties-box">
                            <textarea placeholder="Your suggestion about template is here..." style="width: 90%; height:100px;"></textarea>
                            <input type="submit" value="Report">
			</div>
		</div>
	</div>
</div>
</section>

    <%@include file="../layout/footer.jsp" %>


<!-- Load JS here for greater good =============================-->
<script src="${pageContext.request.contextPath}/js/jquery-.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/anim.js"></script>

</body>
</html>
