package unidad4;
import java.util.Scanner;

public class Ejercicio1Ud4 {
	/**La clase pide una cadena de texto y cuenta las vocales
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		boolean seguir=true;
		do {
			System.out.print("Introduce la cadena de texto a procesar o nada para salir: ");
			String txt=teclado.nextLine();
			if (txt.length()==0) {
				seguir=false;
				System.out.println("\n\n Hasta la vista.");
			} else {
				String[] letrasAContar= {"a","e","i","o","u"};
				int[] contador= {0,0,0,0,0};
				for (int i=0;i<txt.length();i++) {
					String letra=txt.substring(i,i+1).toLowerCase();
					for (int j=0;j<letrasAContar.length;j++) {
						if (letrasAContar[j].equals(letra)) {contador[j]++;}
					}
				}
				for (int i=0;i<letrasAContar.length;i++) {
					System.out.println("La letra "+letrasAContar[i]+" ha aparecido "+contador[i]+" veces");
				}
				System.out.println("\n");
			}
		} while (seguir);
	}
}
