package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio7Ud4 {
	/**El usuario indica un numero entre 10 y 1.000.000 
	 * El ordenador rellenará un array de numeros de ese tamaño con numero no repetidos entre el -999.999 y el 1.000.000
	 * y mostrará el tiempo empleado en llenarlo, los numeros maximo y el mínimo y su diferencia y el tiempo que llevó buscar los maximos y los minimos.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		
		int size=-1;
		while (size<10 || size>1000000) {
			System.out.print("Introduzca un número entre 10 y 1.000.000 para rellenar el array: ");
			try {
				size=Integer.parseInt(teclado.nextLine().trim());
			} catch (Exception e) {
				System.out.println("Error introduzca un valor valido");
			}
		}
		int[] valores=new int[size];
		int relleno=0;
		long start=System.currentTimeMillis();
		while (relleno<size) {
			int posibleValor=rnd.nextInt(2000000)-999999; //entre -999999 y 1000000
			boolean found=false;
			for (int i=0;i<=relleno;i++) {
				if (valores[i]==posibleValor) {found=true; break;}
			}
			if (!found) { //El numero obtenido no esta en el array. lo añadimos
				valores[relleno]=posibleValor;
				relleno++;
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("El array de "+size+" elementos distintos ya está relleno. Se han tardado: "+String.format("%.3f",(end-start)/1000.0)+" segundos.");
		//CALCULAMOS EL MAXIMO Y EL MINIMO Y EL TIEMPO NECESARIO PARA BUSCARLOS. Se podría haber hecho mientras se rellenaba.
		int min=10000000, max=-10000000;
		start=System.currentTimeMillis();
		for (int i=0;i<size;i++) { //size o valores.length
			if (valores[i]>max) {max=valores[i];}
			if (valores[i]<min) {min=valores[i];}
		}
		end=System.currentTimeMillis();
		System.out.println("El numero mínimo es "+min+", el máximo es "+max+". Su diferencia es "+(max-min)+
				" y se han tardado "+String.format("%.3f",(end-start)/1000.0)+" segundos en buscar.");
	}

}
