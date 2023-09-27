package ejerciciost1;

import java.util.Scanner;

public class Ejercicio5p2 {

	public static void main(String[] args) {
		
		//Variables
		int nota1, nota2, nota3;
		double notaMediaEx;
		
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.print("Introduzca la nota del primer trimestre: ");
		nota1 = sc.nextInt();
		System.out.print("Introduzca la nota del segundo trimestre: ");
		nota2 = sc.nextInt();
		System.out.print("Introduzca la nota del tercer trimestre: ");
		nota3 = sc.nextInt();
		
		notaMediaEx = (nota1 + nota2 + nota3) / 3;
		int notaMediaAl = (int) notaMediaEx;
		
		System.out.println("La nota del boletín es: " + notaMediaAl);
		System.out.println("La nota del expediente es: " + notaMediaEx);
		
		sc.close();
	}
}
