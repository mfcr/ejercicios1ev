package unidad3;
import java.util.Scanner;
import java.util.Random;


public class AdivinoNumero {
	/**Juego de adivinar n�meros. El usuario escoje un numero entre 1 y un numero superior que le preguntar� el
	 * ordenador al usuario. Posteriormente el ordenador ir� preguntando al usuario por n�meros y el usuario
	 * le indicar� al ordenador si el numero oculto es mayor, menor o si ha acertado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		boolean masJuegos=true;
		String txt;
		
		int superior,inferior=1,actual;
		
		do {
			System.out.println("Quiero jugar a adivinar n�meros, piensa un n�mero entre 1 y un m�ximo. Dime cual es el m�ximo o pulsa intro si no quieres jugar. ");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masJuegos=false;
				System.out.println("Hasta la vista.");
			} else {
				int intentos=0;
				superior=Integer.parseInt(txt);
				actual=(superior-inferior)/2+inferior;
				try {
					superior=Integer.parseInt(txt);
					boolean encontrado=false;
					while (!encontrado) {
						actual=(superior-inferior)/2+inferior;
						intentos++;
						System.out.print("Estoy pensando en el n�mero: "+actual+". Pulsa 1 si el numero que has pensado es mayor, 2 si es menor o 0 si he acertado: ");
						int opcion=teclado.nextInt();
						if (superior==inferior) {
							System.out.println("pillin, creo que est�s intentendo enga�arme. O el n�mero es es "+superior+" o me has enga�ado por el camino.\n");
							encontrado=false;
						} else {
							switch (opcion) {
								case 1:
									inferior=actual+1;
									break;
								case 2:
									superior=actual-1;
									break;
								case 0:
									System.out.println("Es que soy un hacha. Y en s�lo "+intentos+" intentos.\n\n");
									encontrado=true;
									break;
							}
						}
					}
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.\n");
				}
			}
			teclado.nextLine();
		} while (masJuegos);
	}
}
