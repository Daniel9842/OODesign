package edu.escuelaing.arsw.OODesign.app;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/**
 *this class finds and reads the input file.
 *@author Daniel Santiago Ducuara Ardila
 */
public class OODesign
{
	//variable that is responsible for calling operations
	public static Operations operations;
/**
 * 	this method converts a file to a list
 * @param args contains the name of the file to be executed
 */
    public static void main( String[] args )
    {

		try {
			operations = new Operations(Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/prueba2.txt"),
			        StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(operations.mean());
		System.out.println(operations.standardDeviation());
		
    }
    
}
