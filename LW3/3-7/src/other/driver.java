package other;

import car.body;
import car.wheel;

public class driver {

	public static String inflate()
	{
		wheel.blown_condition = true;
		return "Wheel is inflated";
	}
	
	public static String rule(int ch)
	{
		if (ch == 1)
			return body.opendoor();
		else if (ch == 2) 
			return body.closedoor();
		else return "WTF?";
	}
}
