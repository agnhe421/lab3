import java.io.*;

public class lab3 {

	public static void main(String[] args) throws IOException {
		
		 // pass the path to the file as a parameter
	    FileReader fr =
	    new FileReader("H:\\tnm098\\tnm098\\lab3\\Lab3.2\\text\\01.txt"); 
	  
	    int i;
	    while ((i=fr.read()) != -1)
	      System.out.print((char) i);
	}
	
}
