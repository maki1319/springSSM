<%--
  Created by IntelliJ IDEA.
  User: captain
  Date: 2020/11/20
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
   查询到所有用户
   <c:forEach items="${list}" var="account">
       ${account.name}
   </c:forEach>
</body>
</html>
