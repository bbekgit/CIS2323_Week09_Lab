import java.io.*;

public class Test{
	public static void main(String []args){
		String filename = "test.txt";
		String line = null;
		
		try{
		FileReader fileReader = new FileReader(fileName);
		
		BufferReader bufferReader = new BufferReader(fileReader);
		
		while((line = bufferReader.readLine()) ! = null){
			System.out.println(line);
		}
		bufferReader.close();
		
		}catch (FileNotFoundException ex){
			System.out.println("Can't open file: " + fileName);
		}catch (IOException ex){
            System.out.println("Error opening file: " + fileName);  			
		}
	}
	
}