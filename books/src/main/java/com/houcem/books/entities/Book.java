package com.houcem.books.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBook;


	private String titleBook;
	
	
	private Double priceBook;
	

    private int year;
	
	private String description;
	
    @ManyToOne
	private Author author;
 
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", titleBook=" + titleBook + ", priceBook=" + priceBook + ", year=" + year
				+ ", description=" + description + ", author=" + author + "]";
	}

	public Book(Long idBook,  String titleBook,
		Double priceBook,  int year, String description,
			Author author) {
		super();
		this.idBook = idBook;
		this.titleBook = titleBook;
		this.priceBook = priceBook;
		this.year = year;
		this.description = description;
		this.author = author;
	}

	public Long getIdBook() {
		return idBook;
	}

	public void setIdBook(Long idBook) {
		this.idBook = idBook;
	}

	public String getTitleBook() {
		return titleBook;
	}

	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}

	public Double getPriceBook() {
		return priceBook;
	}

	public void setPriceBook(Double priceBook) {
		this.priceBook = priceBook;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}