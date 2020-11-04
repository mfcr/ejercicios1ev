package unidad4;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio19Ud4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		
		System.out.print("Introduzca el número de filas a rellenar: ");
		int f=teclado.nextInt();
		System.out.print("Introduzca el número de columnas a rellenar: ");
		int c=teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Si desea que se rellene de forma automático pulse s o cualquier tecla para relleno manual:");
		String manual=teclado.nextLine().trim();
		char[][] arrayChars=new char[f][c];
		if (manual.equals("s") || manual.equals("S")) { 
			//Relleno automático.
			for (int i=0;i<f;i++) {
				for (int j=0;j<c;j++) {
					arrayChars[i][j]=(char) (rnd.nextInt(26)+97);
				}
			}
		} else {
			//Relleno manual
			for (int i=0;i<f;i++) {
				System.out.print("Introduzca una cadena de letras de longitud "+c+":");
				char[] txt=teclado.nextLine().trim().substring(0,c).toCharArray();
				arrayChars[i]=txt;
			}
		}

		
		System.out.print("Introduzca ahora el caracter de relleno: ");
		char caracterRelleno=teclado.nextLine().trim().charAt(0);

		System.out.print("Introduzca la fila inicial (entre 1 y "+(f)+"): ");
		int fInic=teclado.nextInt()-1;
		System.out.print("Introduzca la columna inicial (entre 1 y "+(c)+"): ");
		int cInic=teclado.nextInt()-1;
		
		System.out.println("\n EL ARRAY INICIAL ES: ");
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(arrayChars[i][j]+", " );
			}
			System.out.println();
		}
		arrayChars=rellenar(arrayChars,fInic,cInic,caracterRelleno);
		System.out.println("\n EL ARRAY TRANSFORMADO ES: ");
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(arrayChars[i][j]+", " );
			}
			System.out.println();
		}

		
	}
	
	public static char[][] rellenar(char[][] matrizChars, int filaInicial, int columnaInicial, char caracterRelleno) {
		char caracterInicial=matrizChars[filaInicial][columnaInicial];
		int cambios=0;
		do {
			cambios=0;
			if (filaInicial>0  && matrizChars[filaInicial-1][columnaInicial]==caracterInicial) { //Arriba
				matrizChars[filaInicial-1][columnaInicial]=caracterRelleno;
				cambios++;
				filaInicial-=1;
			} else if (columnaInicial>0 && matrizChars[filaInicial][columnaInicial-1]==caracterInicial) { //Izquierda
				matrizChars[filaInicial][columnaInicial-1]=caracterRelleno;
				cambios++;
				columnaInicial-=1;
			} else if (filaInicial<matrizChars.length-1  && matrizChars[filaInicial+1][columnaInicial]==caracterInicial) { //Abajo
				matrizChars[filaInicial+1][columnaInicial]=caracterRelleno;
				cambios++;
				filaInicial+=1;
			} else if (columnaInicial<matrizChars[0].length-1 && matrizChars[filaInicial][columnaInicial+1]==caracterInicial) { //Derecha
				matrizChars[filaInicial][columnaInicial+1]=caracterRelleno;
				cambios++;
				columnaInicial+=1;
			}
		} while (cambios>0);
	
		return (matrizChars);
	}

	
}
