package other;

import car.car;

public class tractor extends car{

	private String equipment;
	
	public tractor(String ss) {
		super(ss);
	}

	public static String clear()
	{
		return "Snow removed";
	}
}
