package users;
import java.util.ArrayList;

import other.Message;
public class User {

    public boolean createMessage(ArrayList<Message> msg, String txt, boolean img) {
    	Message newmsg = new Message(txt,img);
    	if(!msg.add(newmsg))
    		return false;
    	else
    		return true;	
    }
}