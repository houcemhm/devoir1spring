package com.houcem.books.repos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.houcem.books.entities.Author;

import com.houcem.books.entities.Book;
@RepositoryRestResource(path = "rest")
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitleBook(String title);
	List<Book> findByTitleBookContains(String title);
	@Query("select b from Book b where b.titleBook like %?1 and b.priceBook= ?2")
	List<Book> findByTitlePrice(String title,Double prix );
	
	@Query("select b from Book b where b.author = ?1")
	List<Book> findByAuthor(Author author);
	
	List<Book> findByAuthorIdAuth(long id);

	List<Book> findByOrderByTitleBookAsc();
	
	@Query("select b from Book b order by b.titleBook ASC, b.priceBook DESC")
	List<Book> orderByTitlePrice ();

	
}

