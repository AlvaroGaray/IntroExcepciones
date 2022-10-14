package Excepciones;
import java.util.*;
public class IntroExcepciones {

	public static void main(String[] args) {

		Scanner es=new Scanner(System.in);
		
		//Dividir 2 numeros
		
		double x=48; double y=0;
		DividirSinExcepciones(x,y);
		DividirConExcepciones(x,y);
	}//fin del main
	
	private static double DividirSinExcepciones(double x, double y) {
		
		if(y!=0) {
			return x/y;
		}else {
			return 0;
		}
	}
	
	private static double DividirConExcepciones(double x, double y) {
		
		try {
			return x/y;
		} catch(ArithmeticException ex) {
			return 0;
		}
	}
	
	private static double Dividir(double x, double y) {
		
		return x/y;
		
		
	}

}
