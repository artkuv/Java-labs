package users;

public class LoginedUser extends User{
	
	private String login;
	    
	public  boolean logIn()
	{
		if(login == "Admin123")
			return true;
		else
			return false;
	}
	
	public boolean changeLogin(String str) {
		login = str;
		if(login == str)
			return true;
		else
			return false;
	}
}
