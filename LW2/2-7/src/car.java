public class car{

	private String name;
	
	public car(String ss)
	{
		name = ss;
	}
	
	public String go()
	{
		return "GO";
	}
	
	public String rule(int ch, int flag)
    {
        switch (ch) {
            case 0:
                engine engine = new engine(90);
                if (flag == 1)
                    return (engine.start());
                if (flag == 2)
                    return (engine.work());
                break;

            case 1:
                return (fueltank.givefuel());
                
            case 2:
            	return (wheel.rotate());
        }
        return "WTF?";
    }
}
