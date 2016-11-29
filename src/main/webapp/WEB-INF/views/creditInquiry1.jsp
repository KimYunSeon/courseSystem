<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.backcolor{
	background: #ff9999; 
}
.backcolor2{
	background: #ffe5e5;
}
.table{
	border= 1px solid ; 
	style= "border-collapse:collapse;
}
th,td{
	padding: 10px;
	text-align: center;}
</style>
</head>
<body>
	<table class="table">
		<tr class="backcolor">
			<th>년도</th><th>학기</th><th>이수학점</th><th>상세보기</th>
		</tr>
		<tr class="backcolor2">
			<td>2013</td><td>1</td><td>20</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2013&semester=1">링크</a></td>
		</tr>
		<tr class="backcolor2">
			<td>2013</td><td>2</td><td>15</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2013&semester=2">링크</a></td>
		</tr>
		<tr class="backcolor2">
			<td>2014</td><td>1</td><td>20</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2014&semester=1">링크</a></td>
		</tr>
		<tr class="backcolor2">
			<td>2014</td><td>2</td><td>19</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2014&semester=2">링크</a></td>
		</tr>
		<tr class="backcolor2">
			<td>2016</td><td>1</td><td>20</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2016&semester=1">링크</a></td>
		</tr>
		<tr class="backcolor2">
			<td>2016</td><td>2</td><td>17</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2016&semester=2">링크</a></td>
		</tr>
	</table>
	
	<h3><a href="${pageContext.request.contextPath}/creditInquiry1">메인화면으로 가기</a></h3>
</body>
</html>