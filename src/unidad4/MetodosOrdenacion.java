package unidad4;

public class MetodosOrdenacion {

	public static void main(String[] args) {
		int [] array={1,3,2,67,23,0,234,432,33,12,25,-1,78};
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
		
		array=OrdenacionInsercionDirecta(array);
		System.out.println();
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
		
		int [] array2= {1,3,2,67,23,0,234,432,33,12,25,-1,78};
		array2=OrdenacionSeleccionDirecta(array2);
		System.out.println();
		for (int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+", ");
		}

		int [] array3={1,3,2,67,23,0,234,432,33,12,25,-1,78};
		array3=OrdenacionIntercambiodirecto(array3);
		System.out.println();
		for (int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+", ");
		}
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
	/**Busca el elemento más bajo en el intervalo i a n (longitud), se coloca en la posicion i
	 * y finalmente el puntero avanza una posición.
	 */
	public static int[] OrdenacionSeleccionDirecta (int[] array) {
		for (int i=0;i<array.length;i++) {
			int min=1000000000,minpos=0;
			for (int j=i;j<array.length;j++) {
				if (array[j]<min) {
					min=array[j]; 
					minpos=j;
				}
			}
			array[minpos]=array[i];
			array[i]=min;
		}
		
		return(array);
	}
	/**Comparamos dos a dos los elementos y los vamos cambiando. En cada pasada quedará el elemnto más paqueño en la posicion 0. 
	 * 	El puntero irá avanzando de 1 en 1 de modo que al llegar al final todo wl array está ordenado.
	 */
	public static int[] OrdenacionIntercambiodirecto (int[] array) {
		for (int i=0;i<array.length;i++) {
			int cambiosEstaIteracion=0;
			for (int j=(array.length-1);j>i;j--) {
				if (array[j]<array[j-1]) {
					int aux=array[j];
					array[j]=array[j-1];
					array[j-1]=aux;
					cambiosEstaIteracion++;
				}
			}
			if (cambiosEstaIteracion==0) {break;} //Si no ha habido ningún cambio es que ya está ordenada.
		}
		return(array);
	}
	
}
