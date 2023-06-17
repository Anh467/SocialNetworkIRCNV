<%-- 
    Document   : PostsReports
    Created on : Jun 14, 2023, 10:28:53 AM
    Author     : TCNJK
--%>
<%@page import="model.PostReport"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.PostReportDAO"%>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Datatable - Posts Report</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href="assets/images/icon/favicon.ico">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/metisMenu.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/slicknav.min.css">
        <!-- amcharts css -->
        <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
        <!-- Start datatable css -->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.jqueryui.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="assets/css/typography.css">
        <link rel="stylesheet" href="assets/css/default-css.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <link rel="stylesheet" href="assets/css/responsive.css">
        <!-- modernizr css -->
        <script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>
    </head>

    <body>
        <div id="preloader">
            <div class="loader"></div>
        </div>
        <!-- preloader area end -->
        <!-- page container area start -->
        <div class="page-container">
            <!-- sidebar menu area start -->
            <div class="sidebar-menu">
                <div class="sidebar-header">
                    <div class="logo">
                        <a href="index.html"><img src="assets/images/icon/logo.png" alt="logo"></a>
                    </div>
                </div>
                <div class="main-menu">
                    <div class="menu-inner">
                        <nav>
                            <ul class="metismenu" id="menu">
                                <li >
                                    <a href="AdminPageIndex.jsp" aria-expanded="true"><i class="ti-dashboard"></i><span>Dashboard</span></a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0)" aria-expanded="true"><i class="ti-flag-alt"></i><span>Reported Content
                                        </span></a>
                                    <ul class="collapse">
                                        <li><a href="UserReports.jsp">User Reports</a></li>
                                        <li class="active"><a href="PostsReports.jsp">Posts Reports</a></li>
                                        <li><a href="CommentsReports.jsp">Comments Reports</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" aria-expanded="true"><i class="fa fa-table"></i>
                                        <span>Tables</span></a>
                                    <ul class="collapse">
                                        <li><a href="datatable.html">datatable</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" aria-expanded="true"><i class="ti-palette"></i><span>UI Features</span></a>
                                    <ul class="collapse">
                                        <li><a href="accordion.html">Accordion</a></li>
                                        <li><a href="alert.html">Alert</a></li>
                                        <li><a href="badge.html">Badge</a></li>
                                        <li><a href="button.html">Button</a></li>
                                        <li><a href="button-group.html">Button Group</a></li>
                                        <li><a href="cards.html">Cards</a></li>
                                        <li><a href="dropdown.html">Dropdown</a></li>
                                        <li><a href="list-group.html">List Group</a></li>
                                        <li><a href="media-object.html">Media Object</a></li>
                                        <li><a href="modal.html">Modal</a></li>
                                        <li><a href="pagination.html">Pagination</a></li>
                                        <li><a href="popovers.html">Popover</a></li>
                                        <li><a href="progressbar.html">Progressbar</a></li>
                                        <li><a href="tab.html">Tab</a></li>
                                        <li><a href="typography.html">Typography</a></li>
                                        <li><a href="form.html">Form</a></li>
                                        <li><a href="grid.html">grid system</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="javascript:void(0)" aria-expanded="true"><i class="ti-slice"></i><span>icons</span></a>
                                    <ul class="collapse">
                                        <li><a href="fontawesome.html">fontawesome icons</a></li>
                                        <li><a href="themify.html">themify icons</a></li>
                                    </ul>
                                </li>

                                <li><a href="invoice.html"><i class="ti-receipt"></i> <span>Invoice Summary</span></a></li>
                                <li>
                                    <a href="javascript:void(0)" aria-expanded="true"><i class="ti-layers-alt"></i> <span>Pages</span></a>
                                    <ul class="collapse">
                                        <li><a href="login.html">Login</a></li>
                                        <li><a href="login2.html">Login 2</a></li>
                                        <li><a href="login3.html">Login 3</a></li>
                                        <li><a href="register.html">Register</a></li>
                                        <li><a href="register2.html">Register 2</a></li>
                                        <li><a href="register3.html">Register 3</a></li>
                                        <li><a href="register4.html">Register 4</a></li>
                                        <li><a href="screenlock.html">Lock Screen</a></li>
                                        <li><a href="screenlock2.html">Lock Screen 2</a></li>
                                        <li><a href="reset-pass.html">reset password</a></li>
                                        <li><a href="pricing.html">Pricing</a></li>
                                        <li><a href="404.html">Error 404</a></li>
                                        <li><a href="500.html">Error 500</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
            <!-- sidebar menu area end -->
            <!-- main content area start -->
        <jsp:include page="header.jsp"></jsp:include>
            <!-- page title area start -->
            <div class="page-title-area">
                <div class="row align-items-center">
                    <div class="col-sm-6">
                        <div class="breadcrumbs-area clearfix">
                            <h4 class="page-title pull-left">Dashboard</h4>
                            <ul class="breadcrumbs pull-left">
                                <li><a href="index.html">Home</a></li>
                                <li><span>Datatable</span></li>
                            </ul>
                        </div>
                    </div>
                <jsp:include page="adminInfoInAnyPage.jsp"></jsp:include>
                </div>
            </div>
            <!-- page title area end -->
            <div class="main-content-inner">
                <div class="row">
                    <!-- Primary table start -->
                    <div class="col-11 mt-5">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="header-title">Data Table Primary</h4>
                                <div class="data-tables datatable-primary">
                                    <table id="dataTable2" class="text-center">
                                        <thead class="text-capitalize">
                                            <tr>
                                                <th>Image</th>
                                                <th>Content</th>
                                                <th>Report Number</th>
                                                <th>Time</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <%!PostReport elem;%>
                                        <%PostReportDAO e = new PostReportDAO();
                                            List<PostReport> list = e.getData();
                                            for (PostReport elem : list) {
                                        %>
                                        <tr class="<%= elem.getPostID()%>">
                                            <td class="post-image"><img style="width: 50px;" src="<%=elem.getImg()%>" alt="Không Có Ảnh"></td>
                                            <td><%=elem.getContent()%></td>
                                            <td><%=elem.getReportCount()%></td>
                                            <td><%=elem.getTime()%></td>
                                            <td><a href="#" onclick="deleteRow(this, '<%= elem.getPostID()%>', '<%=elem.getIsPostVerInt()%>')">Delete</a>/<a href="#" onclick="skipRow(this, '<%= elem.getPostID()%>')">Skip</a></td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    <script>

                                        function skipRow(link, id) {
                                            var data = {
                                                id: id
                                            };
                                            $.ajax({
                                                url: '../SkipReport',
                                                type: 'GET',
                                                data: data,
                                                success: function (response) {
                                                    // Xử lý phản hồi từ servlet nếu cần
                                                    console.log('Yêu cầu thành công');
                                                },
                                                error: function (xhr, status, error) {
                                                    // Xử lý lỗi nếu có
                                                    console.log('Lỗi yêu cầu: ' + error);
                                                }
                                            });
                                            var row = link.parentNode.parentNode; // Lấy thẻ <tr> chứa liên kết được nhấn
                                            row = row.parentNode;
                                            if (row !== null) {
                                                row = row.parentNode;
                                                if (row !== null) {
                                                    row = row.parentNode;
                                                    if (row !== null) {
                                                        var oldRow = row;
                                                        row = row.previousElementSibling;
                                                        if (row !== null) {
                                                            if (row.nodeName === 'TR') {
                                                                oldRow.remove();
                                                                row.remove();
                                                                alert('Thành công');
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            row = link.parentNode.parentNode; // Lấy thẻ <tr> chứa liên kết được nhấn
                                            row.remove();
                                            alert('Thành công');
                                        }
                                        function deleteDB(id, isPost, link) {
                                            var data = {
                                                id: id
                                            };
                                            if (isPost === "1") {
                                                $.ajax({
                                                    url: 'servlet_xóa-post bằng id',
                                                    type: 'POST',
                                                    data: data,
                                                    success: function (response) {
                                                        // Xử lý phản hồi từ servlet nếu cần
                                                        console.log('Yêu cầu thành công');
                                                        skipRow(link);
                                                    },
                                                    error: function (xhr, status, error) {
                                                        // Xử lý lỗi nếu có
                                                        console.log('Lỗi yêu cầu: ' + error);
                                                        console.log('true');
                                                    }
                                                });
                                            } else {
                                                $.ajax({
                                                    url: 'servlet_xóa-postShare bằng id',
                                                    type: 'POST',
                                                    data: data,
                                                    success: function (response) {
                                                        // Xử lý phản hồi từ servlet nếu cần
                                                        console.log('Yêu cầu thành công');
                                                        skipRow(link);
                                                    },
                                                    error: function (xhr, status, error) {
                                                        // Xử lý lỗi nếu có
                                                        console.log('Lỗi yêu cầu: ' + error);
                                                        console.log('false');
                                                    }
                                                });
                                            }
                                        }
                                        function deleteRow(link, id, isPost) {
                                            deleteDB(id, isPost, link)
                                        }
                                    </script>
                                    <!-- Add more rows as needed -->
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Primary table end -->
            </div>
        </div>
    </div>
    <!-- main content area end -->
    <!-- footer area start-->
    <footer>
        <div class="footer-area">
            <p>© Copyright 2023.</p>
        </div>
    </footer>
    <!-- footer area end-->
</div>
<!-- page container area end -->
<!-- offset area start -->
<div class="offset-area">
    <div class="offset-close"><i class="ti-close"></i></div>
    <ul class="nav offset-menu-tab">
        <li><a class="active" data-toggle="tab" href="#activity">Activity</a></li>
        <li><a data-toggle="tab" href="#settings">Settings</a></li>
    </ul>
    <div class="offset-content tab-content">
        <div id="activity" class="tab-pane fade in show active">
            <div class="recent-activity">
                <div class="timeline-task">
                    <div class="icon bg1">
                        <i class="fa fa-envelope"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Rashed sent you an email</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse distinctio itaque at.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg2">
                        <i class="fa fa-check"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Added</h4>
                        <span class="time"><i class="ti-time"></i>7 Minutes Ago</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg2">
                        <i class="fa fa-exclamation-triangle"></i>
                    </div>
                    <div class="tm-title">
                        <h4>You missed you Password!</h4>
                        <span class="time"><i class="ti-time"></i>09:20 Am</span>
                    </div>
                </div>
                <div class="timeline-task">
                    <div class="icon bg3">
                        <i class="fa fa-bomb"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Member waiting for you Attention</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse distinctio itaque at.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg3">
                        <i class="ti-signal"></i>
                    </div>
                    <div class="tm-title">
                        <h4>You Added Kaji Patha few minutes ago</h4>
                        <span class="time"><i class="ti-time"></i>01 minutes ago</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse distinctio itaque at.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg1">
                        <i class="fa fa-envelope"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Ratul Hamba sent you an email</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                    <p>Hello sir , where are you, i am egerly waiting for you.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg2">
                        <i class="fa fa-exclamation-triangle"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Rashed sent you an email</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse distinctio itaque at.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg2">
                        <i class="fa fa-exclamation-triangle"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Rashed sent you an email</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                </div>
                <div class="timeline-task">
                    <div class="icon bg3">
                        <i class="fa fa-bomb"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Rashed sent you an email</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse distinctio itaque at.
                    </p>
                </div>
                <div class="timeline-task">
                    <div class="icon bg3">
                        <i class="ti-signal"></i>
                    </div>
                    <div class="tm-title">
                        <h4>Rashed sent you an email</h4>
                        <span class="time"><i class="ti-time"></i>09:35</span>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse distinctio itaque at.
                    </p>
                </div>
            </div>
        </div>
        <div id="settings" class="tab-pane fade">
            <div class="offset-settings">
                <h4>General Settings</h4>
                <div class="settings-list">
                    <div class="s-settings">
                        <div class="s-sw-title">
                            <h5>Notifications</h5>
                            <div class="s-swtich">
                                <input type="checkbox" id="switch1" />
                                <label for="switch1">Toggle</label>
                            </div>
                        </div>
                        <p>Keep it 'On' When you want to get all the notification.</p>
                    </div>
                    <div class="s-settings">
                        <div class="s-sw-title">
                            <h5>Show recent activity</h5>
                            <div class="s-swtich">
                                <input type="checkbox" id="switch2" />
                                <label for="switch2">Toggle</label>
                            </div>
                        </div>
                        <p>The for attribute is necessary to bind our custom checkbox with the input.</p>
                    </div>
                    <div class="s-settings">
                        <div class="s-sw-title">
                            <h5>Show your emails</h5>
                            <div class="s-swtich">
                                <input type="checkbox" id="switch3" />
                                <label for="switch3">Toggle</label>
                            </div>
                        </div>
                        <p>Show email so that easily find you.</p>
                    </div>
                    <div class="s-settings">
                        <div class="s-sw-title">
                            <h5>Show Task statistics</h5>
                            <div class="s-swtich">
                                <input type="checkbox" id="switch4" />
                                <label for="switch4">Toggle</label>
                            </div>
                        </div>
                        <p>The for attribute is necessary to bind our custom checkbox with the input.</p>
                    </div>
                    <div class="s-settings">
                        <div class="s-sw-title">
                            <h5>Notifications</h5>
                            <div class="s-swtich">
                                <input type="checkbox" id="switch5" />
                                <label for="switch5">Toggle</label>
                            </div>
                        </div>
                        <p>Use checkboxes when looking for yes or no answers.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- offset area end -->
<!-- jquery latest version -->
<script src="assets/js/vendor/jquery-2.2.4.min.js"></script>
<!-- bootstrap 4 js -->
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/owl.carousel.min.js"></script>
<script src="assets/js/metisMenu.min.js"></script>
<script src="assets/js/jquery.slimscroll.min.js"></script>
<script src="assets/js/jquery.slicknav.min.js"></script>

<!-- Start datatable js -->
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
<script src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
<script src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap.min.js"></script>
<!-- others plugins -->
<script src="assets/js/plugins.js"></script>
<script src="assets/js/scripts.js"></script>
</body>

</html>