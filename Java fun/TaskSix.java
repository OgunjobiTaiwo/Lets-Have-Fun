import java.util.Scanner;
public class TaskSix{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int average = 0;
	int total = 0;
	int sum = 0;
	int even = 0;
	for(int count = 1 ; count <= 10 ; count++){
	System.out.print("Enter any integer number: ");
	int number = input.nextInt();
	  if (number % 2 == 0){
	  sum = sum + number;
	    even++;
	 
	}
	
	
  average = sum  / even;
	
	
	
	}
	
	System.out.print(average);
	
	
	
	
	
	
	  }
	}
