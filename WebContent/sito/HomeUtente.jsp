<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath() %>/sito/css/style.css" rel="stylesheet" type="text/css">
<title>Pagina di benvenuto</title>
</head>
<body>
<div class="form">
<form>
<p><i>BENVENUTO: <%= request.getParameter("utente") %> </i> </p>
<a href="<%=request.getContextPath() %>/sito/VisualizzaPrenotazioni.jsp" class="button">Visualizza le tue Prenotazioni></a>
</form>
</div>
</body>
</html>