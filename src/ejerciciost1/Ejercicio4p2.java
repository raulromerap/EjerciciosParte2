package ejerciciost1;
import java.util.Scanner;

public class Ejercicio4p2 {

	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		String lluvia;
		String deberes;
		String biblioteca;
		
		//Instrucciones
		System.out.print("¿Está lloviendo? \n- ");
		lluvia = sc.next();
		System.out.print("¿Has hecho los deberes? \n- ");
		deberes = sc.next();
		System.out.print("¿Tienes que ir a la biblioteca?");
		biblioteca = sc.next();
				
		String mensaje = ((!lluvia) == deberes) ? "Si puedes salir" : "No puedes salir";
		System.out.println(mensaje);
	}
}
