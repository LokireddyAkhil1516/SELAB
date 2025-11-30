package Exam.BD1A0546;
import java.util.*;
/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				double a, b, result = 0;
				char op;
				System.out.print("Enter first number: ");
				a = sc. nextDouble();
				System.out.print("Enter operator (+, -, *, /): ");
				op = sc.next(). charAt(0);
				System.out.print("Enter second number: ");
				b = sc. nextDouble();
				switch (op) {
				case '+': result = a + b; break;
				case '-': result = a - b; break;
				case '*': result = a * b; break;
				case '/': result = b != 0 ? a / b : Double.NaN; break;
				default: System.out.println("Invalid operator");
	}
	System.out.println("Result: " + result);
	}
}
