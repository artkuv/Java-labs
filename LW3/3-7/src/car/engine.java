package car;

public class engine extends detail{

	public engine(int ms) {
		super(ms);
	}


	private static void work()
	{
		fueltank.givefuel();
		wheel.rotate();
	}
	
	public static String start()
	{
		work();
		return "Engine started";
	}

}
