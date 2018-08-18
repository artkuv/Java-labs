package headorgans;

import headorgans.headorgan;

public class nose extends headorgan {

    private String form;

    public nose(String ss)
    {
        super(100);
        form = ss;
    }

    public String sniff()
    {
        double a = Math.random()*3+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Mmm, like an oil... I like that smell";

            case 2: return "Wow, you bought a new perfume!";

            case 3: return "Will it be chicken for a dinner?";

            default: return "WTF?";
        }
    }

    public String itch()
    {
        double a = Math.random()*2+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "I need more";

            case 2: return "That's great feeling";

            default: return "WTF?";
        }
    }
}
