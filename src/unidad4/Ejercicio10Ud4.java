package unidad4;
import java.util.Scanner;
import java.util.Random;



public class Ejercicio10Ud4 {
	/**El usuario indica un numero entre 10 y 20 
	 * El ordenador rellenará un array de numeros de ese tamaño con numeros aleatorios
	 * Sumara los valores evitando el numero 13 y los siguientes 13 valores (solo si no suman 7 en cuyo caso si se suman).
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		
		int size=-1;
		while (size<10 || size>20) {
			System.out.print("Introduzca un número entre 10 y 20 para rellenar el array: ");
			try {
				size=Integer.parseInt(teclado.nextLine().trim());
			} catch (Exception e) {
				System.out.println("Error introduzca un valor valido");
			}
		}
		int[] valores=new int[size];
		for (int i=0;i<size;i++) { //Esta vez no pide valores distintos ni limites entre los valores válidos.
			valores[i]=rnd.nextInt();
		}
		//En lugar de inicializar diff así se podría haber inicializado a 2 veces el valor maximo del tipo de dato integer 2*10^9--> 4*10^9.
		long diff=Math.abs(valores[1]-valores[0]);
		int dif1=valores[1], dif2=valores[0];
		for (int i=2;i<size;i++) {
			if (Math.abs(valores[i]-valores[i-1])<diff) {diff=Math.abs(valores[i]-valores[i-1]); dif1=valores[i]; dif2=valores[i-1];}
		}
		System.out.println("La diferencia mínima es de "+diff+ " que se corresponde con los valores "+dif1+" y "+dif2);
	}

}
