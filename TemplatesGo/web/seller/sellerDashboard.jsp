<%-- 
    Document   : sellerDashboard
    Created on : Feb 22, 2022, 8:52:22 PM
    Author     : Thanh
--%>

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
    </head>
    <body>

        <!-- HEADER =============================-->
        <header class="item header margin-top-0">
            <div class="wrapper">
                <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
                    <div class="container">
                        <div class="navbar-header">
                            <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                                <i class="fa fa-bars"></i>
                                <span class="sr-only">Toggle navigation</span>
                            </button>
                            <a href="index.jsp" class="navbar-brand brand"> templatesgo </a>
                        </div>
                        <div id="navbar-collapse-02" class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="propClone"><a href="index.jsp">Home</a></li>
                                <li class="propClone"><a href="shop.jsp">Shop</a></li>
                                <li class="propClone"><a href="product.jsp">Product</a></li>
                                <li class="propClone"><a href="checkout.jsp">Checkout</a></li>
                                <li class="propClone"><a href="contact.jsp">Contact</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
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
                    <div class="wrap">
   <div class="search">
      <input type="text" class="searchTerm" placeholder="What are you looking for?">
      <button type="submit" class="searchButton">
        <i class="fa fa-search"></i>
     </button>
   </div>
</div>
 <button type="button"  style="background-color:antiquewhite; border-color:blue; color:black" > SORT !</button>
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
                                            Item Info
                                        </th>
                                        <th class="edd_cart_actions">
                                            <br> Actions</br>
                                        </th>

                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="edd_cart_item" id="edd_cart_item_0_25" data-download-id="25">
                                        <td class="edd_cart_item_name">
                                            <div class="edd_cart_item_image">
                                                <img width="25" height="25" src="images/scorilo2-70x70.jpg" alt="">
                                            </div>
                                            <span class="edd_checkout_cart_item_title">Name: </span>
                                            <span class="edd_checkout_cart_item_title">Category :  </span>
                                        </td>
                                        <td class="edd_cart_item_price">
                                            <br>Price : $11.99 </br>   
                                            <br> Sold : 99 </br> 
                                            <br> Date Created: </br> 
                                        </td>
                                        <td class="edd_cart_actions">
                                            <br><a class="edd_cart_remove_item_btn" href="/Remove">Remove</a></br> 
                                            <br><a class="edd_cart_remove_item_btn" href="/Update">Update</a></br> 
                                        </td>
                                    </tr>
                                </tbody>
                                <tfoot>



                                </tfoot>
                            </table>
                        </div>
                    </form>

                </div>
            </div>
        </section>

        <!-- CALL TO ACTION =============================-->
        <section class="content-block" style="background-color:#00bba7;">
            <div class="container text-center">
                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1">
                        <div class="item" data-scrollreveal="enter top over 0.4s after 0.1s">
                            <h1 class="callactiontitle"> Promote Items Area Give Discount to Buyers <span class="callactionbutton"><i class="fa fa-gift"></i> WOW24TH</span>
                            </h1>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- FOOTER =============================-->
        <div class="footer text-center">
            <div class="container">
                <div class="row">
                    <p class="footernote">
                        Connect with Scorilo
                    </p>
                    <ul class="social-iconsfooter">
                        <li><a href="#"><i class="fa fa-phone"></i></a></li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                    </ul>
                    <p>
                        &copy; 2017 Your Website Name<br/>
                        Scorilo - Free template by <a href="https://www.wowthemes.net/">WowThemesNet</a>
                    </p>
                </div>
            </div>
        </div>

        <!-- SCRIPTS =============================-->
        <script src="../js/jquery-.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/anim.js"></script>

    </body>
</html>
