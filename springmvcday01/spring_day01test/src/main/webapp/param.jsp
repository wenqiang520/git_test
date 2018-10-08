<%--
  Created by IntelliJ IDEA.
  User: T58
  Date: 2018/9/25
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="param/testParam?username=hehe&password=123">绑定请求参数</a>--%>

<%--<form action="param/saveAccount" method="post">
    姓名:<input type="text" name="uname"><br/>
    密码:<input type="text" name="password"><br/>
    金额:<input type="text" name="money"><br/>
    用户姓名:<input type="text" name="user.username"><br/>
    用户性别:<input type="text" name="user.sex"><br/>
    用户年龄:<input type="text" name="user.age"><br/>
    <input type="submit" value="提交">--%>



<%--list集合传入--%>

<%--<form action="param/saveAccount" method="post">
    姓名:<input type="text" name="uname"><br/>
    密码:<input type="text" name="password"><br/>
    金额:<input type="text" name="money"><br/>
    生日:<input type="text" name="birthday"><br/>
    用户姓名:<input type="text" name="users[0].username"><br/>
    用户性别:<input type="text" name="users[0].sex"><br/>
    用户年龄:<input type="text" name="users[0].age"><br/>
    用户姓名:<input type="text" name="map['a'].username"><br/>
    <input type="submit" value="提交">
</form>--%>

<%--<a href="param/testServlet">Servlet获取原生</a>--%>



<%--<form action="anno/testRequestBody" method="post">
    姓名:<input type="text" name="uname"><br/>
    密码:<input type="text" name="password"><br/>
    金额:<input type="text" name="money"><br/>

    <input type="submit" value="提交">
</form>--%>

<%--//测试PathVariable--%>

<a href="anno/testPathVariable/10"> //测试PathVariable</a><br/>


<%--请求头的测试--%>

<a href="anno/testRequestHeader"> 请求头的测试</a><br/>

<%--测试CookValue--%>

<a href="anno/testCookValue"> 测试CookValue</a>


<%--测试ModelAttrlbute--%>


<form action="anno/testModelAttrlbute" method="post">
    姓名:<input type="text" name="uname"><br/>
    密码:<input type="text" name="password"><br/>
    <%--金额:<input type="text" name="money"><br/>--%>

    <input type="submit" value="提交">
</form>

<%--SessionAttrlbutes的测试--%>
<a href="anno/testSessionAttributes"> SessionAttrlbutes的测试</a><br/>
<a href="anno/getSessionAttributes"> getSessionAttrlbutes的测试</a><br/>
<a href="anno/delSessionAttributes"> delSessionAttrlbutes的测试</a><br/>
</body>

</html>
