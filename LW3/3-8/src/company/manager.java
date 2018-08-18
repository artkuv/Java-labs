package company;

public class manager {
	
	private String name;
	
	public static String chname()
	{
		company.name = "IBM";
		return "Name changed";
	}

	public static String chplan()
	{
		company.plan = "Growth";
		return "Plan changed";
	}
}
