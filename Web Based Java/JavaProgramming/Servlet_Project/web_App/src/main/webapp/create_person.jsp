<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--Instantiating  a java bean: Person --%>


<jsp:useBean id="personObj" class="example.bean.Person" scope="session"/>

<%--Setting the values of the properties of the bean --%>
<jsp:setProperty property ="*" name="personObj"/>
<h1>Person Created Successfully.🤩</h1>
<h1>To view please 
<a href="show_person.jsp">click here</a>
</h1>
</body>
</html>