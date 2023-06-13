<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script> 
        <script src="https://kit.fontawesome.com/24c45437f2.js" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://kit.fontawesome.com/24c45437f2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/24c45437f2.js" crossorigin="anonymous"></script>

    </head>
    <link rel="stylesheet" href="/SocialNetworkIRCNV/css/post.css">
    <link rel="stylesheet" href="/SocialNetworkIRCNV/css/postshare.css">
    <style>
        .profile-container{
            padding: 20px 17%;
            background-color: #cdf1ff;
        }
        body{
        }
        .cover-img{
            width:100%;
            border-radius:3px;
            margin-bottom:14px;
            object-fit: cover;
            height:200px;

        }
        .profile-details{
            background: white;
            padding: 20px;
            border-radius: 10px;
            display:flex;
            align-items: flex-start;
            justify-content: space-between;
        }
        .pd-row{
            display: flex;
            align-items:flex-start;

        }
        .pd-image{
            width:130px;
            height:130px;
            margin-right:30px;
            border-radius: 3px;
            object-fit: cover;
        }
        .pd-row div h3{
            font-size: 25px;
            font-weight:600;

        }
        .pd-row div p{
            font-size:13px;

        }
        .pd-row div img{
            width: 25px;
            height:25px;
            border-radius: 50%;

        }
        .pd-row .profile-name{
            margin-top:17px;
        }
        .pd-right button{
            background: #1876f2;
            border: 3px;
            outline : 0;
            padding: 6px 10px;
            display: inline-flex;
            align-items: center;
            color:#fff;
            border-radius:4px;
            margin-left:10px;
            cursor:pointer;
            margin-top:20px;
        }
        .pd-right button .icon{
            margin-right:5px;
        }
        .pd-right button:first-child{
            background:#e4e6eb;
            color:#000;
        }
        .pd-right{
            text-align: right;
        }
        .pd-right .more{
            background: #e4e6eb;
            border-radius:4px;
            padding:6px 12px;
            display: inline-flex;
            margin-top: 30px;

        }
        .write-post-container{
            background: white;
            border-radius:10px;
            padding: 20px;
            color:#626262;
        }
        .user-profile{
            display:flex;
            align-items: center;
        }
        .user-profile img{
            width:45px;
            height:45px;
            border-radius:50%;
            margin-right: 10px;
            object-fit: cover;
        }
        .user-profile p{
            margin-bottom: -5px;
            font-weight: 500;
            color:#626262;
            margin-top:4px;
            margin-bottom:1px;
        }
        .user-profile option{
            font-size: 12px;
        }
        .post-input-container{
        }
        .post-input-container textarea{
            width:100%;
            border:0;
            outline:0;
            border-bottom: 1px solid #ccc;
            background:transparent;
            resize: none;
        }
        .add-post-links{
            display: flex;
            margin-top: 10px;
        }
        .add-post-links a{
            text-decoration: none;
            display: flex;
            align-items: center;
            color: #626262;
            margin-right:30px;
            font-size:13px;
        }
        .add-post-links a .icon{
            margin-right: 10px;
        }
        .add-post-links .send-post{
            background: #1876f2;
            border: 3px;
            outline : 0;
            padding: 6px 13px;
            display: inline-flex;
            align-items: center;
            color:#fff;
            border-radius:4px;
            cursor:pointer;
            font-size:15px;
        }
        .profile-info{
            display: flex;
            align-self: flex-start;
            justify-content: space-between;
            margin-top: 20px;
        }
        .info-col{
            flex-basis:36%;
            margin-right:20px;
        }
        .post-col{
            flex-basis: 63%;
        }
        .profile-intro{
            background: white;
            padding:20px;
            margin-bottom: 20px;
            border-radius: 10px;

        }
        .profile-intro h3{
            font-weight: 600;
            margin-top:-1px;
        }

        .intro-text{
            text-align: center;
            margin: 10px 0;
            font-size: 15px;
        }
        .profile-intro hr{
            border:0;
            height:1px;
            background: #ccc;
            margin:24px 0;
        }
        .profile-intro ul li{
            list-style: none;
            font-size:15px;

            display: flex;
            align-items: center;
        }
        .profile-intro ul li .intro{
            margin-right: 10px;
        }
        .pd-right .sendmessage button  {
            background:#1876f2;
            color: white;
        }
        .title-box{
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
        .title-box a{
            text-decoration: none;
            color: #1876f2;
            font-size:14px;
        }
        .friend-box{
            display: grid;
            grid-template-columns: repeat(3,auto);

        }
        .friend-box div img{
            width:80%;
            height:90%;
            cursor:pointer;
            padding-bottom:30px;
            border-radius:10px;
        }
        .friend-box div{
            position: relative;
        }
        .friend-box p{
            position: absolute;
            bottom:0;
            left:0;
        }
        .post-container{
            border-radius:10px;
            padding:20px;
            color:#626262;
            margin:20px 0;
        }
        .user-profile span{
            font-size:13px;
            color: #9a9a9a;
        }
        .post-text{
            color:#9a9a9a;
            margin:15px 0;
            font-size:15px;
        }
        .post-text span{
            color:#626262;
            font-weight: 500;
        }
        .post-img{
            width:100%;

            border-radius:4px;
            margin-bottom:5px;
        }
        .post-row{
            display:flex;
            align-items:center;
            justify-content: space-between;

        }
        .activity-icons div .icon{
            width:18px;
            margin-right: 10px;
            border-bottom: 2px;
        }
        .activity-icons div{
            display:inline-flex;
            align-items: center;
            margin-right: 30px;
        }
        @media(max-width:900px){
            .profile-container{
                padding:20px 5%;
            }
            .profile-details{
                flex-wrap:wrap;
            }
            .pd-right{
                text-align: left;
                margin-top:15px;

            }
            .pd-right button{
                margin-left: 0;
                margin-right: 10px;
            }
            .pd-row div h3{
                font-size:16px;
            }
            #previewImage{
                margin:5px 0px;
                max-height: 530px;
            }
        }


        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f1f1f1;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            font-size: 10px;
        }

        .dropdown-content a:hover {
            background-color: #ddd;
        }

        .dropdown:hover .dropdown-content {
            display: block;
        }

        .dropdown:hover .dropbtn {
            background-color: #3e8e41;
        }

        .post .post-top{
            display:flex;
            align-items: center;
            padding:10px;
            padding-bottom: 0;
        }

        .post .post-top .dp{
            width:60px;
            height:60px;
            border-radius: 50%;
            overflow:hidden;
        }

        .post .post-top .dp > img{

            cursor:pointer;
        }

        .post .post-top .post-info{
            margin-left:10px;
            font-weight: bold;
        }

        .post .post-top .post-info .name{
            cursor:pointer;
            font-size:20px;
            margin-bottom: 0;
        }

        .post .post-top .post-info .time{
            font-size:14px;
            cursor:pointer;
        }

        .post .post-top i{
            margin-left:auto;
            cursor: pointer;
        }

        .post .post-top > input{
            height:40px;
            padding:5px 10px;
            border-radius:25px;
            outline:none;
            border:none;
            flex:1;
            background:#eee;
            margin-left:10px;
        }

        .post .post-content{
            font-size:20px;
            font-weight:normal;
            padding: 10px;
            max-height: 600px;
        }

        .post .post-content > img{
            margin:5px 0px;
            max-height: 530px;
        }
        .post .post-content p{
            margin-left: 20px;
        }
        .post .counter{
            padding: 10px 10%;
            color: #00587c;
        }
        .post .counter{
            box-shadow: 1px solid #ddd;
            display:flex;
            justify-content: space-between;
            padding:0 10%;
            font-size: 18px;
            font-family: sans-serif;

        }
        .post .post-bottom{
            box-shadow: 1px solid #ddd;
            display:flex;
            justify-content: space-between;
            padding:0 10%;
            font-size: 18px;
            font-family: sans-serif;

        }

        .post .post-bottom .action{
            padding:10px;
            border-radius:10px;
            transition: .3s ease-in;
            cursor: pointer;
        }

        .post .post-bottom .action:hover{
            background:#eee;
        }
    </style>
    <body style="margin: 0">
        <div id="offset" style="display: none"  >1</div>
        <div id="UID" style="display: none"  >${param.UID}</div>
        <header>
            <%@include file="../block/header.jsp" %>
        </header>
        <%            String UID = request.getParameter("UID");
            User profileUser = new dao.UserDAO().getUserByID(UID);
            if (id.equalsIgnoreCase(UID) || profileUser == null) {
                response.sendRedirect("ProfileInfo.jsp");
                return;
            }

            String FriendStatus = new dao.RelationDao().getDivRelation(id, UID);
            //request.setAttribute("profileUser", profileUser);
        %>
        <div class ="profile-container">
            <img src="<%=profileUser.getCoverImg()%>" class="cover-img"/>
            <div class = "profile-details">
                <div class ="pd-left">
                    <div class ="pd-row">
                        <img src ="<%=profileUser.getImgUser()%>" class ="pd-image">
                        <div>
                            <h3><a href="" style="text-decoration: none; color:#626262;"><%=profileUser.getFullName()%></a></h3>
                            <p>4 Friends - 0 Follow</p>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                        </div>
                    </div>
                </div>
                <div class = "pd-right" >
                    <span class ="friendstatus" id="friendstatus">
                        <%=FriendStatus%>
                    </span>
                    <span class = "sendmessage">           
                        <button type = "button"> 
                            <i class="icon fa-regular fa-message"></i> Send Message
                        </button>
                    </span><br>
                    <a href =""> <i class="more fa-solid fa-ellipsis"></i> </a>
                </div>
            </div>

            <div class ="profile-info">
                <div class ="info-col">
                    <div class ="profile-intro">
                        <h3>Intro</h3>
                        <p class = "intro-text">hihi</p>
                        <hr>
                        <ul>
                            <li><i class="intro fa-solid fa-house" style="width: 26px;"></i>Lives in DaNang, VietNam</li>
                            <li><i class="intro fa-solid fa-location-dot" style="width: 26px;"></i>From Hue, VietNam</li>
                        </ul>
                    </div>
                    <div class = "profile-intro">
                        <div class ="title-box">
                            <h3>Friends</h3>
                            <a href ="" style="margin-top:-18px;">All Friends</a>
                        </div>

                        <div class = "friend-box">
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                        </div>



                    </div>



                </div>
                <div>
                    <div class ="post-container"  id="post" style="margin: 0; padding: 0">

                    </div>
                    <div id="btnloadmore">
                        <button onclick="loadMorePost('profileuser', '<%=UID%>', document.getElementById('offset').innerHTML)">load more </button>
                    </div>
                </div>
            </div>
            <div class="modal" id = "modalShare" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Modal title</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div id="PostIDPostShareModel"></div>
                            <div class="share-head">
                                <div style="display: flex">
                                    <div class="dp" >
                                        <img src="<%=user.getImgUser()%>" alt="" style="width: 45px;
                                             height: 45px;
                                             border-radius: 50%;
                                             margin-right: 10px;
                                             object-fit: cover;" >
                                    </div>
                                    <div class="share-info">
                                        <p class="name" style="color: #003140;"><%=user.getFullName()%></p>
                                    </div>
                                </div>

                                <p>What's you think?</p>
                                <div class="share-content" style="margin-bottom: 20px">
                                    <input id="contentPostShareModel" type="text" name="contentPostShareModel" style="width: 100%">
                                </div>

                                <select id="privacyPostShareModel" name = "privacyPostShareModel" style="color:#626262;">
                                    <c:forEach items="${apiPrivacy.allPrivacy}" var="ele">
                                        <option style="color:#626262; background-color:#cdf1ff;  ">${ele.getPrivacyName()}</option>
                                    </c:forEach>
                                </select>
                                <div class="share-body" style="border: 1px solid black">
                                    <div class="share-top"  style="margin-left: 10px">
                                        <div class="dp">
                                            <img id="imgUserDown" src="" alt="" style="width: 45px;
                                                 height: 45px;
                                                 border-radius: 50%;
                                                 margin-right: 10px;
                                                 object-fit: cover;" >
                                        </div>
                                        <div class="share-info">
                                            <p id="name_userDown" class="name" style="color: #003140"></p>
                                        </div>
                                    </div>
                                    <div class="share-content" style="text-align: center;" >
                                        <p id='contentDown' style="text-align: left;"></p>
                                        <img id='img_postDown' src="" style="width: 100%"/>
                                    </div>

                                </div> 
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary" onclick="load('Share')">Save changes</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script src="/SocialNetworkIRCNV/PersonalPage/ProfileUser.js" >


            </script>
             <script src="/SocialNetworkIRCNV/js/loadpost.js" >


            </script>
            <script src="/SocialNetworkIRCNV/js/controlPost.js">

            </script>
            <script src="/SocialNetworkIRCNV/js/like.js" ></script>

        </script>
</body>
</html>
