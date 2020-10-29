package unidad3;
import java.util.Scanner;


public class Calculadora {
	/**Funciona como una calculadora, primero pide un operador o salir del programa
	 * despues pide dos numeros para realizar la operacion y muestra el resultado
	 * finalmente permite volver a empezar.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean masCalculos=true;
		String txt;
		do {
			System.out.println("Introduzca un operador de los siguientes (+-*/) o nada para salir:");
			txt=teclado.nextLine().trim();
			if (txt.length()==0) {
				masCalculos=false;
				System.out.println("Hasta la vista.");
			} else {
				try {
					System.out.println("Introduzca el primer numero:");
					int num1=teclado.nextInt();
					System.out.println("Introduzca el segundo numero:");
					int num2=teclado.nextInt();
					String mensaje=num1+" "+txt+" "+num2+" = ";
					switch (txt) {
						case "+":
							mensaje+=num1+num2;
							break;
						case "-":
							mensaje+=num1-num2;
							break;
						case "*":
							mensaje+=num1*num2;
							break;
						case "/":
							mensaje+=num1/num2;
							break;
						default:
							System.out.println("Vuelva a intentarlo, ha introducido un operador no valido.\n");
							mensaje="";
					}
					if (mensaje.length()>0) {System.out.println(mensaje+"\n");}
					teclado.nextLine();
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.\n");
				}
			}
		} while (masCalculos);
	}
}
