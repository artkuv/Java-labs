package users;

import java.util.ArrayList;

import other.Message;

public class Admin extends LoginedUser{
    
	public boolean deleteMessage(ArrayList<Message> msglist)
	{	
		if(msglist.remove(msglist.size()-1) != null)
			return false;
		else
			return true;
	}
	
}
