package unidad4;
import java.util.Random;

public class Ejercicio17Ud4 {

	public static void main(String[] args) {
		Random rnd=new Random();
		int[] array1=new int[rnd.nextInt(91)+10];
		int[] array2=new int[rnd.nextInt(91)+10];
		//Rellenamos arrays
		for (int i=0;i<array1.length;i++) {
			array1[i]=rnd.nextInt(1001)-500; //Lo limito a -500 a 500 para mejor visualizacion 
		}
		for (int i=0;i<array2.length;i++) {
			array2[i]=rnd.nextInt(1001)-500; //Lo limito a -500 a 500 para mejor visualizacion 
		}
		//Usamos el método de ordenamiento de inserción directa creado en el ejercicio anterior.
		array1=OrdenacionInsercionDirecta(array1);
		array2=OrdenacionInsercionDirecta(array2);
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+", "); 
		}
		System.out.println();
		for (int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+", "); 
		}
		System.out.println();

		
		//Juntamos los dos array en uno y mostramos los 3 arrays.
		int[] array3=new int[array1.length+array2.length];
		int pos1=0,pos2=0;
		for (int i=0;i<array3.length;i++) {
			if (pos1==array1.length) {
				array3[i]=array2[pos2];
				pos2++;
			} else if (pos2==array2.length) {
				array3[i]=array1[pos1];
				pos1++;
			} else if (array1[pos1]<=array2[pos2]) {
				array3[i]=array1[pos1];
				pos1++;
			} else {
				array3[i]=array2[pos2];
				pos2++;
			}
		}
		for (int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+", "); 
		}
		System.out.println();

		
		
	}
	/**Este algoritmo va avanzando el puntero una posición cada vez, cada nuevo elemento se va
	 * comparando con los anteriores al puntero y si son menores se les va bajando de posición hasta
	 * que encontremos que el elemento en la psoicion -1 es menor que el elemnto a ordenar.
	 */
	public static int[] OrdenacionInsercionDirecta (int[] array) {
		for (int i=0;i<array.length;i++) {
			for (int j=i;j>0;j--) {
				if (array[j]<array[j-1]) {
					int aux=array[j];
					array[j]=array[j-1];
					array[j-1]=aux;
				} else {
					break;
				}
			}
		}
		return(array);
	}
	
}
