package Excepciones;
import java.util.*;

public class OtroEjemploExcepciones {

	static Scanner es=new Scanner(System.in);

	public static void main(String[] args) {
	
		int x=LeerEntero();
		
	}//Fin del main
	
	//Metodo Que lea un Entero
	
	private static int LeerEntero() {
		
		System.out.println("Ingrese un Numero Entero");
		while (!es.hasNextInt()) {
			es.next();
			System.out.println("Digite nuevamente");
		}
		int x=es.nextInt();
		return x;
	}
}
