package zad2;

public class StringTask extends Thread {
	Thread t;
	String name;
	int number;
	
	StringTask(String name,int number){
		this.name=name;
		this.number=number;
		this.t=new Thread();
		System.out.println(t.getState());
	}

	public String getResult() {
		return "A";
	}
	
	public void start(){
		setState();
	}
	
	public void abort() {
		
	}
	public boolean isDone() {
		return true;
	}
	public TaskState getState() {
		TaskState n=new TaskState(t);
		return n;
	}
	@Override
	public void run() {
		String var=name;
		for(int i=0;i<number;i++)name=name+var;
	}
}
