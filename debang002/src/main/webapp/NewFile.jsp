<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="./layui/css/layui.css"  media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
 
<table class="layui-hide" id="test"></table>
              
          
<script src="./layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'AfterUser.do'
    ,width: 892
    ,height: 332
    ,cols: [[
      {type:'checkbox', fixed: 'left'}
      ,{field:'userId', width:80, title: 'ID', sort: true, fixed: 'left'}
      ,{field:'userName', width:80, title: '用户名'}
      ,{field:'userPassword', width:80, title: '性别', sort: true}
      ,{field:'lastLoginTime', width:80, title: '城市'}
      ,{field:'userSex', width: 219, title: '签名'}
      ,{field:'userPhone', width:80, title: '积分', sort: true}
      ,{field:'userAddress', width:80, title: '评分', sort: true}
    ]]
    ,page: true
  });
});
</script>

</body>
</html>