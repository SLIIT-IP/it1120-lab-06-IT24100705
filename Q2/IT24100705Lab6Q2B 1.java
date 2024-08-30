import java.util.Scanner;
public class IT24100705Lab6Q2B{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number[] = new int[11];
	int count=1;
	System.out.println("Please enter 10 numbers :");
	while (count<=10){
		System.out.println("Enter number "+count+" : " );
		number[count]=input.nextInt();
		count=count+1;
}
	
	System.out.println("The numbers you entered are :");
	count =1;
	while(count<=10){
		System.out.print(number[count]+" ");
		count=count+1;
}

		
	

 }
}