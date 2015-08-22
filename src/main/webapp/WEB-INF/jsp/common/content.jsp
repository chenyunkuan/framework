<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="panel panel-default" id="content">
    <ul class="breadcrumb">
        <li>
            <a href="#">主页</a>
        </li>
        <li>
            <a href="#">类目</a>
        </li>
        <li class="active">
            主题
        </li>
    </ul>
    <div class="panel-body">
        <iframe name="content_main" width="100%" height="50%"  frameborder="0"  scrolling="auto" marginheight="0" marginwidth="0" onload="resetIframe(this);" onreadystatechange="resize();" >
        </iframe>
    </div>
</div>
<script language="javascript" type="text/javascript">
    var navHeight= 500;
    var oTime = null;
    function resize() {
        if (oTime) {
            clearTimeout(oTime);
        }
        oTime = setTimeout(reset, 200);
    }
    function resetIframe(iframe) {
        var nav = $('#panel_nav');
        navHeight = nav.offsetHeight
        var outHeight = iframe.offsetHeight;
        var inHeight = iframe.contentWindow.document.body.scrollHeight;
        if (outHeight < inHeight) {
            iframe.style.height = inHeight  + "px";
        }else{
            iframe.style.height=navHeight;
        }
    }
</script>
