package br.com.utd.programas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.utd.classes.Editora;

public class ListaEditora
{

	public static void main(String[] args)
	{
		EntityManagerFactory configConexao = Persistence.
				createEntityManagerFactory("editorautd");
		
		EntityManager gerencia = configConexao.createEntityManager();
		
		Query consulta = gerencia.createQuery("SELECT e FROM Editora e");
		List<Editora> editoras = consulta.getResultList();
		
		for(Editora e: editoras)
		{
			System.out.println("Editora: "+e.getNome()+" - "+e.getEmail());
		}
	}
	
}
