<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ��û</title>
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
				<td>�����ڵ�:</td>
				<td><springform:input path="code" type="text" /></br>
				<springform:errors path="code" />
			</tr>
			<tr class="backcolor2">
				<td>�������:</td>
				<td><springform:input path="name" type="text" /></br>
				<springform:errors path="name" />
			</tr>
			<tr class="backcolor2">
				<td>����:</td>
				<td><springform:input path="type" type="text" /></br>
				<springform:errors path="type" />
			</tr>
			<tr class="backcolor2">
				<td>����:</td>
				<td><input name="credit" type="text" /></br>
			</tr>
			<tr class="backcolor2">
				<td colspan="2"><input name="������û" value="������û" type="submit"></td>
			</tr>
		</table>
	</springform:form>
	
	<h3><a href="${pageContext.request.contextPath}">����ȭ������ ����</a></h3>

</body>
</html>