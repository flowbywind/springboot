<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE PUBLIC "-//W3C//DTD HTML 4.01 TRANSTIONAL//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html;charset=UTF-8" http-equiv="Content-Type"/>
    <title>sse demo</title>
</head>
<body>
SSE DEMO
<div id="msgFromPush"></div>
<script type="text/javascript" src="../assets/js/jquery-3.1.1.js"></script>
<script type="text/javascript">

    if(!!window.EventSource){
        var source=new EventSource("push");
        s="";
        source.addEventListener('message',function(e){
            s+=e.data+"<br/>";
            $("#msgFromPush").html(s);
        })
        source.addEventListener('open',function(e){
            s+="连接打开"+"<br/>";
            $("#msgFromPush").html(s);
        },false);
        source.addEventListener('error',function(e){
            if(e.readyState==EventSource.CLOSED){
                console.log("连接关闭");
            }else{
                console.log(e.readyState);
            }
        },false)
    }else{
        $("#msgFromPush").html("你的浏览器不支持sse")
    }
</script>
</body>
</html>