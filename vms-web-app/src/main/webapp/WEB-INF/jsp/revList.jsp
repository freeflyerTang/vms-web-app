<%--
  User: Carol Tang
  Date: 2018/10/25
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%@ page language="java" import="java.lang.*,java.util.*,com.beisun.vms.model.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>激活卡领用列表页</title>
</head>

<body>
<input type="hidden" id="userName" value="<%=request.getParameter("userName")%>">
<table  border="1">
    <tr>
        <td align="center">序号</td>
        <td align="center">单证代码</td>
        <td align="center">卡折名称</td>
        <td align="center">开始号码</td>
        <td align="center">终止号码</td>
        <td align="center">单证单价</td>
        <td align="center">单证张数</td>
        <td align="center">领用日期</td>
        <td align="center">发放人机构号</td>
        <td align="center">发放人代码</td>
        <td align="center">发放人姓名</td>
    </tr>
    <c:forEach items="${revList}" var="Bill_grade_send" varStatus="vs">
        <c:if test="${empty revList}">
            <tr><td colspan="11">无领用记录</td></tr>
        </c:if>
        <c:if test="${not empty revList}">
            <tr>
                <td>${vs.index+1}</td>
                <td>${Bill_grade_send.bill_class}</td>
                <td>${Bill_grade_send.bill_name}</td>
                <td>${Bill_grade_send.bill_start_no}</td>
                <td>${Bill_grade_send.bill_end_no}</td>
                <td>${Bill_grade_send.bill_price}</td>
                <td>${Bill_grade_send.bill_number}</td>
                <td>${Bill_grade_send.date_out}</td>
                <td>${Bill_grade_send.send_branch_no}</td>
                <td>${Bill_grade_send.send_clerk_code}</td>
                <td>${Bill_grade_send.send_clerk_name}</td>
            </tr>
        </c:if>

    </c:forEach>
</table>
<input type="button" value="申领激活卡" onclick="toApply()"></input>
</body>
<script type="text/javascript">
    function toApply(){
        var userName = document.getElementById("userName").value;
        window.location.href="<%=request.getContextPath()%>/apply.do?userName="+userName;
    }
</script>
</html>
