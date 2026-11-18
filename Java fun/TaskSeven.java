
import java.util.Scanner;
public class TaskSeven{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int sum = 0;
	int even = 1;
	int average = 0;
	for(int count = 1 ; count <= 10 ; count++){
	System.out.print("Enter any integer number: ");
	int number = input.nextInt();
	  if (number % 2 == 0){
	  sum = sum + number;
	  total = sum + sum ;
	  average = total / even ;
	    even++;
	  
	 
	}
	
	
  
	
	
	
	}
	
	System.out.println(sum);
	System.out.println(average);
	
	
	
	
	
	  }
	}
