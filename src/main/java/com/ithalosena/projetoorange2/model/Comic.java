package com.ithalosena.projetoorange2.model;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

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

	public Comic(String titulo, double preco, String autores, String isbn, String descricao) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.autores = autores;
		this.isbn = isbn;
		this.descricao = descricao;
	}

	static GregorianCalendar dataAtual = new GregorianCalendar();

	public static String weekDay(Calendar cal) {
		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
	}

	public static boolean descontoAtivo(String isbn) {
		boolean descontoAtivo = true;
		
		if(weekDay(dataAtual).equals("segunda-feira") && (isbn.endsWith("0") || isbn.endsWith("1"))) {
			descontoAtivo = true;
		}else if(weekDay(dataAtual).equals("terça-feira") && (isbn.endsWith("2") || isbn.endsWith("3"))) {
			descontoAtivo = true;
		}else if(weekDay(dataAtual).equals("quarta-feira") && (isbn.endsWith("4") || isbn.endsWith("5"))) {
			descontoAtivo = true;
		}else if(weekDay(dataAtual).equals("quinta-feira") && (isbn.endsWith("6") || isbn.endsWith("7"))) {
			descontoAtivo = true;
		}else if(weekDay(dataAtual).equals("sexta-feira") && (isbn.endsWith("8") || isbn.endsWith("9"))) {
			descontoAtivo = true;
		}else 
			descontoAtivo=false;
		
		return descontoAtivo;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(autores, comicId, descricao, isbn, preco, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comic other = (Comic) obj;
		return Objects.equals(autores, other.autores) && Objects.equals(comicId, other.comicId)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& Objects.equals(titulo, other.titulo);
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
