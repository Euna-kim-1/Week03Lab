<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Jan-2023, 6:23:06 PM
    Author     : rladm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method ="post" action="arithmetic">
            First: <input type ="text" name ="firstNum"><br>
            Second: <input type ="text" name ="secondNum"><br>
            <input type ="submit" value ="+" name = "operation">
            <input type ="submit" value ="-" name = "operation">
            <input type ="submit" value ="*" name = "operation">
            <input type ="submit" value ="%" name = "operation"><br><br>
            
            Result: ${result}<br>
            <a href="age">Age Calculator</a>
        </form>
        
    </body>
</html>
