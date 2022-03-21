<%-- 
    Document   : sellerDashboard
    Created on : Feb 22, 2022, 8:52:22 PM
    Author     : Thanh
--%>
<%@page import="models.TemplateImage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
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
        <title>Seller Dashboard</title>
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
                                    Dashboard Seller
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
                        <h1 class="text-center latestitems">SELLER DASHBOARD</h1>
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

                    <table id="edd_checkout_cart" class="ajaxed">
                        <thead>
                            <tr class="edd_cart_header_row">
                                <th>
                                    Item Image
                                </th>
                                <th colspan="2" style="text-align: center">
                                    Item Info
                                </th>
                                <th>
                                    Update
                                </th>
                                <th>
                                    Delete
                                </th>

                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="template" items="${requestScope.tempList}">
                                <tr class="edd_cart_item">
                            <form action="./update" method="POST" enctype="multipart/form-data">
                                    
                                <td >
                                    <div >
                                        <c:forEach var="img" items="${imgList[template.id]}">
                                            <img width="120"  src="${pageContext.request.contextPath}/uploads/${img.path}" alt=""> <br/><br/>
                                        </c:forEach>

                                    </div>
                                    Update Images: <input type="file" name="images" accept="image/*" multiple="">
                                </td>
                                <td >
                                    <br><b>Name:</b> <input type="text" name="name" value="${template.name}" required=""> </br>   
                                    <br><b>Category:</b> 
                                    <select name="categoryId" required="" >
                                        <c:forEach var="cate" items="${requestScope.cateList}">
                                            <option value="${cate.id}" ${template.categoryId == cate.id ? "selected" : ""}>${cate.category}</option>
                                        </c:forEach>
                                    </select>
                                    </br> 
                                    <br><b>Description:</b> <textarea name="description">${template.description}</textarea> </br> 
                                    <br><b>Host URL:</b> <input type="text" name="hostURL" value="${template.hostUrl}" required=""> </br>
                                </td>
                                <td >
                                    <br><b>Source Code:</b> <a href="${pageContext.request.contextPath}/uploads/${template.sourceCodePath}" download="">Download</a> </br>
                                    Update Source Code: <input type="file" name="sourceCode" accept=".zip">
                                    <br><b>Price:</b> $<input type="number" step="0.01" min="0" name="price" value="${template.price}" required=""> </br>   
                                    <br><b>Sold Quantity:</b> <input type="number" name="soldQuantity" value="${template.soldQuantity}" readonly=""> </br> 
                                    <br><b>Date Created:</b> <input type="text" name="soldQuantity" value="${template.createdDate}" readonly=""></br> 
                                    <input type="hidden" name="templateId" value="${template.id}">
                                    <input type="hidden" name="pageNo" value="${param.pageNo}">
                                </td>
                                <td >
                                    <br><input class="edd_cart_remove_item_btn" type="submit" value="Update"></br> 
                                </td>
                            </form>
                            <td> 
                                <br><a class="edd_cart_remove_item_btn" href="${pageContext.request.contextPath}/Seller/remove?id=${template.id}&pageNo=${param.pageNo}"><button>Remove</button></a></br> 
                            </td>

                            </tr>

                        </c:forEach>
                        </tbody>

                    </table>

                </div>
                <nav aria-label="Page navigation example" style="text-align: center">
                    <ul class="pagination justify-content-center">
                        <% int size = (int) request.getAttribute("size");
                            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
                            int remainder = size % 4 == 0 ? 0 : 1;
                            for (int i = 1; i <= size / 4 + remainder; i++) {
                        %>
                        <li class="page-item <%if (i == pageNo)
                                out.print("active");%>">
                            <a class="page-link" href="${pageContext.request.contextPath}/Seller/dashboard?pageNo=<%=i%>"><%=i%></a>
                        </li>
                        <%}%>
                    </ul>
                </nav>

            </div>
        </section>    

        <%@include file="../layout/footer.jsp" %>

        <!-- SCRIPTS =============================-->
        <script src="${pageContext.request.contextPath}/js/jquery-.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/anim.js"></script>

    </body>
</html>
