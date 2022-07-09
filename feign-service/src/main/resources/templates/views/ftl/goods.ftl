<#--
  Created by IntelliJ IDEA.
  User: NingZe
  Date: 2019/11/13 0013
  Time: 09:39
  To change this template use File | Settings | File Templates.
-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>goods</title>
</head>
<style>

    table {
        border-collapse: collapse;
        width: 450px;
        margin: 20px auto;
        height: 235px;
        font-family: SimSun;
        font-size: 14px;
    }

    td, th {
        border: 1px solid gray;
    }

</style>
<body>

<table>
    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>数据微服务端口</th>
    </tr>
    <#list goods as g>
        <tr>
            <th>${g.gid}</th>
            <th>${g.gname}</th>
            <th>${g.gprice}</th>
            <th>${g.gport}</th>
        </tr>
    </#list>
    <tr>
        <th align="center" colspan="3">
            视图微服务端口
        </th>
        <th align="center" colspan="1">
            ${port}
        </th>
    </tr>
    <tr>
        <th align="center" colspan="4">
            ${.now}
        </th>
    </tr>
    <tr>
        <th align="center" colspan="4">
            ${version}
        </th>
    </tr>
</table>

</body>
</html>