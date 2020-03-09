package br.com.web.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.web.model.Telefone;
import br.com.web.model.Usuario;

public class TelefoneController {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	
	public TelefoneController() {
		emf = Persistence.createEntityManagerFactory("mysqlConection");
		em = emf.createEntityManager();
		}
	
	public void salvar(Telefone fone) {
		em.getTransaction().begin();
		em.merge(fone);
		em.getTransaction().commit();
		em.close();
	}
	public void remover(Telefone fone) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("DELETE FROM Telefone WHERE numero = '"+fone.getNumero() + "'");
		q.executeUpdate();
		em.remove(fone);
		em.getTransaction().commit();
		em.close();
	}
	public List<Telefone>lista(){
		em.getTransaction().begin();
		Query q = em.createQuery("SELECT Telefone FROM Telefone Telefone");
		List<Telefone>lista = q.getResultList();
		em.getTransaction().commit();
		em.close();
		return lista;
		}
}
