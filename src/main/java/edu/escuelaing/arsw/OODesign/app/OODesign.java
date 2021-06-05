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
	
	
    public static void main( String[] args )
    {
    	LinkedList linkedList =  new LinkedList();
    	linkedList.add(24);
    	linkedList.add(25);
    	linkedList.add(26);
    	System.out.println(linkedList.getFirst().toString());
    	System.out.println(linkedList.getLast().toString());
    		    
    }
}
