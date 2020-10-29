package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio7Ud4 {
	/**El usuario indica un numero entre 10 y 1.000.000 
	 * El ordenador rellenar� un array de numeros de ese tama�o con numero no repetidos entre el -999.999 y el 1.000.000
	 * y mostrar� el tiempo empleado en llenarlo, los numeros maximo y el m�nimo y su diferencia y el tiempo que llev� buscar los maximos y los minimos.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		
		int size=-1;
		while (size<10 || size>1000000) {
			System.out.print("Introduzca un n�mero entre 10 y 1.000.000 para rellenar el array: ");
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
			if (!found) { //El numero obtenido no esta en el array. lo a�adimos
				valores[relleno]=posibleValor;
				relleno++;
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("El array de "+size+" elementos distintos ya est� relleno. Se han tardado: "+String.format("%.3f",(end-start)/1000.0)+" segundos.");
		//CALCULAMOS EL MAXIMO Y EL MINIMO Y EL TIEMPO NECESARIO PARA BUSCARLOS. Se podr�a haber hecho mientras se rellenaba.
		int min=10000000, max=-10000000;
		start=System.currentTimeMillis();
		for (int i=0;i<size;i++) { //size o valores.length
			if (valores[i]>max) {max=valores[i];}
			if (valores[i]<min) {min=valores[i];}
		}
		end=System.currentTimeMillis();
		System.out.println("El numero m�nimo es "+min+", el m�ximo es "+max+". Su diferencia es "+(max-min)+
				" y se han tardado "+String.format("%.3f",(end-start)/1000.0)+" segundos en buscar.");
	}

}
