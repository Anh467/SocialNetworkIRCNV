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
        </style>
        <title>Block Post</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>

    <body>
        <div class="post" style="margin: 0px;">
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

            <div class="post-content" style="text-align: center;">
                <p style="text-align: left;">Mountains are so cool</p>
                <img src="https://i.pinimg.com/736x/3a/6b/9c/3a6b9caae1e4c922e2a6eacc36db7bbe.jpg" style="margin: 0 auto;"/>
            </div>

            <div class="comment" style="width: 100%"><%@include file="BlockComment.jsp" %></div>
        </div>  


    </body>

</html>