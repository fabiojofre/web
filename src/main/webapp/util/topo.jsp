<%
	if(session.getAttribute("login") != "true")
	{
		session.setAttribute("mensagem","Acesso Proibido!, Favor se identificar.");	
%>

<jsp:forward page="/login.jsp"></jsp:forward>
<% } %>
