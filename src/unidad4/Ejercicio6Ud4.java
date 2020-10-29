package unidad4;
import java.util.Random;


public class Ejercicio6Ud4 {
	/**El ordenador relenará un array de valores numericos de tamaño variable y aleatorio (entre 10 y 50 valores)
	 * los valores han de ser todos distintos y estar comprendidos entre -100 y 100.
	 * Finalmente crea un nuevo vector con los mimsos valores en prden inverso y muestra ambos en la consola.
	 */
	public static void main(String[] args) {
		
		Random rnd=new Random();
		//tamaño de los vectores
		int size=rnd.nextInt(41)+10; //rnd entre 0 y 40 -->+10 = entre 10 y 50.
		int[] valores=new int[size];
		int[] valoresInverso=new int[size];
		int relleno=0;
		while (relleno<size) {
			int posibleValor=rnd.nextInt(201)-100; //entre -100 y 100
			boolean found=false;
			for (int i=0;i<=relleno;i++) {
				if (valores[i]==posibleValor) {found=true; break;}
			}
			if (!found) { //El numero obtenido no esta en el array. lo añadimos
				valores[relleno]=posibleValor;
				valoresInverso[size-relleno-1]=posibleValor;
				relleno++;
			}
		}
		//Aunque se podría ir construyendo el mensaje de salida con el contenido de los array según de van construyendo,
		// lo vamos a construir aqui de forma separada.
		String msg1="El array inicial contiene: ",msg2="El array inverso contiene: ";
		for (int i=0;i<size;i++) {
			msg1+=valores[i]+", ";
			msg2+=valoresInverso[i]+", ";
		}
		System.out.println(msg1);
		System.out.println(msg2);

	}
}
