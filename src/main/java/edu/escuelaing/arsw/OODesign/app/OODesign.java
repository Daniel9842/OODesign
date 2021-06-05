package edu.escuelaing.arsw.OODesign.app;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/**
 * Hello world!
 *
 */
public class OODesign
{
	static List<String> lines;
	static LinkedList linkedList =  new LinkedList();
	static double mean;
	static double standardDeviation;
    public static void main( String[] args )
    {

		try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/prueba3.txt"),
			        StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<lines.size();i++) {
			linkedList.add(lines.get(i));
		}
		mean = mean();	
		standardDeviation = standardDeviation();
		
		System.out.println(mean);
		System.out.println(standardDeviation);
    }
    
    public static double mean() {
    	double count = 0;
    	int size = linkedList.size();
    	for(int j=1;j<=size;j++) {
    		count+=Double.parseDouble(linkedList.get(j).toString());
    	}
    	return Math.round((count/size)*100.0)/100.0;
      }
    
    public static double standardDeviation() {
    	double sigma = 0;
    	int size = linkedList.size();
    	for(int i=1;i<=size;i++) {
    		sigma+=Math.pow((Double.parseDouble(linkedList.get(i).toString()))-mean,2);
    	}
    	return Math.round(Math.sqrt(sigma/(size-1))*100.0)/100.0;
    }
}
