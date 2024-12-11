package book_library.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException  extends Exception{
	
	private int invalidId;
	public BookNotFoundException(String errorMessage, int InvalidId)
	{
		super(errorMessage);
		this.invalidId=invalidId;
	}
	@Override
	public String getMessage()
	{
		String message = super.getMessage();
		String finalMessage = message + "==>" +invalidId;
		return finalMessage;
	}

}