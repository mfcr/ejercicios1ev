package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio9Ud4 {
	/**El ordenador obtiene un num aleatorio entre 10 y 500 y rellena un array de ese num de elementos con valores entre -100 y 100
	 * Mostrara el contenido del array si este tiene como máximo 50 elementos.
	 * Mostrará las secuancias de numero repetidos consecutivos.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();

		int size=rnd.nextInt(191)+10;
		int[] valores=new int[size];

		for (int i=0;i<size;i++) { //Esta vez no pide valores distintos.
			valores[i]=rnd.nextInt(201)-100;
		}
		//Mostramos el array si es menor de 50 elementos y mostramos las secuencias repetidas.
		String msg="", msgRepetidos="";
		int last=-2000, numRepeticion=1;
		for (int i=0;i<size;i++) { //Esta vez no pide valores distintos.
			if (size<50) {msg+=valores[i]+", ";}
			if (last==valores[i]) {
				numRepeticion++;
			} else {
				if (numRepeticion>1) {msgRepetidos+=" Numero "+last+" ("+numRepeticion+" veces), "; numRepeticion=1;}
			}
			last=valores[i];
		}
		if (msg.equals("")) {
			System.out.println("No se muestra el array ya que tiene "+size+" elementos y el maximo es 50.");
		} else {
			System.out.println("Los elementos del array son: "+msg);
		}
		if (msgRepetidos.equals("")) {
			System.out.println("No hay elementos repetido consecutivos en el array.");
		} else {
			System.out.println("Los elementos del array repetidos consecutivos (y las repeticiones de cada uno son) son: "+msgRepetidos);
		}
		
	}

}
