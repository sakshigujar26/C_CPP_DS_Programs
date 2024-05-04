//Area of Circle with radius r
import java.util.Scanner;

class AreaofCircle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double radius = scanner.nextDouble();
		double area = Math.PI* radius* radius;
		System.out.println("The area of Circle :"+ area);
		}
	}
	
// convert temperature Fahrenheit to Celsius

class TempConvert{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		double fahrenheit = scanner.nextDouble();
		double celsius = (5.0/9.0) * (fahrenheit - 32);
		System.out.println("Temperature in celcius:" +celsius);
		}
	}
	
	
	
//Sum of two numbers
class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double firstNo = scanner.nextDouble();
		
		System.out.println("Enter second number");
		double secondNo = scanner.nextDouble();
	double sum = firstNo + secondNo;
	System.out.println("The sum of " + firstNo + secondNo + "is" + sum);
	}
}
		
		
		
		
		
		
		
		
		
		
		
