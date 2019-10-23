package br.com.utd.programas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.utd.classes.Autor;

public class ListaAutor
{

	public static void main(String[] args)
	{
		EntityManagerFactory configConexao = Persistence.
				createEntityManagerFactory("editorautd");
		
		EntityManager gerencia = configConexao.createEntityManager();
		
		Query consulta = gerencia.createQuery("SELECT e FROM Autor e");
		List<Autor> autores = consulta.getResultList();
		
		for(Autor a: autores)
		{
			System.out.println("Autor: "+a.getNome()+" - "+a.getEmail());
		}
	}
	
}