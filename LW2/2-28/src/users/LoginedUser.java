package users;

public class LoginedUser extends User{
	
	private String login;
	    
	public boolean changeLogin(String str) {
		login = str;
		if(login.equals(str))
			return true;
		else
			return false;
	}
	
	public  boolean logIn()
	{
		if(login.equals("Admin123"))
			return true;
		else
			return false;
	}
	
}
