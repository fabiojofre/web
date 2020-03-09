<%@page import="br.com.web.controller.UsuarioController"%>
<jsp:declaration>
			static UsuarioController uc = new UsuarioController();
			
</jsp:declaration>
<jsp:scriptlet>
			
String email_p = request.getParameter("email");
String senha_p = request.getParameter("senha");

try{
		if (uc.autenticado(email_p, senha_p)){
			session.setAttribute("Mensagem", "Usuário autenticado");
			session.setAttribute("login", "true");
			response.sendRedirect("http://localhost:8080/web/faces/index.jsp");
		}else
		{
			session.setAttribute("Mensagem", "Usuário não autenticado, Favor se altenticar");
			session.setAttribute("login", "false");
			response.sendRedirect("login2.jsp");
		}
}catch(Exception e){
	System.out.println(e);
}
		
		
			
</jsp:scriptlet>