package com.ithalosena.projetoorange2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comicId;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private double preco;
	
	@Column(nullable = false)
	private  String autores;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(nullable = false)
	private String descricao;
	
	
	public Comic() {
		
	}


	public Long getComicId() {
		return comicId;
	}


	public void setComicId(Long comicId) {
		this.comicId = comicId;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getAutores() {
		return autores;
	}


	public void setAutores(String autores) {
		this.autores = autores;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
