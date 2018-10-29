<%--
  User: Carol Tang
  Date: 2018/10/26
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" import="java.util.*,com.beisun.vms.model.*" %>
<html>
<head>
    <title>申请激活卡</title>
</head>
<body>
    <form id="bill_grade_sendForm"  action="" method="post">
        <table>
            <tr>
                <td>单证代码：</td>
                <td><input type="text" name="bill_class"></td>
            </tr>
            <tr>
                <td>单证管理员：</td>
                <td><input type="text" name="send_clerk_code"></td>
            </tr>
            <tr>
                <td>申请张数：</td>
                <td><input type="text" name="bill_number"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交申请" onsubmit=""></td>
                <td><input type="button" value="返回"></td>
            </tr>
        </table>
    </form>
</body>
</html>
