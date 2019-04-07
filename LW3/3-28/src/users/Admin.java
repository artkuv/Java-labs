package users;

import java.util.ArrayList;

import messages.Message;

public class Admin extends LoginedUser{
    
	public boolean deleteMessage(ArrayList<Message> msglist) {	
		if(msglist.isEmpty())
			return false;
		if(msglist.remove(msglist.size()-1) != null)
			return true;
		else
			return false;
	}
	
	public void deleteUser(ArrayList<String> db, String name) {	DB.deleteFromDB(name); }
}
