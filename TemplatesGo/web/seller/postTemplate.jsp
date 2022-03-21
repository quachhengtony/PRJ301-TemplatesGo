<%-- 
    Document   : postTemplate
    Created on : Feb 22, 2022, 8:52:52 PM
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
        <title>Submit Template</title>
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
                                    Submit Template
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
                        <h1 class="text-center latestitems">Template Information</h1>
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
                        </div>
                    </form>
                    <div id="edd_checkout_form_wrap" class="edd_clearfix">
                        <form id="edd_purchase_form" class="edd_form" action="./post" method="POST" enctype="multipart/form-data">
                            <fieldset id="edd_checkout_user_info">
                                
                                <p id="edd-email-wrap">
                                    <label class="edd-label" for="edd-email">
                                        Name: <span class="edd-required-indicator">*</span></label>
                                    <input class="edd-input required" type="text" name="name" id="edd-email" value="" required>
                                </p>
                                <p id="edd-first-name-wrap">
                                    <label class="edd-label" for="edd-first">
                                        Category: <span class="edd-required-indicator">*</span>
                                    </label>
                                    <select name="category" required>
                                        <option value="business">Business</option>
                                    </select>
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Description: <span class="edd-required-indicator">*</span></label>
                                    <!--<input class="edd-input" type="text" name="description" id="edd-last" placeholder="" value="">-->
                                    <textarea id="edd-last" class="edd-input" name="description" maxlength="3000" required></textarea>
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Host URL: </label>
                                    <input class="edd-input" type="text" name="hostURL" id="edd-last" value="">
                                </p>

                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Price: <span class="edd-required-indicator">*</span></label>
                                    <input class="edd-input" type="number" min="0" max="100" step=".1" name="price" id="edd-last" value="" required>
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Source Code: <span class="edd-required-indicator">*</span></label>
                                    <input type="file" id="myFile" name="sourceCode" accept=".zip,.rar,.7zip" required>
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Images: <span class="edd-required-indicator">*</span></label>
                                    <input type="file" id="myFile" name="file" accept="image/*" multiple required>
                                </p>

                            </fieldset>
                            <fieldset id="edd_purchase_submit">
                                <input type="submit" class="edd-submit button" id="edd-purchase-button" name="edd-purchase" value="SUBMIT">
                            </fieldset>
                        </form>

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
