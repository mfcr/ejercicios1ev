package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio4Ud4 {
	/**Simula que tira un dado N veces que le indicará el usuario
	 * y el ordenador calculará las veces que sale cada uno de los resultados
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		boolean masJuegos=true;
		String txt;
		do {
			System.out.println("Introduzca el número de veces que voy a tirar el dado o intro para salir: ");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masJuegos=false;
				System.out.println("Hasta la vista.");
			} else {
				try {
					int tiradas=Integer.parseInt(txt);
					Random rnd=new Random();
					int[] contTiradas= {0,0,0,0,0,0};
					for (int i=1;i<=tiradas;i++) {
						int estaTirada=rnd.nextInt(6)+1; //El 7 no es escogible por la fn.
						contTiradas[estaTirada-1]++;
					}
					for (int i=0;i<contTiradas.length;i++ ) {
						System.out.println("El "+(i+1)+" ha salido "+contTiradas[i]+" veces. Frecuencia relativa: "+String.format("%.2f",100*contTiradas[i]/(double)tiradas)+"%");
					}
					System.out.println();
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.\n");
					System.out.print(e);
				}			
			}
		} while (masJuegos);
	}
}
