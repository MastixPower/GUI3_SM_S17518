package zad2;

public class TaskState{
String name;
Thread thread;
TaskState(Thread t){
	thread=t;
}
void Statement() {
	switch(thread.getState()) {
	case NEW:
	{
		thread.getState()=CREATED;
		break;
	}
	case RUNNABLE:
	{
		name="RUNNING";
		break;
	}
	case BLOCKED:
	{	name="ABORTED";
		break;
	}
	case WAITING:
	{
		name="ABORTED";
		break;
	}
	case TIMED_WAITING:
	{	name="ABORTED";
		break;
	}
	case TERMINATED:
	{	name="READY";
		break;
	}
	default: System.out.println("undefined State");
	}
}
public String toString() {
	return name;
}
}
