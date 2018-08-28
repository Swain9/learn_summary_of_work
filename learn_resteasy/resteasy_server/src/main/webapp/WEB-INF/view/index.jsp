<%--
  Created by IntelliJ IDEA.
  User: 45022
  Date: 2018/8/15
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<button id="show1">POST: /rest/show1</button>
<button id="show2">GET: /rest/show2</button>
<button id="show3">POST JSON: /rest/show3</button>
<button id="show4">POST Form: /rest/show4</button>
<script src="/js/jquery-3.2.1.js" type="text/javascript"></script>
<script>
    var param = {"param": "你好"};
    $("#show1").on("click", function () {
        $.ajax({
            type: "POST",
            url: "/rest/show1",
            data: param,
            success: function (data) {
                console.log(data);
            }
        });
    });
    $("#show2").on("click", function () {
        $.ajax({
            type: "GET",
            url: "/rest/show2",
            data: param,
            success: function (data) {
                console.log(data);
            }
        });
    });
    $("#show3").on("click", function () {
        $.ajax({
            type: "POST",
            url: "/rest/show3",
            contentType: 'application/json;charset=utf-8',
            data: JSON.stringify(param),
            success: function (data) {
                console.log(data);
            }
        });
    });
    $("#show4").on("click", function () {
        param.id = "111";
        $.ajax({
            type: "POST",
            url: "/rest/show4",
            data: param,
            success: function (data) {
                console.log(data);
            }
        });
    });
</script>
</body>
</html>
