<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="panel panel-default" id="panel_nav">
    <div class="panel-heading">导航</div>
    <div class="panel-body">
        <ul id="main-nav" class="main-nav nav nav-stacked" >
            <li>
                <a href="#systemSetting" class="nav-header" data-toggle="collapse">
                    <i class="glyphicon glyphicon-cog"></i>
                    系统管理
                    <span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
                </a>
                <ul id="systemSetting" class="nav nav-list secondmenu collapse in">
                    <li><a href="${basePath}/sysUser/toList" target="content_main"><i class="glyphicon glyphicon-user"></i>&nbsp;用户管理</a></li>
                    <li><a href="#" target="content_main"><i class="glyphicon glyphicon-th-list"></i>&nbsp;菜单管理</a></li>
                    <li><a href="#" target="content_main"><i class="glyphicon glyphicon-asterisk"></i>&nbsp;角色管理</a></li>
                    <li><a href="#" target="content_main"><i class="glyphicon glyphicon-edit"></i>&nbsp;修改密码</a></li>
                    <li><a href="#" target="content_main"><i class="glyphicon glyphicon-eye-open"></i>&nbsp;日志查看</a></li>
                </ul>
            </li>
            <li>
                <a href="#configSetting" class="nav-header collapsed" data-toggle="collapse">
                    <i class="glyphicon glyphicon-credit-card"></i>
                    配置管理
                    <span class="pull-right glyphicon  glyphicon-chevron-toggle"></span>
                </a>
                <ul id="configSetting" class="nav nav-list secondmenu collapse" style="height: 0px;">
                    <li><a href="#"><i class="glyphicon glyphicon-globe"></i>&nbsp;全局缺省配置</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-star-empty"></i>&nbsp;未开通用户配置</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-star"></i>&nbsp;退订用户配置</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-text-width"></i>&nbsp;试用用户配置</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-ok-circle"></i>&nbsp;开通用户配置</a></li>
                </ul>
            </li>

            <li>
                <a href="#disSetting" class="nav-header collapsed" data-toggle="collapse">
                    <i class="glyphicon glyphicon-globe"></i>
                    分发配置
                    <span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
                </a>
                <ul id="disSetting" class="nav nav-list secondmenu collapse" style="height: 0px;">
                    <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>&nbsp;分发包配置</a></li>
                </ul>
            </li>
            <li>
                <a href="#dicSetting" class="nav-header collapsed" data-toggle="collapse">
                    <i class="glyphicon glyphicon-bold"></i>
                    字典配置
                    <span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
                </a>
                <ul id="dicSetting" class="nav nav-list secondmenu collapse" style="height: 0px;">
                    <li><a href="#"><i class="glyphicon glyphicon-text-width"></i>&nbsp;关键字配置</a></li>
                </ul>
            </li>
            <li>
                <a href="#">
                    <i class="glyphicon glyphicon-fire"></i>
                    关于系统
                    <span class="badge pull-right">1</span>
                </a>
            </li>

        </ul>
    </div>
</div>
<style>
    .nav-header.collapsed > span.glyphicon-chevron-toggle:before {
        content: "\e114";
    }

    .nav-header > span.glyphicon-chevron-toggle:before {
        content: "\e113";
    }

    .secondmenu a {
        font-size: 12px;
        color: rgba(49, 42, 49, 0.93);
        text-align: center;
    }

    .secondmenu li.active {
        background-color: #eee;
        border-color: #428bca;
    }
</style>

