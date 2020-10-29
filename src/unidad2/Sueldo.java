package unidad2;

import java.util.Scanner;

public class Sueldo {

	/**
	 * Calcula el salario de un vendedor a partir de su salario
	 * base y las ventas mensuales sabiendo que tiene una comision del 10%.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//En el caso de necesitar saber la comisi�n de cada venta por separado, ahbr�a que crear mas variable o convertir ventasMes en array.
		double base,ventasMes=0;
		//NOTA: Scanner usa el formato del sistema del PC, es decir, en espa�a la coma y en formato USA (.) para indicar los decimales.
		System.out.print("Introduzca el salario base:");
		base=teclado.nextDouble();
		System.out.print("Introduzca el importe de la primera venta:");
		ventasMes+=teclado.nextDouble();
		System.out.print("Introduzca el importe de la segunda venta:");
		ventasMes+=teclado.nextDouble();
		System.out.print("Introduzca el importe de la tercera venta:");
		ventasMes+=teclado.nextDouble();

		System.out.println("----------------------------------------\n");
		System.out.printf("Su salario este mes asciende a: %.2f � siendo %.2f � del salario base y %.2f � de la comisi�n correspondiente a %.2f � de venta totales \n",
				base+0.1*ventasMes,base,0.1*ventasMes,ventasMes);
		
		
	}

}
