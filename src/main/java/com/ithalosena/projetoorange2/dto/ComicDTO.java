package com.ithalosena.projetoorange2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ithalosena.projetoorange2.model.Comic;

public class ComicDTO {

	
	private Long comicId;
	
	@NotBlank(message = "Digite um titulo")
	private String titulo;
	
	@NotNull
	private double preco;
	
	@NotBlank
	private  String autores;
	
	@NotBlank
	private String isbn;
	
	@NotNull
	private String descricao;

	public ComicDTO() {
	
	}

	public ComicDTO(@NotBlank(message = "Digite um titulo") String titulo, @NotBlank double preco,
			@NotBlank String autores, @NotBlank String isbn, @NotBlank String descricao) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.autores = autores;
		this.isbn = isbn;
		this.descricao = descricao;
	}
	
	public Comic dtoParaComic() {
		return new Comic(titulo, preco, autores, isbn, descricao);
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
