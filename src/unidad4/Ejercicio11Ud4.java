package unidad4;
import java.util.Scanner;

public class Ejercicio11Ud4 {
	/**
	 * Pide al usuario 10 nombres que pasará a la funcion CadenaMasGrande
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String[] nombres=new String[10];
		
		for (int i=0;i<nombres.length;i++) {
			System.out.print("Introduzca el nombre de la posición "+(i+1)+": ");
			nombres[i]=teclado.nextLine();
		}
		System.out.println("\n \n El nombre más largo introducido es el de: "+CadenaMasGrande(nombres));
	}
	/**
	 * Busca la cadena más grande dentro de las que se han enviado a la función y la devuelve.
	 * @param cadenas
	 * @return String Cadena más larga de las que se han enviado a la función.
	 */
	public static String CadenaMasGrande(String[] cadenas) {
		int tamGrande=0, posGrande=0; 
		for (int i=0;i<cadenas.length;i++) {
			if (cadenas[i].length()>tamGrande) {tamGrande=cadenas[i].length(); posGrande=i; }
		}
		return(cadenas[posGrande]);
	}

}
