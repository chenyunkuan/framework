<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>frame</title>
</head>
<div class="container-fluid">
    <div class="row">
        <%@include file="header.jsp" %>
    </div>
    <div class="row">
        <div class="panel-body">
            <div class="col-md-2">
                <jsp:include page="navigation.jsp"/>
            </div>
            <div class="col-md-10">
                <jsp:include page="content.jsp"/>
            </div>
        </div>

    </div>
    <div class="row">
        <%@include file="footer.jsp" %>
    </div>
</div>
</body>
<%@include file="jsLib.jsp" %>
</html>
