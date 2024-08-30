import java.util.Scanner;
public class IT24100705Lab6Q1 {
public static void main(String[] args) {
	double num,square,squareRoot;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number : ");
	num = input.nextDouble();
	square = Math.sqrt(num);
	squareRoot =Math.pow(num ,2);
	System.out.println("The square of "+num+" is : "+square);
	System.out.println("The square root of "+num+" is : "+squareRoot);
	
 }
	
}