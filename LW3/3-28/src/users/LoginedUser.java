package users;

public class LoginedUser extends User{
	
	private String login;
	    
	public LoginedUser()
	{
		login = "";
	}
	
	public void changeLogin(String str) {
		try {
			login = str;
			if(!login.equals(str))
				throw new RuntimeException();
		}
	    catch (RuntimeException e){
	    	System.out.println("Cannot change login");
		}
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
		finally {
			if(login.equals("Admin123"))
				return "Admin";
			else {
				DB.addToDB(login);
				return login;
			}
		}
	}
	
}
