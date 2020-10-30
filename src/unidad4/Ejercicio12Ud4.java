package unidad4;
import java.util.*;

public class Ejercicio12Ud4 {
	/**
	 * Pide al usuario un numero indeterminado de n�meros para meter en un vector que pasar�
	 * al m�todo centro para saber si el vector tiene o no centro.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] numeros=new int[100];
		//NOTA:Usando ArrayList no hay que limitar el tama�o del array ya que el solo va controlando el tama�o y espacio.
		//List<Integer> numeros = new ArrayList<Integer>(); @@ ArrayList y List estan en paquete java.util
		//numeros.add(27);
		//numeros.size() <--devuelve num elementos. numeros.get(2) <--devuelve el valor en la posicion 2.
		int cont=0;
		boolean continuar=true;
		System.out.println("Introduzca n�meros para rellenar el vector (max 100). Cuando quiera terminar introduzca intro.");
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
		//Nota: esto que hacemos al final, se podr�a hacer cada vez que se a�ade un nuevo elemento evitando as�
		//   el tama�o maximo inicial del array. (lleva m�s procesamiento).
		int[] numerosDefinitivos=Arrays.copyOf(numeros,cont);
		
		//int no puede ser null pero Integer si.
		Integer centro=centro(numerosDefinitivos); 
		System.out.println("\n \n El centro del vector enviado es: "+((centro==null)?"no tiene":centro));
	}
	/**
	 * Busca la cadena m�s grande dentro de las que se han enviado a la funci�n y la devuelve.
	 * @param cadenas
	 * @return String Cadena m�s larga de las que se han enviado a la funci�n.
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
