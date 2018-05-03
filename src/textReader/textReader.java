package textReader;
	import java.io.*;
public class textReader {


		public static void main(String[] args) throws IOException {
		
		
			File f1 = new File("H:\\tnm098\\tnm098\\lab3\\Lab3.2\\lab3\\text\\01.txt");
			
			BufferedReader in = (new BufferedReader(new FileReader(f1)));
			String line;
			String processedLine="";
			while ((line = in.readLine()) != null) {
			    processedLine = line.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase().replaceAll("( )+", " ");
			    System.out.print(processedLine);
		
			}
	
			
			
			
		}
		
}
