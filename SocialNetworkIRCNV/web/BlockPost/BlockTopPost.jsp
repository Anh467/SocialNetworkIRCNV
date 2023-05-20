<%-- 
    Document   : BlockTopPost
    Created on : May 14, 2023, 10:38:14 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="./images/logo.png" type="image/x-icon">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <title>JSP Page</title>
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
            }

            .post .post-content > img{
                width:60%;
                
                margin:5px 0px;
            }
            
        </style>
    </head>
    <body>

                <div class="post">
                    <div class="post-top">
                        <div class="dp" >
                            <img src="https://i.pinimg.com/564x/de/62/2c/de622c247814fd996711686810eb6206.jpg" alt="" style="width: 100%;" >
                        </div>
                        <div class="post-info">
                            <p class="name" style="color: #003140">Ramesh GC</p>
                            <span class="time" style="color: #70d8ff">2 days ago</span>
                            
                            <i style="">
                                <select class="fas fa-ellipsis-h">
                                    
                                    <option value="pub">Public</option>
                                    <option value="pri">Private</option>
                                </select> 
                            </i>
                        </div>
                        <i class="fas fa-ellipsis-h"></i>
                    </div>

                    <div class="post-content">
                        Mountains are so cool
                        <div>
                        <img src="https://i.pinimg.com/564x/f2/16/70/f21670c355402865e48d47aba7686c14.jpg"  style=""/>
                        </div>
                    </div>
                    
            </div>  
    </body>
</html>
