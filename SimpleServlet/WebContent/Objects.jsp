<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Objects</title>
</head>
<body>
<%String name1=request.getParameter("name");

if(name1!=null)
{
	session.setAttribute("savedname",name1);
//	application.setAttribute("savname", name);
	pageContext.setAttribute("pagecontextname", name1);
	//pageContext.setAttribute("applicationname",context,pageContext.APPLICATION_SCOPE);
	pageContext.setAttribute("Context", name1, pageContext.APPLICATION_SCOPE);
   pageContext.setAttribute("request", name1);
	
}%>
the name in the request object is :<%=name1%>
<br>
the name in the session object is :<%=session.getAttribute("savedname") %>
<br>
<%-- the name in the application object is :<%=application.getAttribute("savname") %> --%>
<br>
the name in the pagecontext object is :<%=pageContext.getAttribute("pagecontextname") %>
<br>

the name in the pagecontext object1 is :<%=pageContext.getAttribute("request") %>
<br>
</body>
</html>