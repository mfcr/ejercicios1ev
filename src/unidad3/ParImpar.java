package unidad3;
import java.util.Scanner;

public class ParImpar {
	/**
	 * Nos dice si un numero introducido es par o impar
	 */	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean masNumeros=true;
		int numero;
		String txt;
		do {
			System.out.print("Introduzca un numero para decir si es par o impar o nada para salir:");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masNumeros=false;
			} else {
				try {
					numero=Integer.parseInt(txt);
					if (numero%2==0) {
						System.out.println("El número introducido es PAR");
					} else {
						System.out.println("El número introducido es IMPAR");
					}
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.");
				}
			}
		} while (masNumeros);
	}

}
