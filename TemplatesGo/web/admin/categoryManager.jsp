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
			<h1 class="text-center latestitems">Category Manager</h1>
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
			<div id="edd_checkout_cart_wrap">
                            <table class="table" >
				<thead>
				<tr >
					<th >
                                            Category Name
					</th>
					<th >
                                            Update  
					</th>
                                        
				</tr>
				</thead>
                                <tbody>
                                    <c:forEach var="cate" items="${requestScope.cateList}">
                                    <form action="${pageContext.request.contextPath}/Admin/updateCategory">
                                        <tr class="edd_cart_item" id="edd_cart_item_0_25" >
                                            <td>
                                                <input type="text" name="cateName" value="${cate.category}">
                                                <input type="hidden" name="cateId" value="${cate.id}">
                                            </td>
                                            <td>
                                                <input type="submit" value="Update">  
                                            </td>

                                        </tr>
                                    </form>
                                    </c:forEach>
                                </tbody>

                            </table>
                            
                        </div>

        </div>
    <div class="col-md-8 col-md-offset-2" style="margin-bottom: 20px">
        <form action="${pageContext.request.contextPath}/Admin/addCategory">
            Add new category: <input type="text" name="cateName" value="${requestScope.cateNameForm}" required=""> <span style="color: red">${requestScope.errorMsg}</span> <br/>
            <input type="submit" value="Add">
        </form>
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
