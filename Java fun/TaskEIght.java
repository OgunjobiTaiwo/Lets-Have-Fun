import java.util.Scanner;
public class TaskEight{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	while (count <= 10){
	 System.out.print("Enter any integer number: ");
	 int score = input.nextInt();
	   
	  if (score > 0  && score < 100){
	   sum = sum + score ;
	}
	count++;
	}
	System.out.print(sum);
	}
	}
