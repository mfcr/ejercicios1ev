package unidad2;
import java.io.*;


public class Cronometro {

	/**Pregunta el nombre del usuario y 
	 * calcula el tiempo que pasa entre que se pregunta y el usuario responde
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		long start=System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca su nombre: ");
		String txt = br.readLine();

		long end=System.currentTimeMillis();
		
		System.out.println("Hola "+txt+", has tardado "+String.format("%.3f",(end-start)/1000.0)+" segundos en introducir tu nombre.");

		
		
	}

}
