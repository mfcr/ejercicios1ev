package unidad4;
import unidad4.Matrices;

public class PruebaMatrices {

	public static void main(String[] args) {
		int[][] uno=Matrices.cuadrada1(8);
		for (int i=0;i<uno.length;i++) {
			for (int j=0;j<uno[0].length;j++) {
				System.out.print(uno[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		int[][] dos=Matrices.cuadrada2(8);
		for (int i=0;i<dos.length;i++) {
			for (int j=0;j<dos[0].length;j++) {
				System.out.print(dos[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		String [][] tres=Matrices.palindromos(15,11);
		if (tres!=null) {
			for (int i=0;i<tres.length;i++) {
				for (int j=0;j<tres[0].length;j++) {
					System.out.print(tres[i][j]+"  ");
				}
				System.out.println();
			}
		}

		System.out.println();
		int mayor=Matrices.max3x3sum(uno);
		System.out.println("Suma mayor 3x3 de array 1º: "+mayor);
		mayor=Matrices.max3x3sum(dos);
		System.out.println("Suma mayor 3x3 de array 2º: "+mayor);
		
	}

}
