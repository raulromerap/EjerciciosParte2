package ejerciciost1p3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		//Variable del primer numero
		int n1;
		
		//Variable del segundo numero
		int n2;
		
		//Variable del scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para insertar el primer número
		System.out.print("Introduce el primer número: ");
		
		n1 = sc.nextInt();
		
		//Mensaje para insertar el segundo número
		System.out.print("Introduce el segundo número: ");
		
		n2 = sc.nextInt();
		
		//Calculo de true o false
		boolean t = (n1 == n2);
		
		//Resultado T/F
		System.out.println(t);
		
		//Cierre del scanner
		sc.close();
		
	}

}
