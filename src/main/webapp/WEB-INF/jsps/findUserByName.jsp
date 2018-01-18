<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.List" %>
<%@ page import="com.meicloud.domain.User" %>
<%--
  Created by IntelliJ IDEA.
  User: jingyi
  Date: 2017/9/25
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <tr>
        <td>
            <input type="text" value="姓名" />
        </td>
        <td>
            <input type="text" value="性别" />
        </td>
        <td>
            <input type="text" value="生日" />
        </td>
        <td>
            <input type="text" value="电话" />
        </td>
        <td>
            <input type="text" value="邮件" />
        </td>
        <td>
            <input type="text" value="地址" />
        </td>
    </tr>
    <br/>

    <c:forEach items="${lista}" var="u">
        <tr>
            <td>
                <input type="text" name="uname" value="${u.uname}" />
            </td>
            <td>
                <input type="text" name="sex" checked="checked" value="${u.sex}" />
            </td>
            <td>
                <input type="text" name="birth" value="${u.birth}" />
            </td>
            <td>
                <input type="text" name="telephone" value="${u.telephone}" />
            </td>
            <td>
                <input type="text" name="email" value="${u.email}" />
            </td>
            <c:if test="${u.address != null}">
                <td>
                    <input type="text" name="address" value="${u.address}" />
                </td>
            </c:if>
        </tr>
        <br/>
    </c:forEach>
</body>
</html>
