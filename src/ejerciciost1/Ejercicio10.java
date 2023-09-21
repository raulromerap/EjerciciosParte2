package ejerciciost1;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		double iva = 21;
		double precio;
		double precioreal;
		double subida;
		
		//Desarrollo
		System.out.print("Introduzca un precio: ");
		precio = sc.nextDouble();
		subida = (precio * iva) / 100;
		precioreal = precio + subida;
		System.out.println("El precio con el IVA sería de " + precioreal);
		
		//Cierre de scanner
		sc.close();
	}
}
