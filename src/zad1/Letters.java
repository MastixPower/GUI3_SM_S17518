package zad1;
import java.util.Iterator;

public class Letters extends Thread implements Iterable<String>{
String word;
String letter="Thread ";
int counter=0;
Iterator<String> iterator;
Letters(String var)
{
	this.word = var;
    iterator = new Iterator<String>() {
    	 @Override
         public boolean hasNext() {
    		 if(counter<word.length())return true;
             return false;
         }

         @Override
         public String next() {
           letter=letter+Letters.this.word.charAt(counter);
           counter++;
             return Letters.this.letter;
         }
    };
}
Iterator<String> getThreads()
{
	return letter;
}


@Override
public Iterator<String> iterator() {

    return this.iterator;


}
}
