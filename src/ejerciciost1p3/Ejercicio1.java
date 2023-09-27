package ejerciciost1p3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {
		
		//Variable del numero con decimales
		double numeroDeci = 0;
		//Variable numero que se muestra
		double numeroTotal = numeroDeci + 0;
		//Variable del scanner
		Scanner sc = new Scanner(System.in);
		
		//Petición del número con decimales al usuario
		System.out.print("Introduuzca un múmero con decimales: ");
		//Escaneo del numero del usuario
		numeroDeci = sc.nextDouble();
		//Redondeo del numero
		String resultado = ((numeroTotal - numeroDeci) >= .5) ? "El resultado es " + (int) numeroDeci + 1 : "El resultado es " + (int) numeroDeci;
		System.out.println(resultado);
	}
}
