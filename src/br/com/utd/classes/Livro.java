package br.com.utd.classes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="livro")
public class Livro
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=30, nullable = false, name="nome_livro")
	private String nome;
	@ManyToMany
	@JoinTable(name="Relation")
	private Collection<Autor> autores = new ArrayList<Autor>();
	
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
	public Collection<Autor> getAutores()
	{
		return autores;
	}
	public void setAutores(Collection<Autor> autores)
	{
		this.autores = autores;
	}
	
	

}
