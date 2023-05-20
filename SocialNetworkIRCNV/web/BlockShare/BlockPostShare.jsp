

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
        <title>share Share</title>
        <style>
            body{

            }

            .share{
                background:#fff;
                border-radius:10px;
                padding-right: 0;
                margin-right: 0;
            }
            .share .share-top, .share .share-head{
                display:flex;
                align-items: center;
                padding:10px;
                padding-bottom: 0;
            }

            .share .share-body{
                margin-top: 2%;
                border: 1px #00587c solid;
                border-radius: 10px;
                width: 94%;
                margin-left: 3%;

            }

            .share .dp{
                width:60px;
                height:60px;
                border-radius: 50%;
                overflow:hidden;
            }

            .share .share-top .dp > img{
                cursor:pointer;
            }

            .share .share-info{
                margin-left:10px;
                font-weight: bold;
            }

            .share .share-info .name{
                cursor:pointer;
                font-size:23px;
                margin-bottom: 0;
                padding-bottom: 0;
            }

            .share .share-info .time{
                font-size:14px;
                cursor:pointer;
            }

            .share .share-head i{
                margin-left:auto;
                cursor: pointer;
            }

            .share .share-head > input{
                height:40px;
                padding:5px 10px;
                border-radius:25px;
                outline:none;
                border:none;
                flex:1;
                background:#eee;
                margin-left:10px;
            }

            .share .share-content{
                font-size:20px;
                font-weight:normal;
                padding:10px;
                max-height: 600px;
            }

            .share .share-body .share-content  > img{
                height: 95%;
                margin:5px 0px;
                max-height: 530px;
            }
            
        </style>
    </head>
    <body>

        <div class="share">
            <div class="share-head">
                <div class="dp" >
                    <img src="https://i.pinimg.com/564x/ab/0f/a0/ab0fa0f12e173f8503567a4eaab3ce06.jpg" alt="" style="width: 100%;" >
                </div>
                <div class="share-info">
                    <p class="name" style="color: #003140">David Noob</p>
                    <span class="time" style="color: #70d8ff">2 days ago</span>
                    <i style="">
                        <select class="fas fa-ellipsis-h">
                            <option value="pri">Private</option>
                            <option value="pub">Public</option>
                        </select> 
                    </i>
                </div>
                <i class="fas fa-ellipsis-h"></i>
            </div>
            <div class="share-content">
                I don't think so
            </div>
            <div class="share-body">
                <div class="share-top" >
                    <div class="dp" >
                        <img src="https://i.pinimg.com/564x/de/62/2c/de622c247814fd996711686810eb6206.jpg" alt="" style="width: 100%;" >
                    </div>
                    <div class="share-info">
                        <p class="name" style="color: #003140">Ramesh GC</p>
                        <span class="time" style="color: #70d8ff">2 days ago</span>
                    </div>

                </div>

                <div class="share-content" style="text-align: center;">
                    <p style="text-align: left;">Mountains are so cool</p>
                    <img src="https://i.pinimg.com/564x/f2/16/70/f21670c355402865e48d47aba7686c14.jpg" />
                </div>
            </div>   
        </div>
        
        <div class="comment" style="width: 100%;" ><%@include file="BlockCommentPostShare.jsp" %></div>
   

</body>
</html>
