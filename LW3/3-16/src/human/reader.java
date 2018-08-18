package human;

public class reader extends human{

	public static String givereview()
	{
		double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Not bad";

            case 2: return "Interesting";

            case 3: return "Did'nt impress";

            case 4: return "Masterpiece";

            default: return "WTF?";
        }
	}
}
