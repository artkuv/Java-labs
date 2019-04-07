package users;

import java.util.ArrayList;

import messages.Message;

public class Admin extends LoginedUser{
    
	public void deleteMessage(ArrayList<Message> msglist) {	
		try {
			if(msglist.isEmpty())
				throw new RuntimeException();
			if(msglist.remove(msglist.size()-1) != null)
				throw new Exception();
		}
		catch (RuntimeException e) {
			System.out.println("0 messages in the forum");
		}
		catch(Exception e) {
			System.out.println("Cannot delete message");
		}
	}
	
	public void deleteUser(ArrayList<String> db, String name) {	DB.deleteFromDB(name); }
}
