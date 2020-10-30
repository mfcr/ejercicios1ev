package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio13Ud4 {
	/**
	 * Crea una matriz de numeros aleatorios cuyas filas y columnas estan entre 2 y 20 aleatoriamente.
	 * 
	 */
	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner teclado=new Scanner(System.in);
		
		int filas=rnd.nextInt(19)+2; //Numero aleatorio de filas entre 2 y 20
		int cols=rnd.nextInt(19)+2;  //idem columnas.
		int[][] numeros=new int[filas][cols];
		//Rellenamos array bidimensional con numero aleatorios
		for (int i=0;i<numeros.length;i++) {
			for (int j=0;j<numeros[i].length;j++) {
				numeros[i][j]=rnd.nextInt(19)+2; //Los numeros aleatorios tb entre 2 y 20 ???
			}
		}
		//Obtenemos las sumas
		long [] filasSumadas=sumaFilas(numeros);
		long [] columnasSumadas=sumaColumnas(numeros);
		//Mostramos en la consola
		int charsPorNum=5;
		String guiones=fill(numeros[0].length*(charsPorNum+1),"-");
		for (int i=0;i<numeros.length;i++) {
			System.out.println(guiones);
			String txt="";
			for (int j=0;j<numeros[i].length;j++) {
				txt+=numeros[i][j]+fill(charsPorNum-Integer.toString(numeros[i][j]).length()," ")+"|";
			}
			System.out.println(txt+" --> "+filasSumadas[i]);
		}
		//Sumas de las columnas
		System.out.println(guiones);
		System.out.println(guiones);
		String txt="";
		for (int j=0;j<numeros[0].length;j++) {  //Se podrían usar tb las variables fila y columna
			txt+=columnasSumadas[j]+fill(charsPorNum-(Long.toString(columnasSumadas[j]).length())," ")+"|";
		}
		System.out.println(txt);
		System.out.println(guiones);
		
	}
	
	private static String fill(int num,String s) {
		String esp="";
		for (int i=0;i<num;i++) {
			esp+=s;
		}
		return (esp);
	}
	
	private static long[] sumaFilas(int[][] matriz) {
		long[] sumados=new long[matriz.length]; //Long porque sumar ints puede desbordar.
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				sumados[i]+=matriz[i][j];
			}
		}
		return(sumados);
	}

	private static long[] sumaColumnas(int[][] matriz) {
		long[] sumados=new long[matriz[0].length]; //Long porque sumar ints puede desbordar.
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				sumados[j]+=matriz[i][j];
			}
		}
		return(sumados);
	}
	
	
	
}
