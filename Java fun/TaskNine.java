import java.util.Scanner;
public class TaskNine{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	
	int Total = 0;
	int sum = 0;
	for (int count = 1 ; count<= 10; count++){
	System.out.print("Enter your score: ");
	int score = input.nextInt();
	if (score > 0 && score <= 100){
	  sum = sum + score ;
	  Total = sum + sum;
	  }
	 
	  }
	  System.out.print(Total);
	    }
	  }
