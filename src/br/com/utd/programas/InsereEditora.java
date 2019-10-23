package br.com.utd.programas;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.utd.classes.Editora;

public class InsereEditora
{
	public static void main(String[] args)
	{
		EntityManagerFactory configConexao = Persistence.
				createEntityManagerFactory("editorautd");
		
		EntityManager gerencia = configConexao.createEntityManager();
		
		Editora novaEditora = new Editora();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome da Editora:");
		novaEditora.setNome(entrada.nextLine());
		
		System.out.println("Digite o e-mail da Editora:");
		novaEditora.setEmail(entrada.nextLine());
		
		entrada.close();
		gerencia.persist(novaEditora);
		
		gerencia.getTransaction().begin();
		gerencia.getTransaction().commit();
		
		configConexao.close();
	}
}
