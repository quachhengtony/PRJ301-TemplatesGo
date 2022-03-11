<%-- 
    Document   : navBar
    Created on : Mar 9, 2022, 8:26:07 PM
    Author     : Thanh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="role" value="admin"/>

<c:if test="${role == ''}">
    <nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
                    <i class="fa fa-bars"></i>
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a href="${pageContext.request.contextPath}/user/home.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/user/home.jsp">Home</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/authentication/login.jsp">Log in</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/authentication/register.jsp">Sign up</a></li>
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
                <a href="${pageContext.request.contextPath}/user/home.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/user/home.jsp">Home</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/buyer/cart.jsp">Cart</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/buyer/checkout.jsp">Checkout</a></li>
                    <li class="propClone dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img style="width: 18px;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/images/avatar.png" alt=""/>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/user/account.jsp">Account</a></li>
                            <li><a href="#">Log out</a></li>
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
                <a href="${pageContext.request.contextPath}/user/home.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/seller/sellerDashboard.jsp">Dashboard</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/seller/postTemplate.jsp">Submit Template</a></li>
                    <li class="propClone dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img style="width: 18px;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/images/avatar.png" alt=""/>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/user/account.jsp">Account</a></li>
                            <li><a href="#">Log out</a></li>
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
                <a href="${pageContext.request.contextPath}/user/home.jsp" class="navbar-brand brand"> TEMPLATESGO </a>
            </div>
            <div id="navbar-collapse-02" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="propClone"><a href="${pageContext.request.contextPath}/admin/accountList.jsp">Account List</a></li>
                    <li class="propClone"><a href="${pageContext.request.contextPath}/admin/reviewReport.jsp">Review Report</a></li>
                    <li class="propClone"><a href="#">Category Management</a></li>
                    <li class="propClone dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img style="width: 18px;" class="img-circle img-responsive" src="${pageContext.request.contextPath}/images/avatar.png" alt=""/>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/user/account.jsp">Account</a></li>
                            <li><a href="#">Log out</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</c:if>


                