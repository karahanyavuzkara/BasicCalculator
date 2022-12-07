package patika;
import java.util.Scanner;
public class BasicCalculator {

public static void main(String []args) {
	
	System.out.print("Write the first number : ");
	Scanner firstput = new Scanner(System.in);
    
	int select;//////////////////////////////
	int number1, number2;
	number1 = firstput.nextInt();
	
    System.out.print("Write the second number : ");
    
    number2 = firstput.nextInt();
    
    System.out.println("1-Add\n2-Extraction\n3-Divide\n4-Multiple\n");
    System.out.print("Seçiminiz : ");
    select = firstput.nextInt();
    
    if (select == 1) {
    	System.out.println( number1 + number2 );
    	
    }
    else if (select == 2) {
    	System.out.println( number1 - number2 ); 
    }
    else if (select == 3) {
    	System.out.println( number1 / number2 );
    
    }
    else if (select == 4) {
    	System.out.println ( number1 * number2 );
    	
    }
}
}
