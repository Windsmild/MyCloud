<%--
  Created by IntelliJ IDEA.
  User: caifeng
  Date: 17/7/8
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Hello MyCloud!
  <br>"request.getContextPath()的值是   "<%=request.getContextPath()%><br/>
  <form action="${pageContext.request.contextPath}/user/login" method="post" id="myform" name="myform">
    <input type="text" id="userName" name="userName"/>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="提交" id="login" />
    <input type="button" name="btn1" onclick="action='${pageContext.request.contextPath}/user/login';document.myform.submit();" value="登录"/>
    <input type="button" name="btn2" onclick="action='${pageContext.request.contextPath}/user/register';document.myform.submit();" value="注册"/>
  </form>
  </body>
</html>
