
public class medic extends human{

	private String specialty;
	
	public static String diagnose(issue issue)
	{
		return issue.symptoms;
	}
	
	public static String heal()
	{
		return "All done";
	}
}
