<%-- 
    Document   : header
    Created on : May 25, 2023, 4:24:50 PM
    Author     : van12
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="model.User"%>

<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
    <head>

        <title>JSP Page</title>
        <style>
            nav{
                height:70px;
                width:100%;
                padding: 0 2rem;
                position: sticky;
                display:flex;
                justify-content: space-between;
                background-color: #fff;
                box-shadow: 0px 1px 3px #ccc;
                top:0;
                z-index:99;
            }

            nav .nav-left, nav .nav-right{
                display:flex;
                align-items: center;
            }

            nav .nav-left  img{
                width:40px;
                height: 40px;
                border-radius: 50%;
            }

            nav .nav-left  input{
                height:40px;
                padding:5px 10px;
                border:none;
                border-radius: 25px;
                outline:none;
                background-color: #eee;
                margin-left: 10px;
            }

            nav .nav-middle{
                display:flex;
                align-items:flex-end;
                padding-bottom: 5px;
            }

            nav .nav-middle a{
                text-decoration: none;
                color:#333;
                padding:10px;
                margin:0px 10px;
            }

            nav .nav-middle a.active{
                color:royalblue;
                position:relative;
            }

            nav .nav-middle a.active::after{
                content:'';
                width:100%;
                height:3px;
                position:absolute;
                bottom:0;
                left:0;
                background:royalblue;
            }

            nav .nav-middle a > i{
                font-size: 25px;
            }

            nav .nav-right .profile img, .container .left-panel .profile img{
                height:40px;
                width:40px;
                background-size: cover;
                border-radius: 50%;
                cursor: pointer;
            }

            nav .nav-right a{
                text-decoration: none;
                color:#333;
                height:40px;
                width:40px;
                border-radius: 50%;
                background:#eee;
                display:grid;
                place-items: center;
                margin-left:1rem;
            }

            nav .nav-right a > i{
                font-size:18px;
            }
            /* CSS for the search container */
            .search-container {
                position: relative;
                width: 300px;
                margin: 20px auto;
            }
            /* CSS for the suggestions container */
            .suggestions-container {
                position: absolute;
                width: 100%;
                max-height: 200px;
                overflow-y: auto;
                background-color: #fff;
                border: 1px solid #ccc;
                border-top: none;
                border-radius: 0 0 4px 4px;
                z-index: 1;
            }

            /* CSS for the suggestion items */
            .suggestion-item {
                display: flex;
                align-items: center;
                padding: 10px;
                cursor: pointer;
                transition: background-color 0.3s ease;
            }

            .suggestion-item:hover,
            .suggestion-item.active {
                background-color: #f2f2f2;
            }

            .suggestion-item img {
                width: 30px;
                height: 30px;
                border-radius: 50%;
                margin-right: 10px;
            }

            .suggestion-item span {
                font-size: 14px;
                font-weight: bold;
            }

            .suggestion-item .mutual-friends {
                margin-left: auto;
                font-size: 12px;
                color: #999;
            }
        </style>
    </head>
    <body>
        <% String id = (String) session.getAttribute("id");
            if (id == null || id.equals("")) {
                response.sendRedirect("http://localhost:8080/SocialNetworkIRCNV/Authen/login.jsp");
                return;
            }
        %>
        <nav style="background-color: #70d8ff; min-width: 1045px;">
            <div class="nav-left">
                <a href="${pageContext.request.contextPath}/HomePage/HomePage.jsp">
                    <img src="../data/img/logo.jpg" alt="Logo">
                </a>

                <div class="search-container">
                    <input id="searchInput" type="text" class="search-input" placeholder="Search...">
                    <div class="suggestions-container" id="searchResults"></div>
                </div>

            </div>
            <jsp:include page = "/GetInfor"></jsp:include>


            <% User user = (User) request.getAttribute("user");
                if (user != null) {
            %>

            <div class="nav-right">
                <span class="profile">
                    <a href="${pageContext.request.contextPath}/PersonalPage/ProfileInfo.jsp    ">
                        <img src="<%=user.getImgUser()%>" alt="alt" style="width: 100%;"/>
                    </a>
                </span>



                <a href="../BoxChat/GetFriendAndBoxChat">
                    <i class="fas fa-comments"></i>
                </a>

                <a href="#">
                    <i class="fa fa-bell"></i>
                </a>
                <form action="http://localhost:8080/SocialNetworkIRCNV/CheckLogin" method="post">
                    <button type="submit" style="background: none; border: none">
                        <a href="#">
                            <i class="fa-solid fa-right-from-bracket"></i>
                        </a>
                    </button>
                </form>

                <a href="#">
                    <i class="fas fa-ellipsis-h"></i>
                </a>

            </div>
            <%
            } else {

            %>
            <div class="nav-right">
                <span class="profile">
                    <a href="${pageContext.request.contextPath}/Authen/login.jsp">
                        <i class="fa-solid fa-user">
                            <img src="https://e7.pngegg.com/pngimages/178/595/png-clipart-user-profile-computer-icons-login-user-avatars-monochrome-black.png" alt="alt" style="width: 100%;"/>
                        </i>
                    </a>
                </span>



                <a href="#">
                    <i class="fas fa-comments"></i>
                </a>

                <a href="#">
                    <i class="fa fa-bell"></i>
                </a>


                <a href="#">
                    <i class="fas fa-ellipsis-h"></i>
                </a>

            </div>
            <%}
            %>
        </nav>
        <script src="/SocialNetworkIRCNV/js/search.js"></script>
    </body>
</html>
