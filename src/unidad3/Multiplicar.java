package unidad3;
import java.util.Scanner;



public class Multiplicar {
	/**
	 * Pide un numero del 1 al 10 para luego preguntar la tabla de multiplicar al usuario.
	 * LLeva la cuenta de los errores realizados por el usuario en cada tabla y si ha aprobado o no.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean masTablas=true;
		String txt;
		do {
			System.out.println("Introduzca una tabla o nada para salir:");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masTablas=false;
				System.out.println("Hasta la vista.");
			} else {
				try {
					int errores=0;
					int tabla=Integer.parseInt(txt);
					if (tabla>0 && tabla<10) { //Control del numero introducido sea conforme a las normas del ejercicio (tablas del 1 al 9).
						for (int i=1;i<=10;i++) {
							System.out.println("Introduzca el resultado de "+tabla+" X "+i);
							int mult=teclado.nextInt();
							if (mult!=tabla*i) { 
								errores++;
								System.out.println("Error: "+tabla+" X "+i+" = "+tabla*i);
							} else {
								System.out.println("Correcto");
							}
						}
						System.out.println("Tabla finalizada. Nota obtenida: "+((errores>=2)?"SUSPENSO":"APROBADO")+". Errores totales: "+errores+"\n");
					}
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.");
				}
			}
			teclado.nextLine();
		} while (masTablas);
	}

}
