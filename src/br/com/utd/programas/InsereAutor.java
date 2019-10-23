package br.com.utd.programas;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.utd.classes.Autor;

public class InsereAutor {

	public static void main(String[] args)
	{
		EntityManagerFactory configConexao = Persistence.
				createEntityManagerFactory("editorautd");
		
		EntityManager gerencia = configConexao.createEntityManager();
		
		Autor novoAutor = new Autor();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do autor:");
		novoAutor.setNome(entrada.nextLine());
		
		System.out.println("Digite o e-mail do autor:");
		novoAutor.setEmail(entrada.nextLine());
		
		entrada.close();
		gerencia.persist(novoAutor);
		
		gerencia.getTransaction().begin();
		gerencia.getTransaction().commit();
		
		configConexao.close();

	}

}
