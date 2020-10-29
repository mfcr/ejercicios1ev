package unidad4;
import java.util.Scanner;

public class Ejercicio5Ud4 {
	/**El usuario introduce un dni y una letra.
	 * el ordenador comprobara que la letra introducida es correcta
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		boolean seguir=true;
		String nif;
		String[] arrayLetras= {"t","r","w","a","g","m","y","f","p","d","x","b","n","j","z","s","q","v","h","l","c","k","e"};
		do {
			System.out.println("Introduzca el NIF completo numero y letra sin espacios puntos ni guiones o intro para salir: ");
			//Lo de los espacios, puntos o guines se puede solucionar haciendo un recorrido letra a letra y reconstruyendo la cadena introducida.
			nif=teclado.nextLine();
			if (nif.equals("")) {
				seguir=false;
				System.out.println("\n\n Hasta la vista.");
			} else {
				try {
					int numero=Integer.parseInt(nif.substring(0,nif.length()-1));
					String letra=nif.substring(nif.length()-1).toLowerCase();
					int resto=numero%23;
					if (arrayLetras[resto].equals(letra)) {
						System.out.println("El NIF es correcto.");
					} else {
						System.out.println("La letra no coincide con el número, para el número "+numero+" la letra correspondiente es la "+arrayLetras[resto]+" en lugar de la "+letra);
					}
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido. Error: "+e+"\n");
				}			
			}
		} while (seguir);
	}
}
