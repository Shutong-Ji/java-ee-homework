
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- 引入css核心文件 -->
<link href="BootStrap/css/bootstrap.min.css" rel="stylesheet">
<script src="BootStrap/js/bootstrap.min.js"></script>


<nav class="navbar navbar-default  navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="navbar-collapse">
                <span class="sr-only"></span><!（仅供）屏幕阅读器，这个 class 主要用于增强 accessbility（可访问性）!>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span><!当屏幕宽度小于一定程度时，导航条缩小，变成可折叠形式!>
            </button>
            <a href="sameHobby.html" class="navbar-brand">Find Friends</a>
        </div>
        <div class="collapse navbar-collapse">
            <!collapse的作用是为了当浏览器的窗口宽度小于768px的时候，将设置为collapse样式的div元素内的所有其它元素都折叠起来(btn)，以一个列表的形式显示!>
            <ul class="nav navbar-nav navbar-right"><!导航菜单,右对齐!>
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Friends</a></li>
                <li><a href="#">Contact</a></li>
                <!作用是可以想要跳转到其他的页面，但是不想要影响本页，那么就可以进行添加＃就可以跳转到自己所想要的页面，是重新打开一个网页。
                a href ="＃" 默认打开的还是当前页面，会刷新一下重新打开。!>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" name="" class="form-control" placeholder="you can search content">
                <!属性提供可描述输入字段预期值的提示信息(hint)!>
                <a href="#" class="btn btn-info btn-sm"><!btn btn-info 浅蓝色 btn-sm小按钮!>
                <span class="glyphicon glyphicon-search"></span> Search
            </a>
            </form>
        </div>
    </div>
</nav>
</body>
