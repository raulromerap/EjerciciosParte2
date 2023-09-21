package ejerciciost1;
import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		double euro = 0.006;
		double peseta;
		double conversion;
		
		//Desarrollo
		System.out.print("Introduzca la cantidad de pesetas que quieras convertir: ");
		peseta = sc.nextDouble();
		conversion = peseta * euro ;
		System.out.println(peseta + " pesetas son: " + conversion + " euros");
		
		//Cierre de scanner
		sc.close();
	}
}
