package br.com.web.view;

//import java.util.List;

import br.com.web.controller.UsuarioController;
//import br.com.web.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usuario u1 = new Usuario();
		//u1.setNome("Fabio jorge Freitas");
		//u1.setEmail("'fabio.jorge.freitas@hotmail.com'");
		//u1.setSenha("1234");
		
		UsuarioController uc = new UsuarioController();
		//uc.remover(u1);//remover
		//List<Usuario>usuarios = uc.lista();//listar
		
		//for (int i = 0; i < usuarios.size(); i++) {
			//System.out.println("Nome: "+usuarios.get(i).getNome()+", E-mail: "+usuarios.get(i).getEmail());
		//}
		
		System.out.println("Retorno é: "+uc.autenticado("fabiojofre@gmail.com", "livresou")  );
		
	}

}
