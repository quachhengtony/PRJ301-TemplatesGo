<%-- 
    Document   : accountList
    Created on : Feb 22, 2022, 8:53:26 PM
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
<title>Account List</title>
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
			<h1 class="text-center latestitems">Account List</h1>
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
		<form id="edd_checkout_cart_form" method="post">
			<div id="edd_checkout_cart_wrap">
				<table id="edd_checkout_cart" class="ajaxed">
				<thead>
				<tr class="edd_cart_header_row">
					<th class="edd_cart_item_name">
						 Username
					</th>
					<th class="edd_cart_item_price">
						 Full Name
					</th>
					<th class="edd_cart_actions">
						 Email
					</th>
                                        <th class="edd_cart_actions">
						 Role
					</th>
                                        <th class="edd_cart_actions">
						 Ban Account
					</th>
				</tr>
				</thead>
				<tbody>
				<tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
                                    <td>
                                        thanhpham0412
                                    </td>
                                    <td>
                                        Pham Trong Thanh
                                    </td>
                                    <td>
                                        thanh@gmail.com
                                    </td>
                                    <td>
                                        Buyer
                                    </td>
                                    <td>
                                        <form>
                                            Input days: <input style="width: 50px;" type="number" name="banDate" required="">
                                            <input type="submit" value="Ban">
                                        </form>
                                    </td>
					
				</tr>
				</tbody>
				</table>
			</div>
		</form>
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
