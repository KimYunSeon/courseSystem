<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page session="false" %>
<html>
<head>
<style type="text/css">
.main{ color:#ff9999; 
	   padding-top: 20px;}
ul{ list-style-type: disc;
	background: #ff9999;
	padding: 20px;}
	ul li{
    padding: 5px;
    margin-left: 35px;
	}
</style>
	<title>Home</title>
</head>
<body>
<h1 class = "main">������ȸ �� ������û</h1>
<ul>
<li><h3><a href="${pageContext.request.contextPath}/creditInquiry1">�б⺰ �̼� ���� ��ȸ</a></h3></li>
<li><h3><a href="${pageContext.request.contextPath}/creditInquiry2">�̼� ���к� ���� ��ȸ</a></h3></li>
<li><h3><a href="${pageContext.request.contextPath}/enrollCourse">���� ��û�ϱ�</a></h3></li>
<li><h3><a href="${pageContext.request.contextPath}/courseInquiry">���� ��û ��ȸ �޴�</a></h3></li>
</ul>
</body>
</html>
