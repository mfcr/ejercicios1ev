package unidad2;
import java.io.*;


public class Conversor {

	public static double tipoCambio=1.1747;
	/**
	 * Devuelve el numero de dolares correspondiente a los euros introducidos por pantalla
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce la cantidad de euros: ");
		String txt = br.readLine();

		double euros = Double.parseDouble(txt);
		System.out.println(String.format("%.2f",euros)+" Euros se corresponden con "+String.format("%.2f",(euros*tipoCambio))+
				" Dólares. Tipo de cambio actual es de "+String.format("%.4f",tipoCambio)+" dólares por euro.");
		
	}

}
