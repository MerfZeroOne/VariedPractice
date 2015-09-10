import java.util.Scanner;
import java.text.DecimalFormat;
public class HeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double side1, side2, side3, p, area, formulaProduct ;		
		
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter the length of the first side of the triangle: ");
	side1 =scan.nextDouble();
	
	System.out.println("Enter the length of the second side of the triangle: ");
	side2= scan.nextDouble();
	System.out.println("Enter the length of the third side of the triangle: ");
	side3= scan.nextDouble();
	
	p = (side1+ side2+ side3);
	
	formulaProduct =  ((p - side1)*(p - side2)*(p - side3)*p) ;
	

	
	area = Math.sqrt(formulaProduct);
	
	DecimalFormat fmt = new DecimalFormat ("0.###"); 
	
	System.out.println("The area of the triangle is " +fmt.format(area));
	
	
	

	}

}
