package edu.escuelaing.arsw.OODesign.app;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * this class performs unit tests.
 * @author Daniel Santiago Ducuara Ardila
 *
 */
public class OODesignTest 
extends TestCase
{
	//test file number 1
	private List<String> linesFile1;
	//test file number 2
	private List<String> linesFile2;
	//test file number 3
	private List<String> linesFile3;
/**
 * This test consists of obtaining the mean and standard deviation of file number 1.
 */
	public void testFile1() {
		try {
			linesFile1 = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller2OODesign/OODesign/src/test/java/edu/escuelaing/arsw/OODesign/app/prueba1.txt"),
					StandardCharsets.UTF_8);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		Operations operations = new Operations(linesFile1);	  
		assertEquals(550.6,operations.mean());
		assertEquals(572.03,operations.standardDeviation());
	}
/**
 * This test consists of obtaining the mean and standard deviation of file number 2.	
 */
	public void testFile2() {
		try {
			linesFile2 = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller2OODesign/OODesign/src/test/java/edu/escuelaing/arsw/OODesign/app/prueba2.txt"),
					StandardCharsets.UTF_8);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		 Operations operations = new Operations(linesFile2);
		 assertEquals(60.32,operations.mean());
		 assertEquals(62.26,operations.standardDeviation());
	}
/**
 * This test consists of obtaining the mean and standard deviation of file number 3.	
 */
	public void testFile3() {
		try {
			linesFile3 = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller2OODesign/OODesign/src/test/java/edu/escuelaing/arsw/OODesign/app/prueba3.txt"),
					StandardCharsets.UTF_8);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		 Operations operations = new Operations(linesFile3);
		 assertEquals(638.9,operations.mean());
		 assertEquals(625.63,operations.standardDeviation());
	}
	/**
	 * check the error in the document address
	 */
	public void testFileNotFound() {
		String value = null;
		try {
		List<String> lines = Files.readAllLines(Paths.get(value),
				StandardCharsets.UTF_8);
		} catch (Exception e) {
			assertTrue(true);
			}
		}
	
}