package ejerciciost1;
import java.util.Scanner;

public class Ejercicio4p2 {

	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		boolean lluvia;
		boolean deberes;
		boolean biblioteca;

		//Instrucciones
		System.out.print("¿Está lloviendo? \n- ");
		lluvia = sc.nextBoolean();
		System.out.print("¿Has hecho los deberes? \n- ");
		deberes = sc.nextBoolean();
		System.out.print("¿Tienes que ir a la biblioteca? \n-");
		biblioteca = sc.nextBoolean();
		
		//Ternario para saber si puede salir
		String mensaje = biblioteca || (!lluvia&&deberes) ? "Si puedes salir" : "No puedes salir";
		//Impresion en pantalla del mensaje
		System.out.println(mensaje);
		
		//Cierre de Scanner
		sc.close();
	}
}
