<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath() %>/sito/css/style.css" rel="stylesheet" type="text/css">
<title>Home</title>
</head>
<body>

<div class="form">
<form>
	<table>
	    <tr>
	    	<td>
	    		<a href="<%=request.getContextPath() %>/sito/Login" class="button">login</a>
	    	</td>
	    	<td>
	    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    	</td>
	    	<td>
	    		<a href="<%=request.getContextPath() %>/sito/RicercaServizi.jsp" class="button">Ricerca Servizi</a>
	    	</td>
	    </tr>
	
	</table>
</form>
</div>

</body>
</html>