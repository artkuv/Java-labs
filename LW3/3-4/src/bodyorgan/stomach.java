package bodyorgan;

import bodyorgan.bodyorgan;

public class stomach extends bodyorgan {
    double volume;

    public stomach(int ms, double vol) {
        super(ms);
        volume = vol;
    }

    public String TakeFood(String food)
    {
        if(Digest())
            return "digested";
        else return "undigested";
    }

    public boolean Digest()
    {
        return true;
    }
}
