/**
 *
 *  @author Stasiak Mateusz S17518
 *
 */

package zad3;

import java.io.*;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
	  File file=new File("C:\\Users\\MastixPower\\Desktop\\GUI3_SM_S17518\\src\\zad3\\text.txt");
	  Towar t=new Towar(file);
	  t.run();
	  	  
  }
}
