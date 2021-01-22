import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor do raio do circulo [m]:");
		double r = sc.nextDouble();
		
		double s = 3.14159 * Math.pow(r, 2);
		System.out.printf("Area = %.4f%n", s);
		
		sc.close();
	}

}
