<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rob
  Date: 9/25/16
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Magic 8 Ball</title>
</head>
<body>
<h1><s:property value="yourFortune"/></h1>

<h3>Reload the page to shake the 8 ball!</h3>
<p><button><a href="magicball.action">Shake Again!</a></button>
 </p>
</body>
</html>
