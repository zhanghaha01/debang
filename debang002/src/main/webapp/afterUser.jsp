<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>layui在线调试</title>
  <link rel="stylesheet" href="./layui/css/layui.css">
  <script type="text/javascript" src="./layui/layui.js"></script>
  <style>
    body{margin: 10px;}
    .demo-carousel{height: 200px; line-height: 200px; text-align: center;}
  </style>
</head>
<body>
 
<table class="layui-hide" id="test"></table>
 

<script src="./layui/layui.js"></script>
<script>
layui.use('table', function(){
	  var table = layui.table;
	  
	  table.render({
	    elem: '#test'
	    ,url:'AfterUser.do'
	    ,toolbar: true
	    ,title: '用户数据表'
	    ,totalRow: true
	    ,cols: [[
	      {field:'userId', title:'ID', width:80, fixed: 'left', unresize: true, sort: true, totalRowText: '合计行'}
	      ,{field:'userName', title:'用户名', width:120, edit: 'text'}
	      ,{field:'userPassword', title:'用户密码', width:150, edit: 'text'}
	      ,{field:'lastLoginTime', title:'上次登录的时间', width:80, sort: true, totalRow: true}
	      ,{field:'userSex', title:'用户性别', width:80, edit: 'text', sort: true}
	      ,{field:'userPhone', title:'用户固定电话', width:100, sort: true, totalRow: true}
	      ,{field:'userAddress', title:'用户家庭地址'}
	      
	    ]]
	    ,page: true
	  });
	});
</script>
</body>
</html>        
        