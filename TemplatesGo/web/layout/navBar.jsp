<%-- 
    Document   : navBar
    Created on : Mar 9, 2022, 8:26:07 PM
    Author     : Thanh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List,models.User" %>
<c:set var="user" value="${sessionScope.userSession}"/>
<c:set var="role" value="${user.role}"/>

<c:if test="${empty role}">
    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a href="${pageContext.request.contextPath}/Template/listing" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Template/listing">Home</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/User/login">Log in</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/User/register">Sign up</a></li>
                </ul>
            </div>
        </div>
    </nav>
</c:if>
<c:if test="${role == 'buyer'}">
    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a href="${pageContext.request.contextPath}/Template/listing" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Template/listing">Home</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Cart/cart">Cart</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Cart/checkout">Checkout</a></li>
                    <li class="propClone dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img style="width: 25px;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/avatars/${user.avatar}" alt=""/>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/User/account">Account</a></li>
                            <li><a href="${pageContext.request.contextPath}/User/logout">Log out</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</c:if>
<c:if test="${role == 'seller'}">
    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a href="${pageContext.request.contextPath}/Template/listing" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Seller/dashboard?pageNo=1">Dashboard</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Template/submit">Submit Template</a></li>
                    <li class="propClone dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img style="width: 25px;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/avatars/${user.avatar}" alt=""/>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/User/account">Account</a></li>
                            <li><a href="${pageContext.request.contextPath}/User/logout">Log out</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</c:if>
<c:if test="${role == 'admin'}">
    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a href="#" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Admin/userList?pageNo=1">Account List</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Admin/reportList?pageNo=1">Review Report</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/Admin/categoryManager">Category Management</a></li>
                    <li class="propClone dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img style="width: 25px;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/avatars/${user.avatar}" alt=""/>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/User/account">Account</a></li>
                            <li><a href="${pageContext.request.contextPath}/User/logout">Log out</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</c:if>



