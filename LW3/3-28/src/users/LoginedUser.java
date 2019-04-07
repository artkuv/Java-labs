package users;
import other.main;

public class LoginedUser extends User{
	
	private String login;
	    
	public LoginedUser()
	{
		login = "";
	}
	
	public boolean changeLogin(String str) {
		login = str;
		if(login.equals(str))
			return true;
		else
			return false;
	}
	
	public  String logIn() {
		try {
			if(login.equals(""))
				throw new RuntimeException();
		}
	    catch (RuntimeException e){
	    	System.out.println("No login");
	    	return "Error";
		}
		
		if(login.equals("Admin123"))
			return "Admin";
		else {
			DB.addToDB(login);
			return login;
		}
	}
	
}
