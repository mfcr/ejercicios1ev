package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio8Ud4 {
	/**El usuario indica un numero entre 10 y 200 
	 * El ordenador rellenará un array de numeros de ese tamaño con numeros entre el -100 y el 100
	 * Sumara los valores evitando el numero 13 y los siguientes 13 valores (solo si no suman 7 en cuyo caso si se suman).
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		
		int size=-1;
		while (size<10 || size>200) {
			System.out.print("Introduzca un número entre 10 y 200 para rellenar el array: ");
			try {
				size=Integer.parseInt(teclado.nextLine().trim());
			} catch (Exception e) {
				System.out.println("Error introduzca un valor valido");
			}
		}
		int[] valores=new int[size];
		for (int i=0;i<size;i++) { //Esta vez no pide valores distintos.
			valores[i]=rnd.nextInt(201)-100;
		}
		//Suma de los numeros del array.
		int suma=0, contAux=0, sumaAux=0;
		String msg="El array contiene: ";
		String msgEliminados="";
		String msgAux="";
		for (int i=0;i<size;i++) {
			if (valores[i]==13) {
				contAux=14; //este y los siguientes 13.
			} 
			if (contAux>0) {
				sumaAux+=valores[i];
				msgAux+=valores[i]+", ";		
				contAux--;
				if (contAux==0) {
					if (sumaAux==7) { //En este caso si se tienen en cuenta.
						suma+=sumaAux;
					} else { // se descartan estos valores.
						msgEliminados+=msgAux+ "(Suman:"+sumaAux+"). ";
					}
					sumaAux=0; //Reiniciamos valores.
					msgAux="";
				}
			} else {
				suma+=valores[i];
			}
			msg+=valores[i]+", ";
			
		}
		System.out.println(msg);
		if (msgEliminados.equals("")) {
			System.out.println("No se ha eliminado ningun valor al sumar. No esta el numero 13 en la lista.");
		} else {
			System.out.println("Los elementos no sumados son: "+msgEliminados);
		}
		System.out.println("La suma de los numeros es :"+suma);
	}

}
