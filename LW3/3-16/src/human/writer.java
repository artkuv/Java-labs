package human;

import book.book;
import book.review;
import book.story;

public class writer extends human{

	public static String write(book book)
	{
		book = new story(60);
		return "Book was written";
	}
	
	public static String read(review review)
	{
		return "Readed";
	}
}
