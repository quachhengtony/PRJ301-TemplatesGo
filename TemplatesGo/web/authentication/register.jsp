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
        <title>Register Page</title>
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
                        <c:set var="errors" value="${requestScope.errors}"/>
                        <c:if test="${not empty errors['password']}">
                            <div class="alert alert-danger">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                ${errors['password']}
                            </div>
                        </c:if>
                         <c:if test="${not empty errors['username']}">
                            <div class="alert alert-danger">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                ${errors['username']}
                            </div>
                        </c:if>
                         <c:if test="${not empty errors['email']}">
                            <div class="alert alert-danger">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                ${errors['email']}
                            </div>
                        </c:if>
                        <form method="POST" action="./register" id="contactform">
                            <div class="form">
                                <input type="text" name="username" placeholder="Your Username *" value="${param.username}" required>
                                <input type="text" name="firstName" placeholder="Your First Name *" value="${param.firstName}" required>
                                <input type="text" name="lastName" placeholder="Your Last Name *" value="${param.lastName}" required>
                                <input type="email" name="email" placeholder="Your E-mail Address *" value="${param.email}" required>
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
                                Already have an account? <a href="${pageContext.request.contextPath}/authentication/login.jsp">Login</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <%@include file="../layout/footer.jsp" %>
    <!-- SCRIPTS =============================-->
    <script src="js/jquery-.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/anim.js"></script>
    <script src="js/validate.js"></script>
</body>
</html>