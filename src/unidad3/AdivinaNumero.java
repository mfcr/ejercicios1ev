package unidad3;
import java.util.Scanner;
import java.util.Random;


public class AdivinaNumero {
	/**Juego de adivinar números. El ordenador escoge un numero entre el 1 y el N (N entre 1.000 y 100.000)
	 * iterativamente le pregunta al usuario que adivine el numero y, en caso de no adivinarlo le diga si
	 * el numero oculto es mayor o menor al dicho.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		boolean masJuegos=true;
		String txt;
		
		Random rnd=new Random();
		int limiteMaximo=rnd.nextInt(99000)+1000; //numero entero entre 1000 y 100000
		int numeroOculto=rnd.nextInt(limiteMaximo); //Numero entero entre 1 y limiteMaximo. 

		do {
			System.out.println("Comienza el juego, He pensado un numero entre el 1 y el "+limiteMaximo+":");
			int num=-1;
			int intentos=0;
			while (num!=numeroOculto && masJuegos) {
				System.out.print("Introduzca un número o nada para salir: ");
				txt=teclado.nextLine().trim();
				if (txt.length()==0) {
					masJuegos=false;
					System.out.println("Hasta la vista.");
				} else {
					try {
						num=Integer.parseInt(txt);
						intentos++;
						if (num>numeroOculto) {
							System.out.print("    El numero oculto es menor que "+num+".\n");
						} else {
							if (num<numeroOculto) {
								System.out.print("     El numero oculto es mayor que "+num+".\n");
							} else {
								System.out.println("Enhorabuena, lo ha conseguido en solo "+intentos+" intentos.\n");
							}
						}
					} catch (Exception e)  { //Clase padre de todas las excepciones.
						System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.\n");
					}
				}
			
			}
		} while (masJuegos);
	}
}
