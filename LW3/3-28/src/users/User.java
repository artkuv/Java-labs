package users;
import java.util.ArrayList;

import messages.Message;
public class User {

    public void createMessage(ArrayList<Message> msg, String txt, boolean img) throws RuntimeException{
    	try {
    		Message newmsg = new Message(txt,img);
        	if(!msg.add(newmsg))
				throw new RuntimeException();
		}
		catch (RuntimeException e) {
			System.out.println("Message wasn't created");
		}	
    }
}