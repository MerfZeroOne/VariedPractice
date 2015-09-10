import java.util.Scanner;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1, num2;

double cube1, cube2, sum;

Scanner scan = new Scanner(System.in);


System.out.println ("Enter first number to be raised to the third power: ");
num1= scan.nextInt();

System.out.println ("Enter second number to be raised to the third power: ");
num2= scan.nextInt();

cube1 = Math.pow(num1, 3);
cube2 = Math.pow(num2, 3);

sum = cube1+cube2;

System.out.println("The sum of both cubed integers is:" + sum);








	}

}
