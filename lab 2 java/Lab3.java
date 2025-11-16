import java.util.Scanner;
	public class Lab3{
	static Scanner console=new Scanner(System.in);
	public static void main(String [] args){
	int Secret=11;
	double Rate=12.50;
	int num1;
	int num2;
	int Newnum;
	String name;
	double hoursworked;
	double wages;
	System.out.println("enter two numbers with space between:");
	num1=console.nextInt();
	num2=console.nextInt();
	System.out.println("the value of num1="+ num1 );
	System.out.println("the value of num2="+ num2);
	Newnum = num1*2+num2;
	System.out.println("the value of Newnum="+ Newnum);
	Newnum= Newnum+ Secret;
	System.out.println("the value of Newnum="+ Newnum );
	System.out.println("enter your last name");
	name=console.next();
	System.out.println("enter a decimal number between 0 and 70");
	hoursworked=console.nextDouble();
	wages=Rate*hoursworked;
	System.out.println(" name="+ name );
	System.out.println("Rate="+ Rate );
	System.out.println("hoursworked="+ hoursworked);
	System.out.println("wages=$"+ wages );
	}
}
