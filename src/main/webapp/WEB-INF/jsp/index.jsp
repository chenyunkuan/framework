<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zn-cn">
<head>
    <meta charset="UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${basePath}/js/bootstrap/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="${basePath}/js/bootstrap/css/bootstrap-theme.min.css">
</head>
<body>


<h1>你好，世界<small>Secondary text</small></h1>
<h2>你好，世界<small>Secondary text</small></h2>
<h3>你好，世界<small>Secondary text</small></h3>
<h4>你好，世界</h4>
<h5>你好，世界</h5>
<p class="lead">ASsaSA  sASas a</p>

<div class="table-responsive">


    <table class="table table-striped table-bordered table-hover table-condensed">
        <tr><th>First Name</th><th>Last Name</th><th>Username</th></tr>
        <tr><td>First Name</td><td>Last Name</td><td>Username</td></tr>
        <tr><td>First Name</td><td>Last Name</td><td>Username</td></tr>
        <tr><td>First Name</td><td>Last Name</td><td>Username</td></tr>
        <tr><td>First Name</td><td>Last Name</td><td>Username</td></tr>
        <tr><td>First Name</td><td>Last Name</td><td>Username</td></tr>
    </table>

</div>
<form class="form-inline">
    <div class="form-group">
        <label for="exampleInputName2">Name</label>
        <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail2">Email</label>
        <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
    </div>
    <button type="submit" class="btn btn-default">Send invitation</button>
</form>

<input type="text" class="form-control" placeholder="Text input">
<input type="password" class="form-control" placeholder="Text input">
<input type="month" class="form-control" placeholder="Text input">
<input type="time" class="form-control" placeholder="Text input">
<input type="email" class="form-control" placeholder="Text input">
<input type="number" class="form-control" placeholder="Text input">
<input type="url" class="form-control" placeholder="Text input">


<!-- Standard button -->
<button type="button" class="btn btn-default">（默认样式）Default</button>

<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
<button type="button" class="btn btn-primary">（首选项）Primary</button>

<!-- Indicates a successful or positive action -->
<button type="button" class="btn btn-success">（成功）Success</button>

<!-- Contextual button for informational alert messages -->
<button type="button" class="btn btn-info">（一般信息）Info</button>

<!-- Indicates caution should be taken with this action -->
<button type="button" class="btn btn-warning">（警告）Warning</button>

<!-- Indicates a dangerous or potentially negative action -->
<button type="button" class="btn btn-danger">（危险）Danger</button>

<!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
<button type="button" class="btn btn-link">（链接）Link</button>


<% String appBase = request.getContextPath();
    request.setAttribute("basePath",appBase);
%>
${basePath}
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${basePath}/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${basePath}/js/bootstrap/js/bootstrap.min.js"></script>
</html>