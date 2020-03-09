<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Login</title>
</head>
<body>
	<form name = "form" action="http://localhost:8080/web/util/autenticacao.jsp" method = "post">
	EMAIL: <br/>
	<input type= "text" name ="email"  title="Digite seu email" maxlength="100" required ="required"/>
	<br/>
	SENHA: <br/>
	<input type = "password" name="senha" title= "Prencha o campo senha:" required="required"/> <br/>
	<input type = "submit" value="Entrar"/>
	</form>
	<p>${mensagem }
</body>
</html>