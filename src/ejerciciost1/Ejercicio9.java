package ejerciciost1;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Constantes
		final int CONVERSION = 166;
		
		//Variables
		Scanner sc = new Scanner(System.in);
		double euro;
		double peseta;
		
		//Desarrollo
		System.out.print("Introduzca la cantidad de pesetas que quieras convertir: ");
		peseta = sc.nextDouble();
		euro = peseta / CONVERSION;
		System.out.println(peseta + " pesetas son: " + euro + " euros");
		
		//Cierre de scanner
		sc.close();
	}
}
