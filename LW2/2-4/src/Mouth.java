public class Mouth extends Organ {

    private String size;

    public Mouth(String ss)
    {
        super(100);
        size = ss;
    }
    
    public String Eat()
    {
        double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Delicious";

            case 2: return "Salty";

            case 3: return "Sweetly";

            case 4: return "Yuck";

            default: return "WTF?";
        }
    }

    public String Speak()
    {
        double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Hello!";

            case 2: return "How are you?";

            case 3: return "I'm okay";

            case 4: return "I'm a smart software!!!";

            default: return "WTF?";
        }
    }
}