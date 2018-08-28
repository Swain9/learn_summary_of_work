<%--
  Created by IntelliJ IDEA.
  User: 45022
  Date: 2018/8/15
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>你好</title>
</head>
<body>


<form method="post" action="/test/show1">
    <input type="text" id="param" name="param">
    <input type="submit" value="提交">
</form>
<br/>
<button id="show1">POST: /test/show1</button>
<button id="show2">GET: /test/show2</button>
<button id="show3">POST JSON: /test/show3</button>
<script src="/js/jquery-3.2.1.js" type="text/javascript"></script>
<script>
    var param = {"param": "你好"};
    $("#show1").on("click", function () {
        $.ajax({
            type: "POST",
            url: "/test/show1",
            data: param,
            success: function (data) {
                console.log(data);
            }
        });
    });
    $("#show2").on("click", function () {
        $.ajax({
            type: "GET",
            url: "/test/show2",
            data: param,
            success: function (data) {
                console.log(data);
            }
        });
    });
    $("#show3").on("click", function () {
        $.ajax({
            type: "POST",
            url: "/test/show3",
            contentType: 'application/json;charset=utf-8',
            data: JSON.stringify(param),
            success: function (data) {
                console.log(data);
            }
        });
    });
</script>
</body>
</html>
