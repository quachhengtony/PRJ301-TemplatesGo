<%-- 
    Document   : product
    Created on : Mar 1, 2022, 2:44:22 PM
    Author     : Thanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700" rel="stylesheet">
<link href="../css/categoryStyle.css" rel="stylesheet" type="text/css"/>
<title>Template's Name</title>
</head>
<body>

<!-- HEADER =============================-->
<header class="item header margin-top-0">
<div class="wrapper">
	<nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
			<i class="fa fa-bars"></i>
			<span class="sr-only">Toggle navigation</span>
			</button>
			<a href="../general/home.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
		</div>
		<div id="navbar-collapse-02" class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="propClone"><a href="../general/home.jsp">Home</a></li>
				<li class="propClone"><a href="../seller/postTemplate.jsp">Submit Template</a></li>
				<li class="propClone"><a href="cart.jsp">Cart</a></li>
				<li class="propClone"><a href="checkout.jsp">Checkout</a></li>
                                <li class="propClone dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <img style="width: 18px;" class="img-circle img-responsive" src="../images/avatar.png" alt=""/>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Profile</a></li>
                                        <li><a href="#">Log out</a></li>
                                    </ul>
                                </li>
                                
			</ul>
		</div>
	</div>
	</nav>
    <!-- CATEGORY ====================-->
    <ul class="nav nav-pills nav-fill" id='category'>
        <li class="nav-item">
            <a class="nav-link active" href="#">Art</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Education</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Business</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">E-Commerce</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Real Estate</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Society</a>
        </li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">More
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Category 1</a></li>
                <li><a href="#">Category 2</a></li>
                <li><a href="#">Category 3</a></li>
            </ul>
        </li>
    </ul>
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
				<img src="../images/product2-2.jpg" alt="">
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

<!-- FOOTER =============================-->
<div class="footer text-center">
	<div class="container">
		<div class="row">
			<p class="footernote">
				 Connect with Scorilo
			</p>
			<ul class="social-iconsfooter">
				<li><a href="#"><i class="fa fa-phone"></i></a></li>
				<li><a href="#"><i class="fa fa-facebook"></i></a></li>
				<li><a href="#"><i class="fa fa-twitter"></i></a></li>
				<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
				<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
			</ul>
			<p>
				 &copy; 2017 Your Website Name<br/>
				Scorilo - Free template by <a href="https://www.wowthemes.net/">WowThemesNet</a>
			</p>
		</div>
	</div>
</div>

<!-- Load JS here for greater good =============================-->
<script src="../js/jquery-.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/anim.js"></script>

</body>
</html>
