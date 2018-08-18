package car;

public class wheel extends detail{

	public static boolean blown_condition;
	
	public wheel(int ms) {
		super(ms);
		blown_condition = false;
	}

	public static String rotate()
	{
		return "Rotating";
	}
}
