<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>수강 신청</title>
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

<springform:form method="get" action="${pageContext.request.contextPath}/enrollCourse2" modelAttribute="subject">
		<table class="table">
			<tr class="backcolor">
				<td>교과코드:</td>
				<td><springform:input path="code" type="text" /></br>
				<springform:errors path="code" />
			</tr>
			<tr class="backcolor2">
				<td>교과목명:</td>
				<td><springform:input path="name" type="text" /></br>
				<springform:errors path="name" />
			</tr>
			<tr class="backcolor2">
				<td>구분:</td>
				<td><springform:input path="type" type="text" /></br>
				<springform:errors path="type" />
			</tr>
			<tr class="backcolor2">
				<td>학점:</td>
				<td><input name="credit" type="text" /></br>
			</tr>
			<tr class="backcolor2">
				<td colspan="2"><input name="수강신청" value="수강신청" type="submit"></td>
			</tr>
		</table>
	</springform:form>
	
	<h3><a href="${pageContext.request.contextPath}">메인화면으로 가기</a></h3>

</body>
</html>