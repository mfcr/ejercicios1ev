package unidad3;
import java.util.Scanner;

public class Bisiesto {
	/**
	 * Del año introducido por teclado nos dice si es o no bisiesto.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean masAnyos=true;
		String txt;
		do {
			System.out.println("Introduzca un Año o nada para salir:");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masAnyos=false;
			} else {
				try {
					String esBisiesto=" NO ";
					int anyo=Integer.parseInt(txt);
					if (anyo%4==0 && (!(anyo%100==0 && anyo%400!=0)))  { //Año multiplo de 4 y no es el caso de que sea multiplo de 100 y no lo sea de 400.
						esBisiesto=" SI ";
					}
					System.out.println("El año introducido"+esBisiesto+"es bisiesto.\n");
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.");
				}
			}
		} while (masAnyos);
	}


}
