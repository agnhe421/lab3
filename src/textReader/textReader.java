package textReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class textReader {

		public static void main(String[] args) throws IOException {
			
		ArrayList<String> list = new ArrayList<String> ();
		List<byte[]> hashes = new ArrayList<byte[]>(list.size());
		
			//Read file from folder text 
			File f1 = new File(".\\.\\.\\text\\01.txt");
			File f2 = new File (".\\.\\.\\text\\02.txt"); 
			File f3 = new File (".\\.\\.\\text\\03.txt"); 
			
			BufferedReader in = (new BufferedReader(new FileReader(f1)));
			String line;
			String processedLine="";
			
			//Remove punctuation and convert to lower case
			while ((line = in.readLine()) != null) {
			    processedLine = line.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase().replaceAll("( )+", " ");
			    System.out.print(processedLine);
			
				for (String word : line.split("\\s+")) {
					  list.add(word);
					}
			
				
			
			}

		}
		
}
