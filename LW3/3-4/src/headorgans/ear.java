package headorgans;

import headorgans.headorgan;

public class ear extends headorgan{
    boolean earring;

    public ear(int ms, boolean ear_ring) {
        super(ms);
        earring = ear_ring;
    }

    public String hear()
    {
        double a = Math.random()*3+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "I remember this sound from my childhood";

            case 2: return "Hmm,Too silent in a room";

            case 3: return "It's my live!!!";

            default: return "WTF?";
        }
    }
}
