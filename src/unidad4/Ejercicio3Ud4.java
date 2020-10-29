package unidad4;
import java.util.Scanner;

public class Ejercicio3Ud4 {
	/**La clase pide una cadena de texto y una subcadena y cuenta las veces que la subcadena esta en la cadena.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		boolean seguir=true;
		do {
			System.out.print("Introduce la cadena de texto principal o nada para salir: ");
			String txt=teclado.nextLine();
			if (txt.length()==0) {
				seguir=false;
				System.out.println("\n\n Hasta la vista.");
			} else {
				System.out.print("Ahora introduce la subcadena a buscar en el texto anterior: ");
				String subTxt=teclado.nextLine();
				if (subTxt.length()>txt.length()) {
					System.out.println("Se ha equivocado, ha introducido una subcadena más grande que la cedena principal. Las intercambiamos y continuamos con el proceso");
					String aux=txt;
					txt=subTxt;
					subTxt=aux;
				}
				int contador=0;
				for (int i=0;i<=(txt.length()-subTxt.length());i++) {
					String subCadena=txt.substring(i,i+subTxt.length()).toLowerCase();
					if (subCadena.equals(subTxt)) {contador++;}
				}
				System.out.println("La subcadena "+subTxt+" ha aparecido "+contador+" veces en la cadena "+txt);
				System.out.println("\n");
			}
		} while (seguir);
	}
}
