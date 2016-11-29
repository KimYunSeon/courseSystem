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
<h1 class = "main">학점조회 와 수강신청</h1>
<ul>
<li><h3><a href="${pageContext.request.contextPath}/creditInquiry1">학기별 이수 학점 조회</a></h3></li>
<li><h3><a href="${pageContext.request.contextPath}/creditInquiry2">이수 구분별 학점 조회</a></h3></li>
<li><h3><a href="${pageContext.request.contextPath}/enrollCourse">수강 신청하기</a></h3></li>
<li><h3><a href="${pageContext.request.contextPath}/courseInquiry">수강 신청 조회 메뉴</a></h3></li>
</ul>
</body>
</html>
