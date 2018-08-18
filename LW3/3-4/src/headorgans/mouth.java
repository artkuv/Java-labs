package headorgans;

import bodyorgan.stomach;

public class mouth extends headorgan {

    private String size;

    public mouth(String ss)
    {
        super(100);
        size = ss;
    }

    public String Eat()
    {
        double a = Math.random()*3+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Delicious";

            case 2: return "Salty";

            case 3: return "Yuck";

            default: return "WTF?";
        }
    }

    public String Speak()
    {
        double a = Math.random()*3+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "hello!";

            case 2: return "how are you?";

            case 3: return "I'm okay";

            default: return "WTF?";
        }
    }

    public String GiveFood(String food)
    {
        stomach jel = new stomach(250, 500);
        return food + " " + jel.TakeFood(food);
    }
}