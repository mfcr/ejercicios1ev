package unidad4;
import java.util.Scanner;

public class Ejercicio14Ud4 {
	/**
	 * Solicita al usuario un n�mero para crear un array de secuencias.
	 * Posteriormente el usuario introducir� una a una las secuencias a guardar.
	 * Se trata de crear un array "jagged" con diferente n�mero de columnas
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.print("Introduzca El n�mero de secuencias a crear: ");
		int numSecuencias=teclado.nextInt();

		int[][] secuencias = new int[numSecuencias][]; //Definimos array bidimensional de secuencias y asignamos la 1� dimension
		 
		for (int i=0; i<numSecuencias; i++) {
			//Pedimos la secuencia al usuario
			System.out.print("Introduzca la longitud de la secuencia numero "+(i+1)+": ");
			int longSec=teclado.nextInt();
			teclado.nextLine();
			System.out.print("Introduzca la secuencia separando los n�meros con espacios: ");
			String estaSecuencia=teclado.nextLine()+" "; //Le ponemos un espacio al final para que luego lo encuentre al rellenar el array.
			//Definimos el tama�o de la segunda diemnsion del array en la posicion i de la 1� dimensi�n.
			secuencias[i]=new int[longSec];
			for (int j=0;j<longSec;j++) {
				//Procesamos la secuencia introducida. Si no hubbiesemos puesto el espacio habr�a que hacer bucle una vuelta menos
				//   y fuera del bucle asignar el ultimo elemento o if (posFin==-1) { secuencias[i][j]=estaSecuencia; break; }
				int posFin=estaSecuencia.indexOf(" ");
				secuencias[i][j]=Integer.parseInt(estaSecuencia.substring(0,posFin));
				estaSecuencia=estaSecuencia.substring(posFin+1);
				//No se est� controlando que usuario meta bien los datos. Tipo datos correcto y numero de elementos en la secuencia.
			}
		}
	}
}
