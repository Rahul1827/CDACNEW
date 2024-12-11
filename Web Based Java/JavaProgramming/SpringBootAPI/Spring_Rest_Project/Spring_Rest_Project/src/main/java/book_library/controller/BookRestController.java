package book_library.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import book_library.entity.Book;
import book_library.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService bookServiceReferService;
	@GetMapping("/books-api")
	public Collection<Book>getAllBooks(){
		
		Collection<Book>allAvailableBooks= bookServiceReferService.getAllBooks();
		return allAvailableBooks;
		
	}
  @GetMapping("/books-api/{book_id}")
	public Book getOneBook(@PathVariable("book_id")int bookId)
    {
		Book foundBook = bookServiceReferService.getOneBook(bookId);
		return foundBook;
    }
  @PostMapping("/books-api")
 	public void createNewBook(@RequestBody  Book newBook)
 	{
 		bookServiceReferService.createNewBook(newBook);
 	}

}
