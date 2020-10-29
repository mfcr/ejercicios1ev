package unidad3;
import java.util.Scanner;

public class Triangulo {
	/**
	 * Pide 3 longitudes y devuleve si pueden ser o no lados de un triangulo y dew que tipo es en caso afirmativo.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean masTriangulos=true;
		int lado1,lado2,lado3;
		String txt;
		do {
			System.out.println("Introduzca un lado o nada para salir:");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masTriangulos=false;
				System.out.println("Hasta la vista \n");
			} else {
				try {
					//NOTA: se podr�a mejorar ya que ahora si hay un error en cualquir dato introducido comienza de nuevo a pedirlos todos.
					lado1=Integer.parseInt(txt);
					System.out.println("Introduzca el segundo lado:");
					lado2=teclado.nextInt();
					System.out.println("Introduzca el tercer lado:");
					lado3=teclado.nextInt();
					//Primera comprobaci�n, que pueda formar un tri�ngulo. Para ello la suma de cada dos lados tiene que ser mayor que la del tercero.
					if (lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1) {
						//Puede formar un tri�ngulo.
						//equilatero==todos los lados iguales. 
						if (lado1==lado2 || lado2==lado3 || lado1==lado3) { //Al menos hay dos iguales.
							if (lado1==lado2 && lado1==lado3) {
								System.out.println("El tri�ngulo introducido es equil�tero ya que todos sus lados son iguales.");
							} else {
								System.out.println("El tri�ngulo introducido es is�sceles ya que 2 de sus lados son iguales.");
							}
						} else {
							System.out.println("El tri�ngulo introducido es escaleno ya que sus lados son todos distintos.");
						}
					} else {
						System.out.println("Los lados introducidos no pueden formar un tri�ngulo.");
					}
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.");
				}
			}
			teclado.nextLine(); //consume un intro para Evitar problema que habia porque no esperaba a introducir las horas en 2� vueltas.
			//Esto es porque nextInt no consume el intro ??. Si fuesen todo nextline no habria problema como en el caso de Bisiesto.
			System.out.println(); //Linea en blanco
		} while (masTriangulos);
	}
}
