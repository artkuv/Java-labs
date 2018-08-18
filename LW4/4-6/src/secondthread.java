class Incremenator extends Thread
{	
	private String str = "String";
	private volatile boolean mFinish = false;

	public void finish()		
	{
		mFinish = true;
	}

	public void run()
	{
		do
		{
			if(!mFinish)	
			{
				main.mValue++;
				System.out.print(main.mValue + " " + str + "\n");
			}
			else
				return;		

			try{
				Thread.sleep(1000);		
			}catch(InterruptedException e){}
		}
		while(true); 
	}
}