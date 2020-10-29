package unidad3;
import java.util.Scanner;


public class Hora {
	/**
	 * De la hora introducida por teclado nos devuelve la hora + 1 segundo.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean masHoras=true;
		int hora,minuto,segundo;
		String txt;
		do {
			System.out.println("Introduzca una hora o nada para salir:");
			txt=teclado.nextLine();
			if (txt.length()==0) {
				masHoras=false;
			} else {
				try {
					//NOTA: se podría mejorar ya que ahora si hay un error en cualquir dato introducido comienza de nuevo a pedirlos todos.
					hora=Integer.parseInt(txt);
					System.out.println("Introduzca los minutos:");
					minuto=teclado.nextInt();
					System.out.println("Introduzca los segundos:");
					segundo=teclado.nextInt();
					//NOTA: no se está comprobando que los numeros introducidos sean correctos hora (0-23) minutos y segundos (0-59) 
					if (segundo==59) {
						segundo=0;
						minuto++;
						if (minuto>=60) {
							minuto=0;
							hora++;
							if (hora>=24) {
								hora=0;
							}
						}
					} else {
						segundo++;
					}
					String horaFinal=((hora<10)?"0"+hora:hora)+":"+((minuto<10)?"0"+minuto:minuto)+":"+((segundo<10)?"0"+segundo:segundo);
					System.out.println("La hora + 1 segundo es: "+horaFinal+"\n");
					
				} catch (Exception e)  { //Clase padre de todas las excepciones.
					System.out.println("Vuelva a intentarlo, ha introducido un valor no valido.");
				}
			}
			teclado.nextLine(); //consume un intro para Evitar problema que habia porque no esperaba a introducir las horas en 2º vueltas.
			//Esto es porque nextInt no consume el intro ??. Si fuesen todo nextline no habria problema como en el caso de Bisiesto.
		} while (masHoras);
	}

}
