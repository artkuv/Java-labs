
public class main	
{
	public static int mValue = 0;

	public static void main(String[] args)
	{
		Incremenator mInc;
		mInc = new Incremenator();	
		
		mInc.start();

		do
		{
			try{
				Thread.sleep(0);		
			}catch(InterruptedException e){}
		}while(mValue <5);
		mInc.finish();
	}
}
