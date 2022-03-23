<%-- 
    Document   : templateDetail
    Created on : Feb 22, 2022, 8:55:30 PM
    Author     : Thanh
--%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,models.Template" %>
<c:set var="user" value="${sessionScope.userSession}"/>
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
                                    Lorem Ipsum
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <!-- CONTENT =============================-->
        <c:set var="template" value="${requestScope.template}"/>
        <section class="item content">
            <div class="container toparea">
                <div class="underlined-title">
                    <div class="editContent">
                        <h1 class="text-center latestitems">${template.name}</h1>
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
                            <c:forEach var="image" items="${images}">
                                <img src="${pageContext.request.contextPath}/uploads/${image}" alt="">
                            </c:forEach>

                            <div class="clearfix">
                            </div>
                            <br/>
                            <div class="product-details text-left">
                                <p>
                                    ${template.description}
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <c:choose>
                            <c:when test="${user == null}">
                                <a href="${pageContext.request.contextPath}/User/login" class="btn btn-buynow">$${template.price} - Add to Cart</a>
                            </c:when>
                            <c:when test="${user.role == 'seller'}">
                                <a class="btn btn-buynow" disabled>$${template.price} - Add to Cart</a>
                            </c:when>
                            <c:otherwise>
                                <a href="${pageContext.request.contextPath}/Cart/add?templateId=${template.id}" class="btn btn-buynow">$${template.price} - Add to Cart</a>
                            </c:otherwise>
                        </c:choose>
                        <div class="properties-box">
                            <ul class="unstyle">
                                <li><b class="propertyname">Name:</b> ${template.name}</li>
                                <li><b class="propertyname">Seller:</b> ${seller}</li>
                                <li><b class="propertyname">Category:</b> ${requestScope.category}</li>
                                <li><b class="propertyname">Hosted: </b> <a target="__blank" href="${template.hostUrl}">Visit Website</a></li>
                                <li><b class="propertyname">Created Date:</b> ${template.createdDate}</li>
                                <li><b class="propertyname">Last Modified Date:</b> ${template.lastModifiedDate}</li>
                                <li><b class="propertyname">Download(s):</b> ${template.soldQuantity}</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <form class="properties-box" method="POST" action="./report">
                            <input type="text" name="templateId" value="${template.id}" hidden>
                            <textarea name="content" placeholder="What's wrong with this template?" style="width: 90%; height:100px;" required></textarea>
                            <input type="submit" value="Report">
                        </form>
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
