<%@page import="model.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="./images/logo.png" type="image/x-icon">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <style>


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
                font-size:23px;
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
                padding:10px;
                max-height: 600px;
            }

            .post .post-content > img{
                margin:5px 0px;
                max-height: 530px;
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
        <title>Block Post</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>

    <body>
        <%
            String img_pro = request.getParameter("img_pro");
            String name_user = request.getParameter("uName");
            String timePost = request.getParameter("time");
            String Public = request.getParameter("Public");
            String Content = request.getParameter("content");
            String img_post = request.getParameter("img_post");
            String num_like = request.getParameter("num_like");
            String num_cmt = request.getParameter("num_cmt");
            String num_share = request.getParameter("num_share");
        %>
        <div class="post" style="margin: 0px;">
            <div class="post-top">
                <div class="dp" >
                    <img src=<%=img_pro%> alt="" style="width: 100%;" >
                </div>
                <div class="post-info">
                    <p class="name" style="color: #003140"><%=name_user%></p>
                    <span class="time" style="color: #70d8ff"><%=timePost%></span>

                    <i style="">
                        <select class="fas fa-ellipsis-h">
                            <option value="<%=Public%>">Public</option>
                            <option value="<%=Public%>">Private</option>
                        </select> 
                    </i>
                </div>
                <i class="fas fa-ellipsis-h"></i>
            </div>

            <div class="post-content" style="text-align: center;">
                <p style="text-align: left;"><%=Content%></p>
                <img src=<%=img_post%> style="margin: 0 auto;"/>
            </div>
            <div class="counter">
                <div class="count-like">
                    <span><%=num_like%></span>
                </div>
                <div class="count-cmt">
                    <span><%=num_cmt%></span>
                </div>
                <div class="count-share">
                    <span><%=num_share%></span>
                </div>
            </div>
               
            
            <div class="post-bottom" style=" width: 90%; color:  #00abfd; border-top: 1px #00587c solid; margin-left: 5%; padding: 0 5%;">
                <div class="action">
                    <i class="far fa-thumbs-up"></i>
                    <span>Like</span>
                </div>
                <div class="action">
                    <a href="#writecomment" style="text-decoration: none; color:  #00abfd;">
                        <i class="far fa-comment"></i>
                        <span>Comment</span>
                    </a>
                </div>
                <div class="action">
                    <i class="fa fa-share"></i>
                    <span>Share</span>
                </div>
            </div>
        
                 
                <%
                    ArrayList<Comment> cmt = (ArrayList<Comment>) request.getAttribute("ListCmt");
                    cmt.toString();
                    System.out.println("length: " + cmt.size() + cmt.toString());
                    for (int i = 0; i < cmt.size(); i++) {%>
                <div class="comment" style="width: 100%">
                    <%try {%>
                    <jsp:include page="BlockComment.jsp">
                        <jsp:param name="img_user" value="<%=cmt.get(i).getImgUser()%>" />

                        <jsp:param name="n_user_cmt" value="<%= cmt.get(i).getNameUser()%>" />

                        <jsp:param name="time_cmt" value="<%=cmt.get(i).getTimeCmt()%>" />

                        <jsp:param name="content_cmt" value="<%=cmt.get(i).getContentCmt()%>" />
                        <jsp:param name="img_cmt" value="<%=cmt.get(i).getImgCmt()%>" />
                        <jsp:param name="num_like_cmt" value="<%=cmt.get(i).getNumInter()%>" />
                        
                </jsp:include>
                <%} catch (Exception e) {
                             
                         }%>
                </div>
                <%}%>
                    
        </div>  


    </body>

</html>
