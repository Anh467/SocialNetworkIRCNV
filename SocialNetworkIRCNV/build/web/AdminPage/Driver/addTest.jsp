<%-- 
    Document   : addTest
    Created on : Jun 17, 2023, 10:41:22 AM
    Author     : TCNJK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Báo cáo</title>
    </head>
    <body>
        <h1>Báo cáo</h1>

        <label for="rpID">Mã báo cáo:</label>
        <input type="text" id="rpID">

        <label for="userID">Mã người dùng:</label>
        <input type="text" id="userID">

        <label for="action">Hành động:</label>
        <select id="action">
            <option value="post">Báo cáo bài viết</option>
            <option value="comment">Báo cáo bình luận</option>
            <option value="user">Báo cáo người dùng</option>
        </select>

        <button onclick="report()">Báo cáo</button>

        <script src="report.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    </body>
</html>
