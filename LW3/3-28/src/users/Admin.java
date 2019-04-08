package users;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import messages.Message;

public class Admin extends LoginedUser{
    
	public void deleteMessage(ArrayList<Message> msglist) throws NoSuchElementException, RuntimeException {	
		try {
			if(msglist.isEmpty())
				throw new NoSuchElementException();
			if(msglist.remove(msglist.size()-1) == null)
				throw new RuntimeException();
		}
		catch (NoSuchElementException e) {
			System.out.println("0 messages in the forum");
		}
		catch (RuntimeException c) {
			System.out.println("Cannot delete message");
		}
	}
	
	public void deleteUser(ArrayList<String> db, String name) {	DB.deleteFromDB(name); }
}
