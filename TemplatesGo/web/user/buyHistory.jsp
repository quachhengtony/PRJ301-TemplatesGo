<%-- 
    Document   : orderHistory
    Created on : Mar 22, 2022, 2:59:37 PM
    Author     : Tony
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="spent" value="${0}"/>
<c:forEach var="template" items="${requestScope.templates}">
    <c:set var="spent" value="${spent + template.price}" />
</c:forEach>
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
                                    Buy History
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

                                    </th>
                                    <th class="edd_cart_item_name">
                                        Template
                                    </th>
                                    <th class="edd_cart_item_price">
                                        Price ($<fmt:formatNumber value="${spent}" minFractionDigits="2" maxFractionDigits="2"/>)
                                    </th>
                                    <th class="edd_cart_actions">
                                        Source Code
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="template" items="${requestScope.templates}" varStatus="loop">
                                    <tr class="edd_cart_item" >
                                        <td>${loop.index}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/Template/detail?id=${template.id}">${template.name}</a>
                                        </td>
                                        <td>
                                            $${template.price}
                                        </td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/uploads/${template.sourceCodePath}" download>Download</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
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

