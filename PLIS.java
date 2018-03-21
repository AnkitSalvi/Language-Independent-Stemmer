import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class PLIS {

	public static void main(String[] args) throws IOException {
	//Query parsing
		
		
		
	//Query Parsing	
		
		
	//Step 2
	Path path =  Paths.get("/home/ankit/Downloads/PLIS/PLIS/src/Stopwords").toAbsolutePath();
	List<String> list = Files.lines(path).collect(Collectors.toList());	
	
	String word = "Naruto";

	
	boolean inFile = list.stream().anyMatch(p->p.equalsIgnoreCase(word));
	if(inFile) 
	{
		//Step 8	
		
	}
	else 
	{
		//Step 3 
		int length = word.length();
		if(length < 3) 
		{
			//return the word as the stem word
		}
		else 
		{
				
		}
	}
		
  
	
	
	}
	

}
