<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());

    %>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.3.1.js"></script>
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <title>员工列表</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12"><h1>标题</h1></div>
        </div>
        <div class="row">
            <div class="col-md-4 col-md-offset-8">
                <button class="btn btn-primary">新增</button>
                <button class="btn btn-danger">删除</button>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>#</th>
                        <th>用户名</th>
                        <th>用户密码</th>
                        <th>所属部门</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${pageInfo.list}" var="user">
                        <tr>
                            <th>#</th>
                            <th>${user.userName}</th>
                            <th>${user.password}</th>
                            <th>${user.dept.deptName}</th>
                            <th>
                                <button class="btn btn-primary btn-sm">编辑</button>
                                <button class="btn btn-danger btn-sm">删除</button>
                            </th>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                当前 ${pageInfo.pageNum} 页,总 ${pageInfo.pages} 页 ${pageInfo.total} 条记录
            </div>
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <c:if test="${pageInfo.pageNum != 1}">
                        <li><a href="${APP_PATH}/user/getAll?pn=1">首页</a></li>
                        <li>
                            <a href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        </c:if>
                        <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                            <c:if test="${page_num == pageInfo.pageNum}">
                                <li class="active"><a href="${APP_PATH}/user/getAll?pn=${page_num}">${page_num}</a></li>
                            </c:if>
                            <c:if test="${page_num != pageInfo.pageNum}">
                                <li><a href="${APP_PATH}/user/getAll?pn=${page_num}">${page_num}</a></li>
                            </c:if>
                        </c:forEach>
                        <li>
                            <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        <li><a href="#">末页</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</body>
</html>
