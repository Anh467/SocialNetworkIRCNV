                <div>
                    <div class="modal" id = "changeinfo" tabindex="-1" role="dialog">

                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Change Information</h5>

                                </div>
                                <div class="modal-body">
                                    <form action="/SocialNetworkIRCNV/UpdateInfo" method = "post" enctype="multipart/form-data">
                                        <div class="form-group">
                                            <label for="cover-image" class="col-form-label">Cover Image:</label>
                                            <img id="previewImage3" src="/SocialNetworkIRCNV/<%=user.getCoverImg()%>" alt="Preview Image" style="width: 100%;
                                                                                                                                                border-radius: 3px;
                                                                                                                                                margin-bottom: 14px;
                                                                                                                                                object-fit: cover;
                                                                                                                                                height: 200px;
                                                                                                                                            }">
                                            <input  type="file" name="coverimage" id="fileInput3">
                                        </div>

                                        <div class="form-group">
                                            <label for="avatar" class="col-form-label">Avatar:</label>
                                            <img id="previewImage4" src="/SocialNetworkIRCNV/<%=user.getImgUser()%>" alt="Preview Image" style="width: 130px;
                                                                                                                                                height: 130px;
                                                                                                                                                margin-right: 30px;
                                                                                                                                                border-radius: 3px;
                                                                                                                                                object-fit: cover;">
                                            <input  type="file" name="avatar" id="fileInput4">
                                        </div>

                                        <div class="form-group">
                                            <label for="full-name" class="col-form-label">Full Name:</label>
                                            <input value = "<%=user.getFullName()%>"type="text" id="fullname" name="fullname" class="form-control border-primary">
                                        </div>

                                        <div class="form-group">
                                            <label for="date-of-birth" class="col-form-label">Date of Birth:</label>
                                            <input value = "<%=user.getDOB()%>"type="date" id="dateofbirth" name="dateofbirth" class="form-control border-primary">
                                        </div>

                                        <div class="form-group">
                                            <label for="gender" class="col-form-label">Gender:</label>
                                            <select id="gender" name="gender" class="form-control border-primary">
                                                <option value="male">Male</option>
                                                <option value="female">Female</option>

                                            </select>
                                        </div>

                                        <div class="form-group">
                                            <label for="current-city" class="col-form-label">Address:</label>
                                            <input value = "<%=user.getAddress()%>"type="text" id="address" name="address" class="form-control border-primary">
                                        </div>

                                        <div class="form-group">
                                            <label for="nationality" class="col-form-label">Nationality:</label>
                                            <input value = "<%=user.getNation()%> "type="text" id="nation" name="nation" class="form-control border-primary">
                                        </div>

                                        <div class="form-group">
                                            <label for="phone-number" class="col-form-label">Phone Number:</label>
                                            <input value = "<%=user.getPhoneNumber()%> " type="tel" id="phone-number" name="phonenumber" class="form-control border-primary">
                                        </div>

                                        <div class="form-group">
                                            <label for="email-address" class="col-form-label">Email Address:</label>
                                            <input value = "<%=user.getMail()%> " type="email" id="email-address" name="emailaddress" class="form-control border-primary">
                                        </div>
                                        <input type="submit" class="btn btn-primary" value="Save changes">
                                        <!--<button type="submit" class="btn btn-primary">Save  changes</button>-->
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    </form>
                                </div>

                                <div class="modal-footer">

                                </div>

                            </div>
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
                                            <img src="/SocialNetworkIRCNV/<%=user.getImgUser()%>" alt="" style="width: 45px;
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
                                    <div>
                                        <input type="radio" id="privacyPostShareModel" name="privacy" value="Public">
                                          <label for="Public">Public</label><br>
                                         <input type="radio" id="privacyPostShareModel" name="privacy" value="Private">
                                          <label for="Private">Private</label><br>
                                    </div>
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
                <div id="myProfile">
                    <div class="modal" id = "modifyModal" tabindex="-1" role="dialog" style="font-size: 15px;">
                        <style>
                            .post-top{
                                display:flex;
                                align-items: center;
                                padding:10px;
                                padding-bottom: 0;
                            }

                            .post-top .dp{
                                width:60px;
                                height:60px;
                                border-radius: 50%;
                                overflow:hidden;
                            }

                            .post-top .dp > img{

                                cursor:pointer;
                            }

                            .post-top .post-info{
                                margin-left:10px;
                                font-weight: bold;
                            }

                            .post-top .post-info .name{
                                cursor:pointer;
                                font-size:23px;
                                margin-bottom: 0;
                            }

                            .post-top .post-info .time{
                                font-size:14px;
                                cursor:pointer;
                            }
                        </style>
                        <div class="modal-dialog" role="document">
                            <div class="modal-content" style="width: 700px;">
                                <div class="modal-header" style="font-size: 15px;">
                                    <h5 class="modal-title">Edit Post</h5>                      
                                </div>
                                <div class="modal-body">
                                    <div class="post-top">
                                        <p style="display: none" id="IDpost"></p>
                                        <div class="dp" >
                                            <img id="imgUser" src="" alt="" style="width: 100%;" >
                                        </div>
                                        <div class="post-info">
                                            <p class="name" style="color: #003140" id="FullNameU"></p>
                                            <span class="time" style="color: #70d8ff" id="timePost"></span>

                                            <select id="isPublic" name = "privacy" style="color:#626262;">
                                                <option style="color:#626262; background-color:#cdf1ff;" value="Public">Public</option>
                                                <option style="color:#626262;background-color:#cdf1ff;" value="Private">Private</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="post-content" style="text-align: center;">
                                        <textarea rows ="2" style="width: 100%; border: none;" id="contentPost"></textarea>
                                        <img id="imgPost" src="" style=" max-width: 660px; max-height: 660px;"/>
                                        <br>
                                        <input type="file" name="photoPost" id="fileInput2" />
                                        <button class="btn btn-primary" style="font-size: 15px;" type="button" onclick="clearFileInput()">Clear File Input</button>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="submit" class="btn btn-primary" style="font-size: 15px;" onclick="loadUpdate()">Save changes</button>
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal" style="font-size: 15px;">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>