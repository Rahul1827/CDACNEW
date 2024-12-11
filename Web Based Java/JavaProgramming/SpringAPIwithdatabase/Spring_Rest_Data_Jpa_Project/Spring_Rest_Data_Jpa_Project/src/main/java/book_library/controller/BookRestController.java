package book_library.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import book_library.entity.Book;
import book_library.exceptions.BookNotFoundException;
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
	public Book getOneBook(@PathVariable("book_id")int bookId) throws BookNotFoundException
    {
		Book foundBook = bookServiceReferService.getOneBook(bookId);
		// If book is not found , raise some exception
		
		if(foundBook==null)
			throw new BookNotFoundException("Book with given Id not found", bookId);
		return foundBook;
    }
  @PostMapping("/books-api")
 	public void createNewBook(@RequestBody  Book newBook)
 	{
 		bookServiceReferService.createNewBook(newBook);
 	}
  
  @PutMapping("/books-api")
 	public void updateExistingBook(@RequestBody  Book existingBook)
 	{
 		bookServiceReferService.createNewBook(existingBook);
 	}

  @DeleteMapping("/books-api/{bookId}")
	public void deleteOneBook(@PathVariable  int bookId)
	{
		bookServiceReferService.deleteOneBook(bookId);
	}
}
