<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="./images/logo.png" type="image/x-icon">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="style.css">
        <title>MediaBook</title>
        <style>
            *{
                margin:0;
                padding:0;
                box-sizing: border-box;
                font-family: sans-serif;
            }

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

            nav .nav-left > img{
                width:40px;
            }

            nav .nav-left > input{
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


            .container{
                
                background:#eee;
                display:flex;
                left: 0;
                right: 0;
            }

            .container .left-panel, .container .right-panel{
                position: sticky;
                top:70px;

                width:250px;
                height:calc(100vh - 70px);
            }

            .container .left-panel ul{
                padding:10px 0px;
            }

            .container .left-panel ul li{
                list-style: none;
                display: flex;
                padding:.7rem 1rem;
                align-items: center;
                transition: .3s;
                border-radius: 5px;
                cursor: pointer;
            }

            .container .left-panel ul li:hover{
                background:#ddd;
            }

            .container .left-panel ul li > p{
                margin-left: 10px;
            }

            .container .left-panel ul li > i{
                font-size:20px;
                color:#00587c;
            }

            .container .left-panel ul li > i.fa-calendar-week{
                color:tomato;
            }

            .container .left-panel ul li i.fa-briefcase{
                color:green;
            }

            .container .left-panel ul li i.fa-star{
                color:yellowgreen;
            }

            .container .left-panel ul li i.fa-hands-helping{
                color:indianred;
            }

            .container .left-panel .footer-links{
                padding:5px 1rem;
            }

            .container .left-panel .footer-links a{
                text-decoration: none;
                color:#333;
                font-size:12px;
            }

            .middle-panel{
                flex:1;
                display:flex;
                flex-direction: column;
                align-items:center;
            }


            .post{
                width:700px;
                background:#fff;
                border-radius:10px;
                margin: 10px 0;
            }

            .post .post-top{
                display:flex;
                align-items: center;
                padding:10px;
            }

            .post .post-top .dp{
                width:40px;
                height:40px;
                border-radius: 50%;
                overflow:hidden;
            }

            .post .post-top .dp > img{
                width:100%;
                cursor:pointer;
            }

            .post .post-top .post-info{
                margin-left:10px;
                font-weight: bold;
            }

            .post .post-top .post-info .name{
                cursor:pointer;
                font-size:16px;
            }

            .post .post-top .post-info .time{
                font-size:12px;
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
                font-size:16px;
                font-weight:normal;
                padding:10px;
                max-height: 600px;
            }

            .post .post-content > img{
                height: 95%;
                margin:5px 0px;
            }

            .post .post-bottom{
                box-shadow: 1px solid #ddd;
                display:flex;
                justify-content: space-between;
                padding:5px 5px 0px 5px;

            }

            .post .post-bottom .action{
                padding:10px;
                border-radius:10px;
                transition: .3s ease-in;
                cursor: pointer;

            }

            .post-bottom .action{
                color:  #00abfd;
            }

            .post .post-bottom .action:hover{
                background:#eee;
            }

            .post.create .post-bottom > .action{
                color:#d74;
            }

            .container .right-panel{
                padding:1rem;
            }

            .right-panel .pages-section,
            .right-panel .friends-section{
                margin:1rem 0px;
            }

            .right-panel .pages-section h4,
            .right-panel .friends-section h4{
                margin-bottom:10px;
            }

            .right-panel .pages-section .page,
            .right-panel .friends-section .friend{
                display: flex;
                align-items:center;
                text-decoration: none;
                transition: .3s ease-in-out;
                border-radius: 5px;
                padding:7px 10px;
                color:#333;
            }

            .right-panel .pages-section .page:hover,
            .right-panel .friends-section .friend:hover{
                background:#ddd;
            }

            .right-panel .pages-section .page > .dp,
            .right-panel .friends-section .friend > .dp{
                height:40px;
                width:40px;
                border-radius: 50%;
                overflow:hidden;
                cursor: pointer;
            }

            .right-panel .pages-section .page > .dp > img,
            .right-panel .friends-section .friend > .dp > img{
                width:100%;
            }

            .right-panel .pages-section .name, .right-panel .friends-section .name{
                font-size:18px;
                cursor:pointer;
                margin-left:8px;
            }
        </style>
    </head>

    <body>
        <nav>
            <div class="nav-left">
                <img src="../img/logo.jpg" alt="Logo">
                <input type="text" placeholder="Search Mediabook..">
            </div>

            <div class="nav-middle">
                <a href="#" class="active">
                    <i class="fa fa-home"></i>
                </a>

                <a href="#">
                    <i class="fa fa-user-friends"></i>
                </a>

                <a href="#">
                    <i class="fas fa-gamepad"></i>
                </a>
            </div>

            <div class="nav-right">
                <span class="profile"><img src="https://i.pinimg.com/564x/1b/13/9f/1b139f234ac0c0e99308fb5e753d5b9c.jpg" alt="alt"/></span>

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
        </nav>


        <div class="container" style="max-width: 1850px; width: 100%; min-width: 1045px;">
            <div class="left-panel">
                <ul>
                    <li>
                        <span class="profile"><img src="https://i.pinimg.com/564x/1b/13/9f/1b139f234ac0c0e99308fb5e753d5b9c.jpg" alt="alt"/></span>
                        <p>Aashish Panthi</p>
                    </li>
                    <li>
                        <i class="fa fa-user-friends"></i>
                        <p>Friends</p>
                    </li>
                    
                    <li>
                        <i class="fas fa-comments"></i>
                        <p>Inbox</p>
                    </li>
                    
                </ul>

                <div class="footer-links">
                    <a href="#">Privacy</a>
                    <a href="#">Terms</a>
                    <a href="#">Advance</a>
                    <a href="#">More</a>
                </div>
            </div>


            <div class="middle-panel">



                <div class="post create">
                    <div class="post-top">
                        <div class="dp">
                            <img src="./images/girl.jpg" alt="">
                        </div>
                        <input type="text" placeholder="What's on your mind, Aashish ?" />
                    </div>

                    <div class="post-bottom" >
                        
                        <div class="action" style="color:  #00abfd;">
                            <i class="fa fa-image"></i>
                            <span>Photo/Video</span>
                        </div>
                        <div class="action" style="color:  #00abfd;">
                            <i class="fa fa-smile"></i>
                            <span>Feeling/Activity</span>
                        </div>
                    </div>
                </div>


                <div>
                    <%@include file="../BlockPost/BlockPost.jsp" %>
                </div>
                <div class="post">
                    <%@include file="../BlockShare/BlockPostShare.jsp" %>
                </div>


            </div>
            <div class="right-panel">

                <div class="friends-section">
                    <h4>Friends</h4>
                    <a class='friend' href="#">
                        <div class="dp">
                            <img src="./images/dp.jpg" alt="">
                        </div>
                        <p class="name">Henry Mosely</p>
                    </a>

                    <a class='friend' href="#">
                        <div class="dp">
                            <img src="./images/shoes.jpg" alt="">
                        </div>
                        <p class="name">George</p>
                    </a>

                    <a class="friend" href="#">
                        <div class="dp">
                            <img src="./images/boy.jpg" alt="">
                        </div>
                        <p class="name">Aakash Malhotra</p>
                    </a>

                    <a class="friend" href="#">
                        <div class="dp">
                            <img src="./images/model.jpg" alt="">
                        </div>
                        <p class="name">Ragini Khanna</p>
                    </a>

                    <a class="friend" href="#">
                        <div class="dp">
                            <img src="./images/boy.jpg" alt="">
                        </div>
                        <p class="name">Justin Bieber</p>
                    </a>

                    <a class="friend" href="#">
                        <div class="dp">
                            <img src="./images/dp.jpg" alt="">
                        </div>
                        <p class="name">Ramesh GC</p>
                    </a>

                    <a class="friend" href="#">
                        <div class="dp">
                            <img src="./images/model.jpg" alt="">
                        </div>
                        <p class="name">Sajita Gurung</p>
                    </a>

                </div>
            </div>
        </div>
    </body>

</html>