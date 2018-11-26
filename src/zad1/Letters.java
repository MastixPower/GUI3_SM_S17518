package zad1;
import java.util.ArrayList;
import java.util.List;

public class Letters extends Thread{
	String word;
	public Thread t;
	int wordInteger=0;
    List <Thread> list= new ArrayList<Thread>();
    
    Letters(String word){
       this.word=word;
       for(int i=0;i<word.length();i++)
       {
    	   t=new Thread(){
    		   
    	          @Override
    	          public void run(){
    	        	  for(;;)
    	        	  {
    	    	           
    	    	            try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} 
    	    	            System.out.print(getName());
    	        	  }
    	          }
    	        };
    	   t.setName("Thread "+this.word.charAt(i));
    	   //System.out.println(" "+this.word.charAt(wordInteger));
    	   wordInteger++;
    	   list.add(t);
       }
       };
         
      public void runThreads() {
    	  for(int i=0;i<word.length();i++) {
    		list.get(i).setName(word.charAt(i)+"");
    		list.get(i).start();
  		  }
    	 
      }
      Runnable task3 = () -> {
        System.out.print(Thread.currentThread().getName());
    };
      public void stopThreads() {
    	  for(int i=0;i<word.length();i++)
    	  {
    		  list.get(i).stop();
    	  }
      }
      public List<Thread> getThreads() {
    	  
    	  return list;
      }
       
    }
