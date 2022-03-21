<%-- 
    Document   : home
    Created on : Feb 22, 2022, 8:51:23 PM
    Author     : Thanh
--%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,models.Template" %>
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
        <link href="${pageContext.request.contextPath}/css/searchBarStyle.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/categoryStyle.css" rel="stylesheet" type="text/css"/>
        <title>Home Page</title>
    </head>
    <body>


        <!-- HEADER =============================-->
        <header class="item header margin-top-0">
            <div class="wrapper">
                <%@include file="../layout/navBar.jsp" %>
                 <c:set var="list" value="${requestScope.cate}"/> 
                <!-- CATEGORY ====================-->
                <ul class="nav nav-pills nav-fill" id='category'>
                   
                            <li class="nav-item">
                                <c:forEach var="o" items="${list}"> 
                                    
                        <a class="nav-link" href="./listing?category=${o.id}">${o.category}</a>
                         </c:forEach>
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
        <form class="form" method="GET" action="./listing"> 
            <div class="container" id="searchBar">
                <div class=" justify-content-center align-items-center">
                    <div class="input-group">
                        <input name="search" value="" class="form-control" type="text">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="submit" id="addressSearch">
                                <span>  <i class="fa fa-search"></i> Search</span>
                        </button>
                        </span>
                    </div>
                </div>
            </div>
        </form>
        <div class='container' id='filterBar'>
            <select class="form-select" aria-label="Default select example" onchange="this.options[this.selectedIndex].value && (window.location = this.options[this.selectedIndex].value);">
                <option selected>Sort by</option>
                <option value="./listing?sort=latest">Latest First</option>
                <option value="./listing?sort=oldest">Oldest First</option>
                <option value="./listing?sort=bestSeller">Best seller</option>
                <option value="./listing?sort=priceAscending">Price Ascending</option>
                <option value="./listing?sort=priceDescending">Price Descending</option>
            </select>
            <form onchange="this.options[this.selectedIndex].value && (window.location = this.options[this.selectedIndex].value);">
                <label for="priceRange"> Or find templates from $0 to:</label>
                <input type="number" id="priceRange" name="maxPrice" min="0" max="100">
            </form>
        </div>



        <!-- LATEST ITEMS =============================-->
        <section class="item content">
            <div class="container">
                <div class="underlined-title">
                    <div class="editContent">
                        <h1 class="text-center latestitems">TEMPLATE LISTING</h1>
                    </div>
                    <div class="wow-hr type_short">
                        <span class="wow-hr-h">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </span>
                    </div>
                </div>
                <c:set var="templates" value="${requestScope.templates}"/>
                <c:set var="numberOfPages" value="${requestScope.numberOfPages}"/>
                <c:set var="currentPage" value="${requestScope.currentPage}"/>
                <div class="row">


                    <c:forEach var="template" items="${templates}">
                        <div class="col-md-4">
                            <div class="productbox">
                                <div class="fadeshop">
                                    <div class="captionshop text-center" style="display: none;">
                                        <h3>${template.name}</h3>
                                        <p>
                                            ${template.description}
                                        </p>
                                        <p>
                                            <a href="#" class="learn-more detailslearn"><i class="fa fa-shopping-cart"></i> Add to Cart</a>
                                            <a href="${pageContext.request.contextPath}/Template/detail?id=${template.id}" class="learn-more detailslearn"><i class="fa fa-link"></i> Details</a>
                                        </p>
                                    </div>
                                    <span class="maxproduct"><img src="${pageContext.request.contextPath}/images/product1-1.jpg" alt=""></span>
                                </div>
                                <div class="product-details">
                                    <a href="#">
                                        <h1>${template.name}</h1>
                                    </a>
                                    <span class="price">
                                        <span class="edd_price">$${template.price}</span>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
                <div >
                    <nav aria-label="Page navigation example" style="text-align: center">
                        <ul class="pagination justify-content-center">
                            <c:if test="${currentPage != 1}">
                                <li class="page-item">
                                    <a class="page-link" href="./listing?page=${currentPage - 1}" tabindex="-1">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach begin="1" end="${numberOfPages}" varStatus="loop">
                                <c:choose>
                                    <c:when test="${currentPage == loop.index}">
                                        <li class="page-item"><a class="page-link" style="background-color:graytext" href="./listing?page=${loop.index}">${loop.index}</a></li>
                                        </c:when>
                                        <c:otherwise>
                                        <li class="page-item"><a class="page-link" href="./listing?page=${loop.index}">${loop.index}</a></li>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                                <c:if test="${currentPage < numberOfPages}">
                                <li class="page-item">
                                    <a class="page-link" href="./listing?page=${currentPage + 1}">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </nav>  
                </div>
        </section>

        <%@include file="../layout/footer.jsp" %>

        <!-- SCRIPTS =============================-->
        <script src="${pageContext.request.contextPath}/js/jquery-.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/anim.js"></script>
        <script>
                //----HOVER CAPTION---//	  
                jQuery(document).ready(function ($) {
                    $('.fadeshop').hover(
                            function () {
                                $(this).find('.captionshop').fadeIn(150);
                            },
                            function () {
                                $(this).find('.captionshop').fadeOut(150);
                            }
                    );
                });
        </script>

    </body>
</html>
