package unidad4;
import java.util.*;

public class Ejercicio12Ud4 {
	/**
	 * Pide al usuario un numero indeterminado de números para meter en un vector que pasará
	 * al método centro para saber si el vector tiene o no centro.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] numeros=new int[100];
		//NOTA:Usando ArrayList no hay que limitar el tamaño del array ya que el solo va controlando el tamaño y espacio.
		//List<Integer> numeros = new ArrayList<Integer>(); @@ ArrayList y List estan en paquete java.util
		//numeros.add(27);
		//numeros.size() <--devuelve num elementos. numeros.get(2) <--devuelve el valor en la posicion 2.
		int cont=0;
		boolean continuar=true;
		System.out.println("Introduzca números para rellenar el vector (max 100). Cuando quiera terminar introduzca intro.");
		do {
			String txt=teclado.nextLine();
			try {
				if (txt.equals("")) {
					continuar=false;
				} else {
					numeros[cont]=Integer.parseInt(txt);
					cont++;
				}
			} catch (Exception e) {
				System.out.print("Error al introducir los datos, error: "+e);
			}
		} while(continuar);
		//Nota: esto que hacemos al final, se podría hacer cada vez que se añade un nuevo elemento evitando así
		//   el tamaño maximo inicial del array. (lleva más procesamiento).
		int[] numerosDefinitivos=Arrays.copyOf(numeros,cont);
		
		//int no puede ser null pero Integer si.
		Integer centro=centro(numerosDefinitivos); 
		System.out.println("\n \n El centro del vector enviado es: "+((centro==null)?"no tiene":centro));
	}
	/**
	 * Busca la cadena más grande dentro de las que se han enviado a la función y la devuelve.
	 * @param cadenas
	 * @return String Cadena más larga de las que se han enviado a la función.
	 */
	public static Integer centro(int[] numeros) { //Devuelve Integer en lugar de int porque int no puede ser null.
		int centro=-1;
		for (int c=0;c<numeros.length;c++) {
			int suma1=0,suma2=0;
			for (int i=0;i<=(c-1);i++) {
				suma1+=(c-i)*numeros[i];
			}
			for (int j=(c+1);j<numeros.length;j++) {
				suma2+=(j-c)*numeros[j];
			}
			if (suma1==suma2) {centro=c; break;}
		}
		return((centro>-1)?centro:null);
	}
}
