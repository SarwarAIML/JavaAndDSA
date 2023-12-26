package lamdabasics.common;

public class HelloWorldGreeting implements Greeting
{

	@Override
	public void performs() 
	{
		System.out.println("Hello World");
	}

}
