package zad2;

public class StringTask implements Runnable{
	Thread t;
	String name;
	int number;
	TaskState state=null;
	StringTask(String name,int number){
		
		this.name=name;
		this.number=number;
		this.t=new Thread();
		state=TaskState.CREATED;
		
	}

	public String getResult() {
		return name;
	}
	
	public void start(){
		state=TaskState.RUNNING;
		this.run();
	}
	
	public void abort() {
		state=TaskState.ABORTED;
		t.interrupt();
	}
	public boolean isDone() {
		if(state.equals(TaskState.READY) || state.equals(TaskState.ABORTED))
		return true;
		else return false;
	}
	public TaskState getState() {
		return state;
	}
	public void run() {
		
		String var=name;
		for(int i=1;i<number;i++) {
		System.out.println("1");
		name=name+var;
		}
		state=TaskState.READY;
	}
}
