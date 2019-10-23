package br.com.utd.classes;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="editora")
public class Editora
{
	@Id
	@GeneratedValue //Auto-incremento
	private Long id;
	
	private String nome;
	private String email;
	
	
	@OneToMany
	private Collection<Livro> livros;
	
	//GETTERS AND SETTERS
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
}
