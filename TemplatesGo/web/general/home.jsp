<%-- 
    Document   : index
    Created on : Mar 1, 2022, 2:43:51 PM
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
<link href="../css/searchBarStyle.css" rel="stylesheet" type="text/css"/>
<link href="../css/categoryStyle.css" rel="stylesheet" type="text/css"/>
<title>Home Page</title>
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
			<a href="home.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
		</div>
		<div id="navbar-collapse-02" class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="propClone"><a href="home.jsp">Home</a></li>
				<li class="propClone"><a href="login.jsp">Log in</a></li>
				<li class="propClone"><a href="register.jsp">Sign up</a></li>
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

	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<div class="text-homeimage">
					<div class="maintext-image" data-scrollreveal="enter top over 1.5s after 0.1s">
						 TemplatesGo
					</div>
					<div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.3s">
						 Hassle-free Buying & Selling of High Quality Templates
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</header>
        <!-- SEARCH BAR AND FILTER ==============================-->
<div class="container" id="searchBar">
    <div class=" justify-content-center align-items-center">
        <div class="col-md-6 ">
            <div class="form"> 
                <i class="fa fa-search"></i> <input type="text" class="form-control form-input" placeholder="Search template...">  
            </div>
        </div>
    </div>
</div>

<div class='container' id='filterBar'>
    <select class="form-select" aria-label="Default select example">
        <option selected>Sort by</option>
        <option value="1">Lastest</option>
        <option value="2">Oldest</option>
        <option value="3">Best seller</option>
    </select>
    <button type="button" class="btn btn-secondary">Sort</button>

</div>


	
	<!-- LATEST ITEMS =============================-->
<section class="item content">
	<div class="container">
		<div class="underlined-title">
			<div class="editContent">
				<h1 class="text-center latestitems">TEMPLATES LIST</h1>
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
			<div class="col-md-4">
				<div class="productbox">
					<div class="fadeshop">
						<div class="captionshop text-center" style="display: none;">
							<h3>Item Name</h3>
							<p>
								 This is a short excerpt to generally describe what the item is about.
							</p>
							<p>
								<a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
								<a href="../buyer/templateDetail.jsp" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
							</p>
						</div>
						<span class="maxproduct"><img src="../images/product1-1.jpg" alt=""></span>
					</div>
					<div class="product-details">
						<a href="#">
						<h1>Calypso Theme</h1>
						</a>
						<span class="price">
						<span class="edd_price">$49.00</span>
						</span>
					</div>
				</div>
			</div>
			<!-- /.productbox -->
			<div class="col-md-4">
				<div class="productbox">
					<div class="fadeshop">
						<div class="captionshop text-center" style="display: none;">
							<h3>Item Name</h3>
							<p>
								 This is a short excerpt to generally describe what the item is about.
							</p>
							<p>
								<a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
								<a href="../buyer/templateDetail.jsp" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
							</p>
						</div>
						<span class="maxproduct"><img src="../images/product2.jpg" alt=""></span>
					</div>
					<div class="product-details">
						<a href="#">
						<h1>FastSell Theme</h1>
						</a>
						<span class="price">
						<span class="edd_price">$49.00</span>
						</span>
					</div>
				</div>
			</div>
			<!-- /.productbox -->
			<div class="col-md-4">
				<div class="productbox">
					<div class="fadeshop">
						<div class="captionshop text-center" style="display: none;">
							<h3>Item Name</h3>
							<p>
								 This is a short excerpt to generally describe what the item is about.
							</p>
							<p>
								<a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
								<a href="../buyer/templateDetail.jsp" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
							</p>
						</div>
						<span class="maxproduct"><img src="../images/product2-3.jpg" alt=""></span>
					</div>
					<div class="product-details">
						<a href="#">
						<h1>Biscaya Theme</h1>
						</a>
						<span class="price">
						<span class="edd_price">$49.00</span>
						</span>
					</div>
				</div>
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

<!-- SCRIPTS =============================-->
<script src="../js/jquery-.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/anim.js"></script>
<script>
//----HOVER CAPTION---//	  
jQuery(document).ready(function ($) {
	$('.fadeshop').hover(
		function(){
			$(this).find('.captionshop').fadeIn(150);
		},
		function(){
			$(this).find('.captionshop').fadeOut(150);
		}
	);
});
</script>
	
</body>
</html>