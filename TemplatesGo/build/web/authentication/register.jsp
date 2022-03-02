<%-- 
    Document   : register
    Created on : Mar 2, 2022, 8:54:32 PM
    Author     : Tony Quach
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
                            <a href="index.jsp" class="navbar-brand brand"> TemplatesGo </a>
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
                                    Join Our Awesome Marketplace
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
                        <h1 class="text-center latestitems">Register</h1>
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
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="done">
                            <div class="alert alert-success">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                Your message has been sent. Thank you!
                            </div>
                        </div>
                        <form method="post" action="contact.php" id="contactform">
                            <div class="form">
                                <input type="text" name="username" placeholder="Your Username *" required>
                                <input type="text" name="firstName" placeholder="Your First Name *" required>
                                <input type="text" name="lastName" placeholder="Your Last Name *" required>
                                <input type="text" name="email" placeholder="Your E-mail Address *" required>
                                <input type="password" name="password" placeholder="Your Password *" minlength="8" required>
                                <input type="password" name="confirmPassword" placeholder="Confirm Password *" minlength="8" required>
                                <label for="role">Register as a:</label>
                                <select name="role" id="role">
                                    <option value="buyer">Buyer</option>
                                    <option value="seller">Seller</option>
                                </select>
                                <input type="submit" id="submit" class="clearfix btn" value="Register">
                            </div>
                        </form>
                        <div>
                            <div class="alert alert-success">
                                Already have an account? <a href=""#">Login</a>
                            </div>
                        </div>
                    </div>
                </div>
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
                    Connect with TemplatesGo
                </p>
                <ul class="social-iconsfooter">
                    <li><a href="#"><i class="fa fa-phone"></i></a></li>
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                </ul>
                <p>
                    &copy; 2022 TemplatesGo<br/>
                </p>
            </div>
        </div>
    </div>
    <!-- SCRIPTS =============================-->
    <script src="js/jquery-.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/anim.js"></script>
    <script src="js/validate.js"></script>
</body>
</html>