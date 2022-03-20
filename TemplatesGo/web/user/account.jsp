<%-- 
    Document   : account
    Created on : Mar 2, 2022, 9:22:18 PM
    Author     : Tony Quach
--%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,models.User" %>
<c:set var="user" value="${requestScope.user}"/>
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
        <title>Account</title>
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
                                    Account
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
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="done">
                            <div class="alert alert-success">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                Your message has been sent. Thank you!
                            </div>
                        </div>
                        <div class="alert">
                            <div class="slide-text">
                                <img src="${pageContext.request.contextPath}/avatars/${user.avatar}" alt="Avatar" onclick="handleTriggerAvatarUpload()">
                            </div>
                        </div>
                        <form action="./update" method="POST" id="contactform" enctype="multipart/form-data">
                            <input type="text" name="id" value="${user.id}" hidden>
                            <input type="file" id="avatarImage" name="avatar" accept="image/*" style="display:none">
                            <input type="text" name="username" value="${user.username}">
                            <input type="text" name="firstName" value="${user.firstName}">
                            <input type="text" name="lastName" value="${user.lastName}">
                            <input type="email" value="${user.email}" disabled>
                            <input type="password" name="password" placeholder="Your New Password *" minlength="8" value="${user.password}">
                            <label for="role">Registered as a: ${user.role}</label>
                            <input type="submit" class="clearfix btn" value="Update">
                        </form>
                    </div>
                </div>
            </div>
        </section>

        <%@include file="../layout/footer.jsp" %>
        <!-- SCRIPTS =============================-->
        <script type="text/javascript">
            function handleTriggerAvatarUpload() {
                document.getElementById("avatarImage").click();
            }
        </script>
        <script src="${pageContext.request.contextPath}/js/avatarImageUpload.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/anim.js"></script>
        <script src="${pageContext.request.contextPath}/js/validate.js"></script>
    </body>
</html>
