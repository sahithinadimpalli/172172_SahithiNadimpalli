<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
public int add(int a,int b)
{
return a+b;
}
%>
<%@include file="/Clock.jsp" %>
<%
out.println("haiiii");
int i=10;
int j=20;
int k=i+j;
%>
the value of k is:<%=k%>
<% 
int c= add(20,50);
%>
the value of c is:<%=c %>
<% 
for(i=0;i<5;i++)
{
out.println("i value is:"+i);
%>
<br>
<%}
%>

</body>
</html>