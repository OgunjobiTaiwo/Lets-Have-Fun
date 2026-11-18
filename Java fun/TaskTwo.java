import java.util.Scanner;
public class TaskTwo{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0;
	for(int count = 1 ; count <= 10 ; count++){
	System.out.print("Enter any integer number: ");
	int number = input.nextInt();
	sum = sum + count ;
	average = sum  / count;
	}
	System.out.print(average+ " is the average");
	
	  
	  
	  
	  
	  
	  }
	}
