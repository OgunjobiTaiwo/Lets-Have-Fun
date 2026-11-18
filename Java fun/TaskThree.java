import java.util.Scanner;
public class TaskThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0 ;
	int Total = 0;
	for(int count = 1 ; count <= 10 ; count++){
	System.out.print("Enter any integer number: ");
	int number = input.nextInt();
	sum = sum + number ;
	Total = sum + sum ;
	average = sum  / count;
	

	}
	
  System.out.print(Total + "is the Total");
	System.out.println(average + "is the average");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
