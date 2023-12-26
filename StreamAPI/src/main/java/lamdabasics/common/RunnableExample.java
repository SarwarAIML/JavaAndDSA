package lamdabasics.common;

public class RunnableExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		Thread anonyMousThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("anonymous runnable");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		//lambda Thread
		//run method Implementation 
		
		Thread lambdaThread = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				try 
				{
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("lambda runnable");	
			}
		});
		//thread join examples
		lambdaThread.start();
		lambdaThread.join();
		anonyMousThread.start();
		anonyMousThread.join();
		
	}

}
