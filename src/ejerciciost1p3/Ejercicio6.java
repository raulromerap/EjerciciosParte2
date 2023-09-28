package ejerciciost1p3;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Variable segundos del usuario
		int s;
		
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para insertar segundos
		System.out.print("Introduzca los segundos que quieres convertir: ");
		
		//Scan de los segundos
		s = sc.nextInt();
		
		//Variable y calculo de los minutos
		int m = (s >= 60) ? (s%3600)/60 : 0 ;
		
		//Variable y calculo de las horas
		int h = (s >= 60) ? (s/3600) : 0 ;
		
		//Variable y calculo de los segundos restantes
		int x = s % 60;
		
		//Mensaje final de la conversion
		System.out.println(s + " segundos son: " + h + " horas " + m + " minutos " + x + " segundos");
		
		//Cierre del Scanner
		sc.close();
		
	}
}
