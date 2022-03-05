<%-- 
    Document   : reviewReport
    Created on : Feb 22, 2022, 8:53:16 PM
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
			<a href="index.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
		</div>
		<div id="navbar-collapse-02" class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				
                                <li class="propClone dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <img style="width: 18px;" class="img-circle img-responsive" src="../images/avatar.png" alt=""/>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Account</a></li>
                                        <li><a href="accountList.jsp">Account List</a></li>
                                        <li><a href="reviewReport.jsp">Review Report</a></li>
                                        <li><a href="#">Category Management</a></li>
                                        <li><a href="#">Log out</a></li>
                                    </ul>
                                </li>
                                
			</ul>
		</div>
	</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<div class="text-pageheader">
					<div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.0s">
						 ADMIN DASHBOARD
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
			<h1 class="text-center latestitems">Review Report</h1>
		</div>
		<div class="wow-hr type_short">
			<span class="wow-hr-h">
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			</span>
		</div>
	</div>
	<div id="edd_checkout_wrap" class="col-md-12">
			<div id="edd_checkout_cart_wrap">
                            <table class="table" style="width: 100%;">
				<thead>
				<tr >
					<th >
						 Template ID
					</th>
					<th >
						 Seller Name
					</th>
					<th >
						 Reporter Name
					</th>
                                        <th style="width: 40%;">
						 Content
					</th>
                                        <th >
						 Status
					</th>
				</tr>
				</thead>
				<tbody>
				<tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
					<td>
                                            <a href="#">01</a>
					</td>
					<td>
                                            <a href="#">Tony Quach</a>
					</td>
					<td>
                                            <a href="#">Thanh Pham</a>
					</td>
                                        <td>
                                            template xau vl
					</td>
                                        <td>
                                            Waiting
                                        </td>
                                        <td>
                                            <form>
                                                <input type="submit" value="Approve">
                                                <input type="submit" value="Disappprove">
                                            </form>
                                        </td>
				</tr>
				</tbody>
				
				</table>
			</div>
		
	</div>
    <div class="edd_clearfix properties-box " style="margin-bottom: 20px;">
                            <h3>User Info</h3>
				<ul class="unstyle">
                                        <li><b class="propertyname">Username:</b> thanhpham0412</li>
                                        <li><b class="propertyname">First Name</b> Thanh</li>
					<li><b class="propertyname">Last Name</b> Pham Trong</li>
					<li><b class="propertyname">Email</b> thanh@gmail.com</li>
					<li><b class="propertyname">Avatar</b> <img style="width:25px; display: inline-block;" class="img-circle img-responsive" src="../images/avatar.png" alt=""/></li>
					<li><b class="propertyname">Role:</b> Buyer</li>
					<li><b class="propertyname">Create Date:</b> 31/1/2022</li>
					<li><b class="propertyname">Ban Status</b> -</li>
					<li><b class="propertyname">Unban Date</b> -</li>
				</ul>
		</div>
    <div class="edd_clearfix properties-box " style="margin-bottom: 20px;">
                            <h3>Template Info</h3>
				<ul class="unstyle">
                                        <li><b class="propertyname">Name:</b> Scorilo</li>
                                        <li><b class="propertyname">Category:</b> E-Commerce</li>
                                        <li><b class="propertyname">Images:</b> 
                                            <img style="width:100px; display: inline-block;" class="img-responsive" src="../images/avatar.png" alt=""/>
                                            <img style="width:100px; display: inline-block;" class="img-responsive" src="../images/product2-3.jpg" alt=""/>
                                            <img style="width:100px; display: inline-block;" class="img-responsive" src="../images/product2-2.jpg" alt=""/>
                                        </li>
					<li><b class="propertyname">Description:</b> abcxyz</li>
					<li><b class="propertyname">Live Demo:</b> ....</li>
					<li><b class="propertyname">Price:</b> 30$</li>
					<li><b class="propertyname">Source Code:</b> ...</li>
					<li><b class="propertyname">Create Date:</b> 31/1/2022</li>
					<li><b class="propertyname">Last Modified Date:</b> 31/1/2022</li>
					<li><b class="propertyname">Sold Quantity:</b> 3</li>
				</ul>
                            <form>
                                <input type="hidden" name="temId" value="01">
                                <input type="submit" value="Delete this Template">
                            </form>
                            
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

</body>
</html>