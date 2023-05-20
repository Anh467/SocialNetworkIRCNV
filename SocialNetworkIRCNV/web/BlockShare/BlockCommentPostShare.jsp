
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="shortcut icon" href="./images/logo.png" type="image/x-icon">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script>
        <style>
            @import url("https://fonts.googleapis.com/css2?family=Rubik:wght@300;400;500;600;700;800&display=swap");
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: "Rubik", sans-serif;

            }
            * ul {
                list-style: none;
            }
            * a {
                text-decoration: none;
            }


            main {
                width: 100%;
                height: 100%;
                display: grid;
                place-items: center;
            }
            main section.comment-share-module {
                width: 100%;
                height: auto;
                background: #fff;
                border-radius: 5px;
                padding: 20px 30px;
            }
            main section.comment-share-module ul {
                width: 100%;
                height: 100%;
                display: flex;
                flex-direction: column;
                align-items: flex-start;
                row-gap: 50px;
                margin-left: 0px;
            }
            main section.comment-share-module ul li {
                width: 100%;
                position: relative;
            }
            main section.comment-share-module ul li .comment-share {
                width: 100%;
                display: flex;
                column-gap: 20px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-img {
                width: 6%;
            }
            main section.comment-share-module ul li .comment-share .comment-share-img img {
                width: 50px;
                height: 50px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content {
                width: 93%;
                display: flex;
                flex-direction: column;
                row-gap: 12px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-details {
                width: 100%;
                display: flex;
                column-gap: 15px;
                align-items: center;
                justify-content: flex-start;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-details .comment-share-name {
                text-transform: capitalize;
                font-size: 20px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-details .comment-share-log {
                color: #7a7a7a;
                font-size: 15px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data {
                width: 100%;
                display: flex;
                justify-content: flex-start;
                align-items: center;
                column-gap: 20px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data .comment-share-likes {
                display: flex;
                align-items: center;
                column-gap: 12px;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data .comment-share-likes > div {
                display: flex;
                column-gap: 4px;
                align-items: center;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data .comment-share-likes > div img {
                cursor: pointer;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data .comment-share-likes > div span {
                font-weight: 600;
            }
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data .comment-share-reply a,
            main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data .comment-share-report a {
                color: #272727;
                font-weight: 400;
            }
            main section.comment-share-module ul li::before {
                content: "";
                position: absolute;
                top: 60px;
                left: 50px;
                transform: translateX(-25px);
                width: 2px;
                height: calc(100% - 60px);
                background: #c5c5c5;
            }
            main section.comment-share-module ul li ul {
                margin-top: 35px;
                margin-left: 70px;
                width: calc(100% - 70px);
            }

            @media screen and (max-width: 1600px) {
                main section.comment-share-module {
                    width: 60%;
                }
            }
            @media screen and (max-width: 1400px) {
                main section.comment-share-module {
                    width: 70%;
                }
                main section.comment-share-module ul li .comment-share .comment-share-img {
                    width: 10%;
                }
                main section.comment-share-module ul li .comment-share .comment-share-content {
                    width: 90%;
                }
            }
            @media screen and (max-width: 1024px) {
                main section.comment-share-module {
                    width: 80%;
                }
            }
            @media screen and (max-width: 768px) {
                main section.comment-share-module {
                    width: 96%;
                }
                main section.comment-share-module ul li .comment-share {
                    column-gap: 12px;
                }
                main section.comment-share-module ul li .comment-share .comment-share-img {
                    width: 15%;
                }
                main section.comment-share-module ul li .comment-share .comment-share-img img {
                    width: 40px;
                    height: 40px;
                }
                main section.comment-share-module ul li .comment-share .comment-share-content {
                    width: 85%;
                }
                main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-details {
                    flex-direction: column;
                    align-items: flex-start;
                }
                main section.comment-share-module ul li .comment-share .comment-share-content .comment-share-data {
                    column-gap: 12px;
                }
                main section.comment-share-module ul li::before {
                    top: 50px;
                    left: 50px;
                    transform: translateX(-30px);
                    height: calc(100% - 60px);
                }
                main section.comment-share-module ul li ul {
                    margin-top: 25px;
                    margin-left: 50px;
                    width: calc(100% - 50px);
                }
            }
            .write-comment-share{
                margin: 20px 0;
                width: 100%;
                display: inline-flex;
                text-align: center;
                align-items: center;
            }
            .write-comment-share img{
                width: 50px;
                height: 50px;
                border-radius: 50%;
            }
            .input-group {
                margin: 15px;
                
                display: block;
                width: 70%;
                height: 55px;
                border: solid 1px #00abfd;
                background-color: #ffffff;
                border-bottom-left-radius: 41px;
                border-bottom-right-radius: 41px;
                border-top-left-radius: 41px;
                border-top-right-radius: 41px;
                box-shadow: 0 17px 40px 0 rgba(75, 128, 182, 0.07);
                margin-bottom: 22px;
                position: relative;
                font-size: 17px;
                color: #a7b4c1;
                transition: opacity 0.2s ease-in-out, filter 0.2s ease-in-out,
                    box-shadow 0.1s ease-in-out;
            }

            .input-group:hover {
                box-shadow: 0 14px 44px 0 rgba(0, 0, 0, 0.077);
            }

            .input-group input {
                position: absolute;
                border: 0;
                box-shadow: none;
                background-color: rgba(255, 255, 255, 0);
                top: 0;
                height: 55px;
                width: 70%;
                padding: 0 53px;
                box-sizing: border-box;
                z-index: 3;
                display: block;
                color: #1a6fc4;
                font-size: 17px;
                font-family: "Oxygen", sans-serif;
                transition: top 0.1s ease-in-out;
            }

            .input-group input::placeholder {
                color: rgba(0, 0, 0, 0);
            }



            .input-group label {
                position: absolute;
                border: 0;
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;
                z-index: 2;
                display: flex;
                align-items: center;
                padding: 0 53px;
                box-sizing: border-box;
                transition: all 0.1s ease-in-out;
                cursor: text;
            }

            .input-group input:focus + label,
            .input-group input:not(:placeholder-shown) + label {
                bottom: 20px;
                font-size: 13px;
                opacity: 0;
            }

            .req-mark {
                position: absolute;
                pointer-events: none;
                top: 0;
                right: 33px;
                bottom: 0;
                display: flex;
                align-items: center;
                justify-content: flex-end;
                font-size: 22px;
                color: #e0e0e0;
                font-family: "Ubuntu", sans-serif;
            }
            .share .share-bottom, .share .counter{
                box-shadow: 1px solid #ddd;
                display:flex;
                justify-content: space-between;
                padding:0 10%;
                font-size: 18px;
                font-family: sans-serif;

            }
            .share .counter{
                padding: 10px 10%;
                color: #00587c;
            }
            .share .share-bottom .action{
                padding:10px;
                border-radius:10px;
                transition: .3s ease-in;
                cursor: pointer;
            }

            .share .share-bottom .action:hover{
                background:#eee;
            }
        </style>
    </head>
    <body>
        <div class="share">
            <div class="counter">
                <div class="count-like">
                    <span>1000 Like</span>
                </div>
                <div class="count-cmt">
                    <span>1 Commnet</span>
                </div>
            </div>
            <div class="share-bottom" style=" width: 90%; color:  #00abfd; border-top: 1px #00587c solid; margin-left: 5%; padding: 0 5%;">
                <div class="action">
                    <i class="far fa-thumbs-up"></i>
                    <span>Like</span>
                </div>
                <div class="action">
                    <a href="#writecomment-share" style="text-decoration: none; color:  #00abfd;">
                        <i class="far fa-comment"></i>
                        <span>Comment</span>
                    </a>
                </div>
                <div class="action">
                    <i class="fa fa-share"></i>
                    <span>Share</span>
                </div>
            </div>
        </div>
        <main>
            <section class="comment-share-module">
                <ul>

                    <li>
                        <div class="comment-share">
                            <div class="comment-share-img">
                                <img src="https://i.pinimg.com/564x/00/96/dc/0096dc386bbeca215bc5f42deef14d6a.jpg" alt="ảnh" style="border-radius: 50%;">
                            </div>
                            <div class="comment-share-content">
                                <div class="comment-share-details">
                                    <h4 class="comment-share-name" style="color: #003140; margin-top: 7px;">andrew231</h4>
                                    <span class="comment-share-log" style="color: #70d8ff">20 hours ago</span>
                                </div>
                                <div class="comment-share-desc">
                                    <p>Thanks for making this, super helpful happi happi happi happi happi happi happi happi happi happi happi happi happi happi happihappi happi happi</p>
                                </div>
                                <div class="comment-share-data">
                                    <div class="comment-share-likes">
                                        <div class="comment-share-likes-up">
                                            <img src="https://rvs-comment-module.vercel.app/Assets/Up.svg" alt="">
                                            <span>2</span>
                                        </div>
                                        <div class="comment-share-likes-down">
                                            <img src="https://rvs-comment-module.vercel.app/Assets/Down.svg" alt="">
                                            <span></span>
                                        </div>
                                    </div>
                                    <div class="comment-share-reply">
                                        <a href="#!">Reply</a>
                                    </div>
                                    <div class="comment-share-report">
                                        <a href="#!">Report</a>
                                    </div>
                                </div>
                            </div>
                            <script>
                                let likesUpParent = document.getElementsByClassName("comment-share-likes-up");
                                let likesDownParent = document.getElementsByClassName("comment-share-likes-down");

                                let likesEl = [];
                                for (let i = 0; i < likesUpParent.length; i++) {
                                    let likesUp = likesUpParent[i].getElementsByTagName("img")[0];
                                    let likesDown = likesDownParent[i].getElementsByTagName("img")[0];

                                    likesEl.push(likesUp, likesDown);
                                }

                                likesEl.forEach((el) => {
                                    el.addEventListener("click", function () {
                                        let likesClosestCountEl = this.parentElement.getElementsByTagName("span")[0];
                                        let likesCount = likesClosestCountEl.innerText;

                                        if (likesCount.trim().length === null) {
                                            likesCount = 0;

                                        } else {
                                            likesCount++;
                                        }
                                        likesClosestCountEl.innerText = likesCount;
                                    });
                                });

                            </script>
                        </div>

                    </li>
                </ul>
            </section>
        </main>
        <div class="write-comment-share col-12" >
            <div class="col-1" ><img src="https://i.pinimg.com/564x/67/08/ce/6708ce18672409459dbdabf30d661c15.jpg"></div>
            <div class="input-group col-10" >
                <input id="writecomment-share" style="width: 100%" value="" class="form-control" type="text" name="text-1542372332072" id="text-1542372332072" required="required" placeholder="Write comment-share.......">
                <label for="text-1542372332072">Write comment-share........</label>
                <div class="req-mark">!</div>
            </div>    
            <div class="col-1"><a href=""><i class="material-icons" style="font-size:48px;color:#00abfd">send</i></a></div> 
        </div>
    </body>
</html>
