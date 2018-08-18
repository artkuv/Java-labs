package company;

public class rushorder extends order{
	
	public static int time;
	
	public rushorder(int num, int amou, String stat, String nam) {
		super(num, amou, stat, nam);		
	}
	
	public static String check()
	{
		double a = Math.random()*3+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Enough time";

            case 2: return "We are late";

            case 3: return "It is time to hurry up";

            default: return "WTF?";
        }
	}

}
