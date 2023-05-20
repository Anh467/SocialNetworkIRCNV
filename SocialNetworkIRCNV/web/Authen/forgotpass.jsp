<%-- 
    Document   : forgotpass
    Created on : 20 thg 5, 2023, 07:32:04
    Author     : van12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <a href="${pageContext.request.contextPath}/Authen/login.jsp">You already have account?</a>
        <a href="${pageContext.request.contextPath}/Authen/signup.jsp">You dont have account?</a>
        </div>
        
    </body>
</html>
