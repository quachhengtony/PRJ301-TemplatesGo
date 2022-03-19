<%-- 
    Document   : reviewReport
    Created on : Feb 22, 2022, 8:53:16 PM
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
<title>Review Report</title>
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
                                            Status<br/>
                                            <form action="${pageContext.request.contextPath}/Admin/reportList">
                                                <select name="status" onchange="this.form.submit()"> 
                                                    <option value="All" ${param.status == 'All' ? 'selected' : ''}>All</option>
                                                    <option value="Waiting" ${param.status == 'Waiting' ? 'selected' : ''}>Waiting</option>
                                                    <option value="Approved" ${param.status == 'Approved' ? 'selected' : ''}>Approved</option>
                                                    <option value="Not approved" ${param.status == 'Not approved' ? 'selected' : ''}>Not approved</option>
                                                </select>
                                                <input type="hidden" name="pageNo" value="${param.pageNo}">
                                            </form>
                                                 
					</th>
				</tr>
				</thead>
				<tbody>
                                    <c:forEach var="report" items="${requestScope.list}">
				<tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
					<td>
                                            <a href="${pageContext.request.contextPath}/Admin/reportList?pageNo=${param.pageNo}&templateId=${report.templateId}">
                                                ${report.templateId}
                                            </a>
					</td>
					<td>
                                            <a href="${pageContext.request.contextPath}/Admin/reportList?pageNo=${param.pageNo}&userId=${requestScope.sellerIdList[report.id]}">
                                                ${requestScope.sellerNameList[report.id]}
                                            </a>
					</td>
					<td>
                                            <a href="${pageContext.request.contextPath}/Admin/reportList?pageNo=${param.pageNo}&userId=${requestScope.reporterIdList[report.id]}">
                                                ${requestScope.reporterNameList[report.id]}
                                            </a>
					</td>
                                        <td>
                                            ${report.content}
					</td>
                                        <td>
                                            ${report.status}
                                        </td>
                                        <td>
                                            <c:if test="${report.status == 'Waiting'}">
                                            <form action="${pageContext.request.contextPath}/Admin/updateReport">
                                                <input type="hidden" name="pageNo" value="${param.pageNo}">
                                                <input type="hidden" name="reportId" value="${report.id}">
                                                <input type="submit" name="action" value="Approved">
                                                <input type="submit" name="action" value="Not approved">
                                            </form>
                                            </c:if>
                                        </td>
				</tr>
                                    </c:forEach>
                                </tbody>

                            </table>
                            <nav aria-label="Page navigation example" style="text-align: center">
                                <ul class="pagination justify-content-center">
                                    <%
                                        int size = (int) request.getAttribute("size");
                                        int pageNo = Integer.parseInt(request.getParameter("pageNo"));
                                        int remainder = size % 4 == 0 ? 0 : 1;
                                        for (int i = 1; i <= size / 4 + remainder; i++) {
                                    %>
                                    <li class="page-item <%if (i == pageNo) {
                                out.print("active");
                            }%>">
                                        <a class="page-link " href="${pageContext.request.contextPath}/Admin/reportList?pageNo=<%=i%>"><%=i%></a>
                                    </li>
                                    <%
                                        }
                                    %>

                                </ul> 
                            </nav>
                        </div>

        </div>
    <c:if test="${not empty requestScope.user}">
        <div class="edd_clearfix properties-box " style="margin-bottom: 20px;">
            <h3>User Info</h3>
            <ul class="unstyle">
                <li><b class="propertyname">Username:</b> ${user.username}</li>
                <li><b class="propertyname">First Name</b> ${user.firstName}</li>
                <li><b class="propertyname">Last Name</b> ${user.lastName}</li>
                <li><b class="propertyname">Email</b> ${user.email}</li>
                <li><b class="propertyname">Avatar</b> <img style="width:25px; display: inline-block;" class="img-circle img-responsive" src="../images/avatar.png" alt=""/></li>
                <li><b class="propertyname">Role:</b> ${user.role}</li>
                <li><b class="propertyname">Create Date:</b> ${user.createDate}</li>
                <li><b class="propertyname">Ban Status</b> ${user.banStatus}</li>
                <li><b class="propertyname">Unban Date</b> ${user.unbanDate}</li>
            </ul>
        </div>
    </c:if>
    <c:if test="${not empty requestScope.template}">
        <div class="edd_clearfix properties-box " style="margin-bottom: 20px;">
            <h3>Template Info</h3>
            <ul class="unstyle">
                <li><b class="propertyname">Name:</b> ${template.name}</li>
                <li><b class="propertyname">Category:</b> ${requestScope.category}</li>
                <li><b class="propertyname">Images:</b> 
                    <img style="width:100px; display: inline-block;" class="img-responsive" src="../images/avatar.png" alt=""/>
                    <img style="width:100px; display: inline-block;" class="img-responsive" src="../images/product2-3.jpg" alt=""/>
                    <img style="width:100px; display: inline-block;" class="img-responsive" src="../images/product2-2.jpg" alt=""/>
                </li>
                <li><b class="propertyname">Description:</b> ${template.description}</li>
                <li><b class="propertyname">Live Demo:</b> ${template.hostUrl}</li>
                <li><b class="propertyname">Price:</b> ${template.price}$</li>
                <li><b class="propertyname">Source Code:</b> ...</li>
                <li><b class="propertyname">Create Date:</b> ${template.createdDate}</li>
                <li><b class="propertyname">Last Modified Date:</b> ${template.lastModifiedDate}</li>
                <li><b class="propertyname">Sold Quantity:</b> ${template.soldQuantity}</li>
            </ul>
            <form>
                <input type="hidden" name="temId" value="01">
                <input type="submit" value="Delete this Template">
            </form>

        </div>
    </c:if>
</div>
</section>



<%@include file="../layout/footer.jsp" %>

<!-- SCRIPTS =============================-->
<script src="${pageContext.request.contextPath}/js/jquery-.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/anim.js"></script>

</body>
</html>
