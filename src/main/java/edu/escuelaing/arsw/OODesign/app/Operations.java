package edu.escuelaing.arsw.OODesign.app;

import java.util.List;
/**
 * This class is in charge of performing the mean and standard deviation operations
 * @author Daniel Santiago Ducuara Ardila
 */
public class Operations {
	//this variable stores the file
	public List<String> lines;
	//this variable stores the mean
	private double mean;
	//this variable stores the linkedList
	private LinkedList linkedList;
/**
 * the constructor is in charge of giving value to the variables and creating the nodes in the linkedList
 * @param lines is a list with the contents of the file
 */
	public Operations(List<String> lines) {
		this.lines = lines;
		linkedList = new LinkedList();
		for(int i=0;i<lines.size();i++) {
			linkedList.add(lines.get(i));
		}
		mean = 0;
	}
/**
 * This method is responsible for calculating the mean.
 * @return the value of the mean of double type
 */
	public double mean() {
		//stores the linkedList size
		int size = linkedList.size();
		for(int j=1;j<=size;j++) {
			mean+=Double.parseDouble(linkedList.get(j).toString());
		}
		mean = Math.round((mean/size)*100.0)/100.0;
		return mean;
	}
/**
 * This method is responsible for calculating the standard Deviation.
 * @return the value of the standard Deviation of double type
 */
	public double standardDeviation() {
		//Stores the result of the square root
    	double sigma = 0;
    	int size = linkedList.size();
    	for(int i=1;i<=size;i++) {
    		sigma+=Math.pow((Double.parseDouble(linkedList.get(i).toString()))-mean,2);
    	}
    	return Math.round(Math.sqrt(sigma/(size-1))*100.0)/100.0;
    }
  }
