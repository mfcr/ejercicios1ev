package unidad3;
import java.util.Scanner;

public class TrianguloFloyd {
	/**El ordenador pide el numero de filas a mostrar del triangulo floyd. 
	 * el triangulo floyd muestra numeros naturales seguidos y en tantas filas como ha pedido el usuario.
	 * Ejemplo si usuario dice 4:
	 * 1
	 * 2  3
	 * 4  5  6
	 * 7  8  9 10
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		boolean masFloyd=true;
		String txt;
		do {
			System.out.println("Voy a mostrarte triangulos de FLoyd. Dime cual es el máximo de líneas a ver o pulsa intro si no quieres jugar. ");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masFloyd=false;
				System.out.println("Hasta la vista.");
			} else {
				try {
					int filas=Integer.parseInt(txt);
					int contador=1;
					for (int i=1;i<=filas;i++) {
						String mensaje="";
						for (int j=1;j<=i;j++) {
							mensaje+=contador+" "; //Tb se puede poner como +((contador<100)?" ":"")+((contador<10)?" ":"")
							if (contador<10) {mensaje+=" ";}
							if (contador<100) {mensaje+=" ";}
							contador++;
						}
						System.out.println(mensaje);
					}
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.\n");
				}			
			}
		} while (masFloyd);
		
	}

}
