package unidad4;
import java.util.Scanner;

public class Ejercicio2Ud4 {
	/**La clase pide una cadena de texto y la devuelve invertida
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
				String reverseTxt="";
				for (int i=txt.length();i>0;i--) {
					reverseTxt+=txt.substring(i-1,i);
				}
				System.out.println(reverseTxt+"\n");
			}
		} while (seguir);
	}
}
