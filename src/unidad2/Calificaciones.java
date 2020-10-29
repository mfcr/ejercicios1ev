package unidad2;
import java.io.*;


public class Calificaciones {

	/**Pregunta al usuario las notas de los examenes y de las tareas realizadas y calcula las medias
	 * de cada asignmatura y la nota media global de las tres asignaturas.
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//Este ejercicio se resumiría mucho en el caso de usar arrays y bucles para ir pidiendo
		//   informacion al usuario. Pero como en esta unidad aún no se han dado, lo hacemos así.
		
		//Asimismo al usar la clase BufferedReader como entrada, perdemos el control de tipos de entrada 
		//   que hace la clase Scanner con los metodos nextDouble() (en este caso) para evitar errores de tipado ej: usuario mete un String.
		
		//NOTA: parseDouble usa notacion USA para los formatos, es decir, usa . para decimales.
		
		double notaMates=0, notaFisica=0, notaQuimica=0, notaMedia;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca la nota del exámen de Matemáticas: ");
		String txt = in.readLine();
		notaMates+=0.9*Double.parseDouble(txt);
		System.out.print("Introduzca la nota de la 1ª tarea de Matemáticas: ");
		txt = in.readLine();
		notaMates+=0.1*Double.parseDouble(txt)/3;
		System.out.print("Introduzca la nota de la 2ª tarea de Matemáticas: ");
		txt = in.readLine();
		notaMates+=0.1*Double.parseDouble(txt)/3;
		System.out.print("Introduzca la nota de la 3ª tarea de Matemáticas: ");
		txt = in.readLine();
		notaMates+=0.1*Double.parseDouble(txt)/3;

		

		System.out.print("Introduzca la nota del exámen de Física: ");
		txt = in.readLine();
		notaFisica+=0.8*Double.parseDouble(txt);
		System.out.print("Introduzca la nota de la 1ª tarea de Física: ");
		txt = in.readLine();
		notaFisica+=0.2*Double.parseDouble(txt)/2;
		System.out.print("Introduzca la nota de la 2ª tarea de Física: ");
		txt = in.readLine();
		notaFisica+=0.2*Double.parseDouble(txt)/2;

		
		System.out.print("Introduzca la nota del exámen de Química: ");
		txt = in.readLine();
		notaQuimica+=0.85*Double.parseDouble(txt);
		System.out.print("Introduzca la nota de la 1ª tarea de Química: ");
		txt = in.readLine();
		notaQuimica+=0.15*Double.parseDouble(txt)/3;
		System.out.print("Introduzca la nota de la 2ª tarea de Química: ");
		txt = in.readLine();
		notaQuimica+=0.15*Double.parseDouble(txt)/3;
		System.out.print("Introduzca la nota de la 3ª tarea de Química: ");
		txt = in.readLine();
		notaQuimica+=0.15*Double.parseDouble(txt)/3;
		
		notaMedia=(notaQuimica+notaMates+notaFisica)/3;
		
		System.out.println("----------------------------------------");
		System.out.printf("La nota media de Matemáticas es de: %.2f \n",notaMates);
		System.out.printf("La nota media de Física      es de: %.2f \n",notaFisica);
		System.out.printf("La nota media de Química     es de: %.2f \n",notaQuimica);
		System.out.println("----------------------------------------");
		System.out.printf("La nota media GLOBAL es de: %.2f  \n",notaMedia);
		System.out.println((notaMedia>=5)?"Enhorabuena, ha aprobado.":"Pruebe otra vez en la recuperación.");
		
	}

}
