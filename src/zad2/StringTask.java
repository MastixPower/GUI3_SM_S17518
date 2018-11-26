package zad2;

public class StringTask implements Runnable {
	String name;
	int number;
	
	StringTask(String name,int number)
	{
		this.name=name;
		this.number=number;
	}

	
	public String getState()
	{
		//...
		return " (y) ";
	}


	@Override
	public void run() {
		String var=name;
		for(int i=0;i<number;i++)name=name+var;
	}
}
