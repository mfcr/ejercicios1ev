package unidad3;
import java.util.Scanner;
import java.util.Random;


public class Dado {
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
					//int uno=0,dos=0,tres=0,cuatro=0,cinco=0,seis=0; //Con arrays y usando los resultados de las tiradas junto con los numeros de los índices sería más sencillo (evitamos switch).
					int[] contTiradas= {0,0,0,0,0,0};
					for (int i=1;i<=tiradas;i++) {
						int estaTirada=rnd.nextInt(6)+1; //El 7 no es escogible por la fn.
						contTiradas[estaTirada-1]++;
						/*switch (estaTirada) { //Se puede evitar la variable estaTirada si metemos rnd.nextInt(7) en el condicional de switch.
							case 1:
								uno++; break;
							case 2:
								dos++; break;
							case 3:
								tres++; break;
							case 4:
								cuatro++; break;
							case 5:
								cinco++; break;
							case 6:
								seis++; break;
						}*/
					}
					for (int i=0;i<contTiradas.length;i++ ) {
						System.out.println("El "+(i+1)+" ha salido "+contTiradas[i]+" veces.");
					}
					/*System.out.println("El 1 ha salido: "+uno+" veces");
					System.out.println("El 2 ha salido: "+dos+" veces");
					System.out.println("El 3 ha salido: "+tres+" veces");
					System.out.println("El 4 ha salido: "+cuatro+" veces");
					System.out.println("El 5 ha salido: "+cinco+" veces");
					System.out.println("El 6 ha salido: "+seis+" veces");*/
					System.out.println();
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.\n");
					System.out.println(e);
				}			
			}
		} while (masJuegos);

		
		
	}

}
