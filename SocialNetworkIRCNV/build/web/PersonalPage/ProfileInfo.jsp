<%@page import="controller.Text"%>
<%@page import="model.PostUser"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->

<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script> 
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://kit.fontawesome.com/24c45437f2.js" crossorigin="anonymous"></script>
        <jsp:useBean id="a" class="dao.UserDAO" scope="request" />
    </head>
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
            background: white;
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
    </style>
    <body>

        <header>
            <%@include file="../block/header.jsp" %>
        </header>

        <jsp:include page = "/GetInfor"></jsp:include>

        <jsp:include page="/post" />

        <div class ="profile-container ">

            <img src="/SocialNetworkIRCNV/<%=user.getCoverImg()%>" class="cover-img"/> <!-- ?nh bìa -->
            <!-- Ph?n ??u -->
            <div class = "profile-details">
                <div class ="pd-left">
                    <div class ="pd-row">
                        <img src ="/SocialNetworkIRCNV/<%=user.getImgUser()%>" class ="pd-image">
                        <div class = "profile-name">
                            <h3><a href="" style="text-decoration: none; color:#626262;"><%=user.getFullName()%></a></h3>
                            <p>4 Friends - 0 Follow</p>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>
                            <img src="https://picsum.photos/300/300/?random" alt="alt"/>    
                        </div>
                    </div>
                </div>
                <div class = "pd-right">
                    <button type = "button"> 
                        <a href ="updateinfor?userid">  <i class="icon fa-solid fa-pen " style = " background:#e4e6eb;
                                                           color:#000;"></i> </a>Change Information</button>
                    <br>
                    <a href =""> <i class="more fa-solid fa-ellipsis" style  = "            background:#e4e6eb;
                                    color:#000;"></i> </a>
                </div>
            </div>


            <!-- Ph?n bên trái c?a trang (bao g?m introduce và b?n bè... -->
            <div class ="profile-info ">
                <div class ="info-col ">
                    <div class ="profile-intro">

                        <!-- Introduce -->
                        <h3>Intro</h3>
                        <p class = "intro-text">hihi</p>
                        <hr>
                        <ul>
                            <li><i class="intro fa-solid fa-house" style="width: 26px;"></i>Lives in <%=user.getAddress()%>, <%=user.getNation()%></li>
                            <li><i class="intro fa-solid fa-location-dot" style="width: 26px;"></i>From <%=user.getNation()%></li>
                        </ul>
                    </div>
                    <div class = "profile-intro">
                        <!--                         Friends -->
                        <div class ="title-box">
                            <h3>Friends</h3>
                            <a href ="" style="margin-top:-18px;">All Friends</a>
                        </div>
                        <div class = "friend-box">
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                            <div><img src="https://picsum.photos/300/300/?random"><p>IRCN V</p></div>
                        </div>

                    </div>
                </div>

                <!-- Up bài -->
                <div class ="post-col" style="width: 100%;">
                    <div class ="write-post-container">
                        <div class ="user-profile">
                            <img src="/SocialNetworkIRCNV/<%=user.getImgUser()%>" >
                            <div>
                                <p><a href="" style="text-decoration: none; color:#626262;"><%=user.getFullName()%></a> </p>
                                <select id="privacy" name = "privacy" style="color:#626262;">
                                    <option style="color:#626262; background-color:#cdf1ff;  ">Public</option>
                                    <option style="color:#626262;background-color:#cdf1ff;">Private</option>
                                </select>
                            </div>
                        </div>
                        <div>
                            <div class ="post-input-container" id="post-input-container">
                                <textarea id="NewPostTextarea" rows ="3" placeholder="What's on your mind?"></textarea>    
                                <img id="previewImage" src="#" alt="Preview Image" style="display: none">
                                <input type="file" name="photo" id="fileInput">
                            </div> 
                            <button onclick="load()">add new post</button>
                        </div>
                    </div>



                    <!-- Bài Post -->
                    <div class ="post-container"  id="post">

                        <!--                        <div class = "post-row">
                                                    <div class = "user-profile">
                                                        <img src="image/ava.jpg">
                                                        <div>
                                                            <p>IRCN V</p>
                                                            <span>May 15 2023, 20:56pm</span>
                                                        </div>
                                                    </div>
                                                    <a href =""><i class ="fas fa-ellipsis-v"></i></a>
                                                </div>
                                                <p class ="post-text" >aaaaaaaaaaaaaa</p>
                                                <img src ="image/ava.jpg" class ="post-img">
                                                <div style = "padding-top: 10px;">
                                                    <div class = post-row>
                                                        <div class = "activity-icons">
                                                            <div> <i class="icon far fa-thumbs-up"></i> Like</div>
                                                            <div> <i class="icon far fa-comment"></i> Comment</div>
                                                            <div> <i class="icon fa fa-share"></i> Share</div>
                                                        </div>
                                                        <div class="post-profile-icon">
                                                            <img src="https://picsum.photos/300/300/?random"><i class ="fas fa-caret-down"></i> </small>
                                                        </div>
                                                    </div>
                                                </div>-->

                        <jsp:include page="/post" />
                        <jsp:include page="/comment"  />  
                        <%
                            Text text = new Text();
                            ArrayList<PostUser> std = (ArrayList<PostUser>) request.getAttribute("ListPost");

                            for (int i = 0; i < std.size(); i++) {
                                %>

                        <div>
                            <%try {%>
                            <jsp:include page="../BlockPost/BlockPost.jsp">
                                <jsp:param name="post_id" value="<%=std.get(i).getPostID()%>" />
                                <jsp:param name="img_pro" value="<%=std.get(i).getImgUser()%>" />

                                <jsp:param name="uName" value="<%=std.get(i).getFullNameUser()%>" />

                                <jsp:param name="time" value="<%=std.get(i).getTimePost()%>" />

                                <jsp:param name="Public" value="<%=std.get(i).isPublic()%>" />

                                <jsp:param name="content" value="<%=std.get(i).getContent()%>" />
                                <jsp:param name="img_post" value="<%=std.get(i).getImagePost()%>" />
                                <jsp:param name="num_like" value="<%=std.get(i).getNumInterface()%>" />
                                <jsp:param name="num_cmt" value="<%=std.get(i).getNumComment()%>" />
                                <jsp:param name="num_share" value="<%=std.get(i).getNumShare()%>" />
                            </jsp:include>
                            <%} catch (Exception e) {

                                }%>
                        </div>
                        <%}%>
                    </div>
                    <img src="../image/Screenshot 2023-05-23 194732.png" alt="alt" style="width: 100%"/>
                </div>
            </div>

            <script>
                document.getElementById('fileInput').addEventListener('change', function (event) {
                    var file = event.target.files[0];

                    // T?o ??i t??ng FileReader ?? ??c t?p tin
                    var reader = new FileReader();
                    reader.onload = function (e) {
                        var previewImage = document.getElementById('previewImage');
                        previewImage.src = e.target.result;
                        previewImage.style = "display: block; width:100%";
                    };
                    reader.readAsDataURL(file);
                });
                function load() {

                    var fileInput = document.querySelector('input[name="photo"]');
                    var file = fileInput.files[0];
                    var formData = new FormData();

                    var content = document.getElementById("NewPostTextarea").value;
                    var privacy = document.getElementById("privacy").value;

                    formData.append('photo', file);
                    formData.append('privacy', privacy);
                    formData.append('content', content);
                    $.ajax({
                        url: "/SocialNetworkIRCNV/NewPost",
                        type: "POST",
                        processData: false,
                        contentType: false,
                        data: formData,
                        success: function (data) {
                            var row = document.getElementById("post");
                            row.innerHTML = data + row.innerHTML;
                            document.getElementById("post-input-container").innerHTML = "<textarea id='NewPostTextarea' rows ='3' placeholder='Whats on your mind?'></textarea> <img id='previewImage' src='#' alt='Preview Image' style='display: none'><input type='file' name='photo' id='fileInput'>";
                        },
                        error: function (xhr) {
                            console.log("?ã x?y ra l?i: ");
                        }
                    });
                }
                function deletePost(PostID) {
                    var post = document.getElementById(PostID);
                    var postContain = document.getElementById("post");
                    $.ajax({
                        url: "/SocialNetworkIRCNV/DeletePost",
                        type: "POST",
                        data: {PostID: PostID},
                        success: function (data) {
                            if (data.trim() === "false") {
                                alert("Can't delete other user post " + PostID);
                            } else {
                                alert("true " + PostID);
                                if (post) {
                                    post.setAttribute('style', 'display: none');
                                }
                            }
                        },
                        error: function (xhr) {
                            console.log("?ã x?y ra l?i: ");
                        }
                    });
                }

            </script>

    </body>
</html>
