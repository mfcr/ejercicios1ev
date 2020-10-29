package unidad2;
import java.util.Scanner;


public class ColoresDeRGBaYIQ {

	/**
	 * Calcula un color en formato YIQ desde
	 * un color en formato RGB
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int r,g,b;
		double y,i,q;
		//Habria que meter en un bucle la solicitud de los datos de modo que una vez introducidos
		//   se controlase que son correctos, es decir, que sean enteros y esten entre 0 y 255.
		System.out.print("Introduzca el componente ROJO:");
		r=teclado.nextInt();
		
		System.out.print("Introduzca el componente VERDE:");
		g=teclado.nextInt();

		System.out.print("Introduzca el componente AZUL:");
		b=teclado.nextInt();
		
		System.out.println("\n----------------------------------------\n");
		//No se esta controlando que el resultado no sea negativo.
		//  tampoco se si puede darse un componente negativo de color.
		y=Math.round(0.299*r+0.587*g+0.114*b);
		i=Math.round(0.596*r-0.275*g-0.321*b);
		q=Math.round(0.212*r-0.528*g+0.311*b);
		System.out.printf("El color correspondiente al RGB (%d,%d,%d) en formato YIQ es (%.0f,%.0f,%.0f)",r,g,b,y,i,q);

		
	}

}
