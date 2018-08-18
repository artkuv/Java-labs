package human;

import book.book;
import book.review;

public class critic extends human{

	public static String write(book book)
	{
		book = new review(5);
		return "Ñritique was written";
	}
}
