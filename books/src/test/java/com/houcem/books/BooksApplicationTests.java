package com.houcem.books;
import com.houcem.books.entities.Book;
import com.houcem.books.repos.BookRepository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.houcem.books.entities.Book;
import com.houcem.books.entities.Author;
import com.houcem.books.repos.BookRepository;

@SpringBootTest
class BooksApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private BookRepository bookRepository;
	@Test
	public void testCreateBook() {
	//Book  Book = new Book("ddd",44.6,44,"fffffff");
	//bookRepository.save(Book);
	}
	
	@Test
	public void testFindBook()
	{
	Book b = bookRepository.findById(1L).get();
	System.out.println(b);
	}
	@Test
	public void testUpdateProduit()
	{
	Book b = bookRepository.findById(1L).get();
	b.setPriceBook(10.0);
	bookRepository.save(b);
	}
	@Test
	public void testDeleteProduit()
	{
	bookRepository.deleteById(1L);;
	}

	@Test
	public void testListAll()
	{
	List<Book> prods = bookRepository.findAll();
	for (Book b : prods)
	{
	System.out.println(b);
	}
	}
	@Test
	public void testFindByNomProduit()
	{
	List<Book> prods = bookRepository.findByTitleBook("ooooh ");
	for (Book p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomProduitContains ()
	{
	List<Book> prods=bookRepository.findByTitleBookContains("ooooh");
	for (Book p : prods)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByTitlePrice()
	{
	List<Book> prods = bookRepository.findByTitlePrice("ooooh" ,10.0);
	for (Book p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByCategorie()
	{
	Author auth = new Author();
	auth.setIdAuth(1L);
	List<Book> books = bookRepository.findByAuthor(auth);
	for (Book b : books)
	{
	System.out.println(b);
	}
	}
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Book> books =
	bookRepository.findByOrderByTitleBookAsc();
	for (Book b : books)
	{
	System.out.println(b);
	}
	}

	@Test
	public void testaOrederByTitlePrice()
	{
	List<Book> books = bookRepository.orderByTitlePrice();
	for (Book b : books)
	{
	System.out.println(b);
	}
	}
	
	
	
	
	
}
