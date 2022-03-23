<%-- 
    Document   : accountList
    Created on : Feb 22, 2022, 8:53:26 PM
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
  
        <div class="col-md-12" >
			<div >
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
                                <c:forEach var="user" items="${requestScope.list}">
				<tr class="edd_cart_item" >
                                    
                                    <td>
                                        <a href="${pageContext.request.contextPath}/Admin/userList?pageNo=${param.pageNo}&userId=${user.id}">${user.username}</a>
                                    </td>
                                    <td>
                                        ${user.firstName}  ${user.lastName} 
                                    </td>
                                    <td>
                                        ${user.email}
                                    </td>
                                    <td>
                                        ${user.role}
                                    </td>
                                    <td>
                                        <c:if test="${user.banStatus == true}">
                                            Ban until: ${user.unbanDate} 
                                        </c:if>
                                        <c:if test="${user.banStatus == false}">
                                            <form action="${pageContext.request.contextPath}/Admin/banUser" method="POST">
                                                Input days: <input style="width: 50px;" type="number" min="1" name="numberBanDate" required="">
                                                <input type="hidden" name="userId" value="${user.id}">
                                                <input type="hidden" name="pageNo" value="${param.pageNo}">
                                                <input type="submit" value="Ban">
                                            </form>
                                        </c:if>
                                            
                                    </td>
                                    
				</tr>
                                </c:forEach>
				</tbody>
				</table>
			</div>
                <nav aria-label="Page navigation example" style="text-align: center">
                    <ul class="pagination justify-content-center">
                        <%
                            int size = (int)request.getAttribute("size");
                            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
                            int remainder = size % 4 == 0 ? 0 : 1;
                            for (int i = 1; i <= size / 4 + remainder; i++) {
                        %>
                        <li class="page-item <%if (i == pageNo) out.print("active"); %>">
                            <a class="page-link " href="${pageContext.request.contextPath}/Admin/userList?pageNo=<%=i%>"><%=i%></a>
                        </li>
                        <%
                            }
                        %>
                        
                    </ul> 
                </nav>
                        <c:if test="${not empty requestScope.user}">
		<div class="edd_clearfix properties-box col-md-6 col-md-offset-3" style="margin-bottom: 20px;">
                            <h3>User Info</h3>
				<ul class="unstyle">
                                        <li><b class="propertyname">Username:</b> ${user.username}</li>
                                        <li><b class="propertyname">First Name</b> ${user.firstName}</li>
					<li><b class="propertyname">Last Name</b> ${user.lastName}</li>
					<li><b class="propertyname">Email</b> ${user.email}</li>
					<li><b class="propertyname">Avatar</b> 
                                            <img style="width:50px; display: inline-block;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/avatars/${user.avatar}" alt=""/>
                                        </li>
					<li><b class="propertyname">Role:</b> ${user.role}</li>
					<li><b class="propertyname">Create Date:</b> ${user.createDate}</li>
					<li><b class="propertyname">Ban Status</b> ${user.banStatus}</li>
					<li><b class="propertyname">Unban Date</b> ${user.unbanDate}</li>
				</ul>
		</div>
                </c:if>
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
