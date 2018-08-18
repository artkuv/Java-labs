package car;

public class car{

	private String name;
	
	public car(String ss)
	{
		name = ss;
	}
	
	public static String go()
	{
		return "GO";
	}
	
	public String rule(int ch)
    {
        switch (ch) {
            case 0:
                return (engine.start());
                
            case 1:
                return (fueltank.givefuel());
                
            case 2:
            	return (wheel.rotate());
        }
        return "WTF?";
    }
}
