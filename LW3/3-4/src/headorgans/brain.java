package headorgans;

import headorgans.ear;
import headorgans.headorgan;
import headorgans.mouth;
import headorgans.nose;

public class brain extends headorgan {

    private int KPD;

    public  brain (int a)
    {
        super(100);
        KPD = a;
    }

    private String rule(int ch, int flag)
    {
        switch (ch) {
            case 0:
                nose nos  = new nose("gg");
                if (flag == 1)
                    return(nos.sniff());
                if (flag == 2)
                    return (nos.itch());
                break;

            case 1:
                mouth rot = new mouth("gg");
                if (flag == 1)
                    return (rot.Eat());
                if (flag == 2)
                    return (rot.Speak());
                break;
            case 2:
                ear uho = new ear(20,false);
                if (flag == 1)
                    return (uho.hear());
                break;
        }
        return "WTF?";
    }

    public String getResult(int ch, int flag)
    {
        return rule(ch,flag);
    }
}
