import java.util.Scanner;
public class IT24100705Lab6Q2C{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number[] = new int[11];
	int count=1;
	int sum=0;
	double avg;
	System.out.println("Please enter 10 numbers :");
	while (count<=10){
		System.out.println("Enter number "+count+" : " );
		number[count] =input.nextInt();
		sum=sum+number[count];
		count=count+1;
		
}
	
		System.out.print("The numbers you entered are :");
	count =1;
	while(count<=10){
		System.out.print(number[count]+" ");
		count=count+1;
}
		
		avg=sum/10;
		System.out.println("Sum of the numbers : "+sum);
		System.out.println("Average of the numbers : "+avg);

		

 }
}