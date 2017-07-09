<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户登录</title>
</head>

<body>
<form action="/Cloud/user/login" method="post" id="myform">
    <input type="text" id="userName" name="userName"/>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="登录" id="login" />
    <input type="button" name="btn1" onclick="action='/Cloud/user/login';document.fm.submit();" value="登录2"/>
    <input type="button" name="btn2" onclick="action='/Cloud/user/login';document.fm.submit();" value="注册"/>
</form>
</body>

</html>