package ejerciciost1;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		//Desarrollo
		System.out.print("Introduzca su nombre: ");
		name = sc.nextLine();
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");
	
		//Cierre de scanner
		sc.close();
		
	}
}
