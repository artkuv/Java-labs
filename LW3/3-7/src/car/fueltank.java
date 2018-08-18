package car;

public class fueltank extends detail{

	private int value,quantity;
	
	public fueltank(int ms,int val,int qua)
	{
		super(ms);
		value = val;
		quantity = qua;
	}
	
	public static String givefuel()
	{
		return "Fuel is supplied";
	}
}
