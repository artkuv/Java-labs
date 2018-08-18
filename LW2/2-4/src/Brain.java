public class Brain extends Organ {

    private int KPD;
    
    public  Brain (int a)
    {
        super(100);
        KPD = a;
    }

    private String rule(int ch, int flag)
    {
        switch (ch) {
            case 0:
                Nose nos  = new Nose("gg");
                if (flag == 1)
                    return(nos.sniff());
                if (flag == 2)
                    return (nos.itch());
                break;

            case 1:
                Mouth rot = new Mouth("gg");
                if (flag == 1)
                    return (rot.Eat());
                if (flag == 2)
                    return (rot.Speak());
                break;
        }
        return "WTF?";
    }

    public String getResult(int ch, int flag)
    {
        return rule(ch,flag);
    }
}
