package ejerciciost1;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		String Nombre;
		String Dirección;
		String Telefono;
		
		//Desarrollo
		System.out.println("Escriba su nombre:");
		Nombre = sc.nextLine();
		System.out.println("Ahora escriba su dirección:");
		Dirección = sc.nextLine();
		System.out.println("Y por último, su número de teléfono");
		Telefono = sc.nextLine();
		
		System.out.println("Nombre: " + Nombre);
		System.out.println("Dirección: " + Dirección);
		System.out.println("Teléfono: " + Telefono);
		
		//Cierre
		sc.close();
	}

}
