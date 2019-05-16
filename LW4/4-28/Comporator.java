
public class Comporator extends Thread

		private volatile boolean mFinish = false;

		public void finish()		//Инициирует завершение потока
		{
			mFinish = true;
		}

		public void run()
		{
			do
			{
				if(!mFinish)	//Проверка на необходимость завершения
				{
					if(ch1==ch2)	
						return "Equal";
					else
						return "Not equal";
			        }
				else
					return;		//Завершение потока

				try{
					Thread.sleep(1000);		//Приостановка потока на 1 сек.
				}catch(InterruptedException e){}
			}
			while(true); 
		}
	}

        //Paste in buton action zone
	public class Program
	{
		public static void main(String[] args)
		{
			Comporator comp = new Comporator();	//Создание потока
			
			comp.start();	//Запуск потока
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			
			comp.finish();	//Инициация завершения побочного потока	
		}
}
