<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/jsLib.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table class="table table-condensed table-hover table-striped">
    <thead>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>性别</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="model" items="${list}" step="1">
            <tr>
                <td>${model.id}</td>
                <td>${model.userName}</td>
                <td>${model.gender}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<nav>
    <ul class="pagination">
        <li>
            <a href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
        </li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li>
            <a href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
    </ul>
</nav>
</body>
</html>
