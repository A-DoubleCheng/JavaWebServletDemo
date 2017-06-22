<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" />
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <title>CODE IN HEART - 心 猿 意 码</title>
    <link rel="stylesheet" type="text/css" href="static/css/style.css" />
    <link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link href="static/img/icon/favicon.ico" rel="bookmark" type="image/x-icon" />
    <link href="static/img/icon/favicon.ico" rel="icon" type="image/x-icon" />
    <link href="static/img/icon/favicon.ico" rel="shortcut icon" type="image/x-icon"/>

    <script src="static/js/jquery-1.6.min.js"/>
    <script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="cih-header">
    <%--头部--%>
    <div class="container">
        <div class="row">
            <%--Logo--%>
            <div class="col-sm-7 cih-logo">
                <ul>
                    <li class="logo"><img src="static/img/LOGO.png"></li>
                </ul>
            </div>
            <%--分类--%>
            <div class="col-sm-5 cih-nav">
                <ul>
                    <li><a>Source Code</a></li>
                    <li><a>Version List</a></li>
                    <li><a>Author</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>

    <%--banner--%>
<div class="cih-banner" style="background: url('static/img/Banner2.jpg'); background-size: cover">
</div>

<div class="main container">

    <div class="row">

        <div class="col-sm-4 cih-account">
            <div class="cih-account-child">
                <div class="cih-master-info">
                    <p>博主信息</p>
                </div>
                <div class="cih-line"></div>
                <div>
                    <ul class="cih-imgname">
                        <li>图片</li>
                        <li>名字</li>
                    </ul>
                </div>
                <div class="cih-line"></div>
                <ul class="cih-data">
                    <li>访问</li>
                    <li>积分</li>
                    <li>等级</li>
                    <li>排名</li>
                </ul>
                <div class="cih-line"></div>
                <ul class="cih-clicknum">
                    <li>原创</li>
                    <li>转载</li>
                    <li>译文</li>
                    <li>评论</li>
                </ul>
            </div>
        </div>

        <%--大内容在里面--%>
                <div class="col-sm-8 cih-list">
                    <div class="cih-list_items">
                        <ul>
                            <li>
                                <div class="cih-item">
                                    <div class="cih-title"><h4><b><a>[Sonatype Nexus]Nexus配置私有Maven库引入自定义jar包 </a></b></h4></div>
                                    <div class="cih-content">短内容</div>
                                    <div>
                                    <ul class="cih-click">
                                        <li>删除</li>
                                        <li>编辑</li>
                                        <li>阅读</li>
                                        <li>评论</li>
                                        <li>时间</li>
                                    </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>

                    <div class="cih-list-page">一个分页的DIV</div>
                </div>


    </div>

</div>

    <%--底部版权什么鬼的--%>
    <div class="cih-bottom">
        <div class="container">
            底部版权
        </div>
    </div>

</div>
</body>
</html>
