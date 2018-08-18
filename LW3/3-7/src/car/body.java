package car;

public class body {

	private int doorscount;
	
	public body(int count)
	{
		doorscount = count;
	}
	
	public static String opendoor()
	{
		return "Door is opened";
	}
	
	public static String closedoor()
	{
		return "Door is closed";
	}
}
