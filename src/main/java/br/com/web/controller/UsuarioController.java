package br.com.web.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.web.model.Usuario;

public class UsuarioController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	
	public UsuarioController() {
		emf = Persistence.createEntityManagerFactory("mysqlConection");
		em = emf.createEntityManager();
		}
	
	public void salvar(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}
	public void remover(Usuario usuario) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("DELETE FROM Usuario WHERE email = '"+usuario.getEmail() + "'");
		q.executeUpdate();
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();
	}
	public List<Usuario>lista(){
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT Usuario FROM Usuario Usuario");
		List<Usuario>lista = q.getResultList();
		em.getTransaction().commit();
		em.close();
		return lista;
	}	
	public boolean autenticado(String email, String senha){
		List<Usuario>usuario = lista();
		boolean retorno = false;
		for (int i = 0; i < usuario.size()&& retorno == false; i++) {
				if ((usuario.get(i).getEmail().equals(email))&&(usuario.get(i).getSenha().equals(senha))) {
					retorno = true;
				}else retorno = false;
	}return retorno;
		
	}
}
