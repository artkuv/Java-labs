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
	
	public  String logIn() {
		
			if(login=="")
				throw new RuntimeException("No login");
			if(login.equals("Admin123"))
				return "Admin";
			else {
				DB.addToDB(login);
				return login;	
			}
	}
	
}
