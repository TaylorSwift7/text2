<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2021/4/7
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>Title</title>
</head>
<body>
${root}
<a href="${root}/book">点击</a>
</body>
</html>
