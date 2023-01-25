<%-- 
    Document   : agecalculator
    Created on : 24-Jan-2023, 12:26:39 PM
    Author     : rladm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method ="post" action ="age">
            Enter your age: <input type ="text" name ="currentAge" value="${currentAge}"><br>
            <input type ="submit" value ="Age next birthday"><br>    
           
            ${message}<br>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>   
    </body>
</html>
