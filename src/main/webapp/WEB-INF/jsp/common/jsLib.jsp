<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String appBase = request.getContextPath();
    request.setAttribute("basePath",appBase);
%>
<link rel="stylesheet" href="${basePath}/js/bootstrap/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="${basePath}/js/bootstrap/css/bootstrap-theme.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${basePath}/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${basePath}/js/bootstrap/js/bootstrap.min.js"></script>
<script src="${basePath}/js/bootgrid/jquery.bootgrid.min.css"></script>
<script src="${basePath}/js/bootgrid/jquery.bootgrid.min.js"></script>
<script src="${basePath}/js/bootgrid/jquery.bootgrid.fa.min.js"></script>

