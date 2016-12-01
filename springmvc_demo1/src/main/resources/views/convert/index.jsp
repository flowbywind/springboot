<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE PUBLIC "-//W3C//DTD HTML 4.01 TRANSTIONAL//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta content="text/html;charset=UTF-8" http-equiv="Content-Type"/>
        <title>httpMessageConverter</title>
    </head>
    <body>
        <div id="resp"></div>
        <input type="button" value="请求convert" onclick="req()"/>
        <script type="text/javascript" src="../assets/js/jquery-3.1.1.js"></script>
        <script type="text/javascript">
            function req(){
             $.ajax({
                    url:"getConvertObj",
                    data:"2-testdemoobj",
                    type:"post",
                    contentType:"application/x-wisely",
                    success:function(data){
                      $("#resp").html(data);
                    }
              })
            };
        </script>
    </body>
</html>