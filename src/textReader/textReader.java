package textReader;
import java.io.*;
import java.util.*;
public class textReader {

		public static void main(String[] args) throws IOException{
			
		ArrayList<String> list = new ArrayList<String> ();
		Map dictionary = new HashMap(); 
		int hash = 0; 
		
		File f1 = new File(".\\.\\.\\text\\01.txt");
		File f2 = new File (".\\.\\.\\text\\02.txt"); 
		File f3 = new File (".\\.\\.\\text\\03.txt"); 
			
		//Create bufferedReader to read text from file
		BufferedReader in = (new BufferedReader(new FileReader(f1)));
		String line;
		String processedLine="";
			
			//Remove punctuation and convert to lower case
			while ((line = in.readLine()) != null) {
			    processedLine = line.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase().replaceAll("( )+", " ");
			   // System.out.print(processedLine);
			    
			    //Add words to list 
				for (String word : processedLine.split("\\s+")) {
					  list.add(word);

						  if(! dictionary.containsKey(word)) {
							  dictionary.put(word, hash);
							  hash++; 
						  }
						  	
					  
					}
				
				
			}
			
	System.out.print(list); 
	System.out.println(""); 
	System.out.print(dictionary);
				 
		}
		
}
