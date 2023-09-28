package ejerciciost1p3;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Variable de la base
		double base;
		
		//Variable de la altura
		double altura;
		
		//Varaible área
		double area;
		
		//Variable de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para insertar dato de base
		System.out.print("Introduzca el valor de la base del triangulo: ");
		
		//Scan de base
		base = sc.nextDouble();
		
		//Mensaje para insertar dato de altura
		System.out.print("Introduzca el valor de la altura del triangulo: ");
		
		//Scan de altura
		altura = sc.nextDouble();
		
		//Calculo dela area
		area = (base * altura) / 2;
		
		//Mensaje del resultado
		System.out.println("El área del triangulo es de: " + area);
		
		//Cierre de scan
		sc.close();
	}
}
