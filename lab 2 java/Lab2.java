import java .util.Scanner;
	public class Lab2{
	public static void main (String[] args){
	Scanner console = new Scanner (System.in);
	int width;
	int length;
	int perimeter;
	int area;
	System.out.println("Enter the length:");
	length=console.nextInt();
	System.out.println("Enter the width:");
	width=console.nextInt();
	area=width*length;
	System.out.println("Area="+ area);
	perimeter=2*(length+width);
	System.out.println("Perimeter="+perimeter);
	}
}