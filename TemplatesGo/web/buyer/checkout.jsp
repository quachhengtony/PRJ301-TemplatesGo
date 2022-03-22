<%-- 
    Document   : checkout
    Created on : Feb 22, 2022, 8:55:50 PM
    Author     : Thanh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,models.User" %>
<c:set var="user" value="${sessionScope.userSession}"/>
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
        <title>Checkout Page</title>
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
                                    Checkout
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
                        <h1 class="text-center latestitems">MAKE PAYMENT</h1>
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
                                            Item Name
                                        </th>
                                        <th class="edd_cart_item_price">
                                            Item Price
                                        </th>
                                        <th class="edd_cart_actions">
                                            Actions
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
                                        <td class="edd_cart_item_name">
                                            <div class="edd_cart_item_image">
                                                <img width="25" height="25" src="../images/scorilo2-70x70.jpg" alt="">
                                            </div>
                                            <span class="edd_checkout_cart_item_title">Audio Item - Single License</span>
                                        </td>
                                        <td class="edd_cart_item_price">
                                            $11.99
                                        </td>
                                        <td class="edd_cart_actions">
                                            <a class="edd_cart_remove_item_btn" href="${pageContext.request.contextPath}/Cart/remove?templateId=${item.id}">Remove</a>
                                        </td>
                                    </tr>
                                </tbody>
                                <tfoot>

                                    <tr class="edd_cart_footer_row edd_cart_discount_row" style="display:none;">
                                        <th colspan="5" class="edd_cart_discount">
                                        </th>
                                    </tr>
                                    <tr class="edd_cart_footer_row">
                                        <th colspan="5" class="edd_cart_total">
                                            Total: <span class="edd_cart_amount" data-subtotal="11.99" data-total="11.99">$11.99</span>
                                        </th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                    </form>
                    <div id="edd_checkout_form_wrap" class="edd_clearfix">
                        <form id="edd_purchase_form" class="edd_form" action="./InsertHis" method="POST">
                            <fieldset id="edd_checkout_user_info">
                                <legend>Personal Info</legend>
                                <p id="edd-email-wrap">
                                    <label class="edd-label" for="edd-email">
                                        Email Address <span class="edd-required-indicator">*</span></label>
                                    <input class="edd-input required" type="email" name="edd_email" id="edd-email" value="${user.email}" disabled>
                                </p>
                                <p id="edd-first-name-wrap">
                                    <label class="edd-label" for="edd-first">
                                        First Name <span class="edd-required-indicator">*</span>
                                    </label>
                                    <input class="edd-input required" type="text" name="edd_first" id="edd-first" value="${user.firstName}" disabled>
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Last Name </label>
                                    <input class="edd-input" type="text" name="edd_last" id="edd-last" value="${user.lastName}" disabled>
                                </p>
                            </fieldset>
                            <fieldset id="edd_checkout_user_info">
                                <legend>Payment Method</legend>
                                <p id="edd-email-wrap">
                                    <label class="edd-label" for="edd-email">
                                        Card Information <span class="edd-required-indicator">*</span></label>
                                    <input class="edd-input required" id="ccn" type="tel" inputmode="numeric" pattern="[0-9\s]{13,19}" autocomplete="cc-number" maxlength="19" placeholder="xxxx xxxx xxxx xxxx">
                                    <!--<input class="edd-input required" type="email" name="edd_email" placeholder="1234 1234 1234 1234" id="edd-email" value="" required>-->
                                </p>
                                <p id="edd-first-name-wrap">
                                    <label class="edd-label" for="edd-first">
                                        Name on Card <span class="edd-required-indicator">*</span>
                                    </label>
                                    <input class="edd-input required" type="text" name="edd_first" placeholder="Thanh Pham" id="edd-first" value="" required>
                                </p>
                                <p id="edd-last-name-wrap">
                                    <label class="edd-label" for="edd-last">
                                        Country/Region <span class="edd-required-indicator">*</span></label>
                                    <input class="edd-input" type="text" name="edd_last" id="edd-last" placeholder="Viet Nam" value="" required>
                                </p>
                            </fieldset>
                            <fieldset id="edd_purchase_submit">
                                <p id="edd_final_total_wrap">
                                    <strong>Purchase Total:</strong>
                                    <span class="edd_cart_amount" data-subtotal="11.99" data-total="11.99">$11.99</span>
                                </p>
                                <a class="edd-submit button" href="${pageContext.request.contextPath}/Order/InsertHis">Purchase</a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </section>


        <%@include file="../layout/footer.jsp" %>


        <!-- SCRIPTS =============================-->
        <script src="../js/jquery-.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/anim.js"></script>

    </body>
</html>
