<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script async custom-element="amp-form" src="https://cdn.ampproject.org/v0/amp-form-0.1.js"></script>
</head>
<body>

   

<form action="/action_page.php" id="usrform">
  Name: <input type="text" name="usrname">
  <input type="submit">
</form>
<br>
<textarea rows="4" cols="50" name="comment" form="usrform" >
Enter text here...</textarea>

<p>The text area above is outside the form element, but should still be a part of the form.</p>

<p><b>Note:</b> The form attribute is not supported in IE.</p>

</body>
</html>

