package ejerciciost1;
import java.util.Scanner;

public class Ejercicio3p2 {

	public static void main(String[] args) {

		//Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		//Introduccion
		System.out.print("Introduzca un número: ");
		numero = sc.nextInt();
		
		String mensaje = (numero % 2 == 0) ? "El número es par" : "El número es impar";
		System.out.println(mensaje);
		sc.close();
	}

}
