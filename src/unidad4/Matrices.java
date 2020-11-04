package unidad4;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[][] cuadrada1(int dim) {
		int [][] array=new int[dim][dim];
		int num=1;
		for (int i=0;i<dim;i++) {
			for (int j=0;j<dim;j++) {
				array[j][i]=num;
				num++;
			}
		}
		return(array);
	}
	
	public static int[][] cuadrada2(int dim) {
		int [][] array=new int[dim][dim];
		int num=1;
		for (int i=0;i<dim;i++) {
			if (i%2==0) {
				for (int j=0;j<dim;j++) {
					array[j][i]=num;
					num++;
				}
			} else {
				for (int j=(dim-1);j>=0;j--) {
					array[j][i]=num;
					num++;
				}
			}
		}
		return(array);
	}

	public static String[][] palindromos(int c, int f) {
		if (c+f>26 || c<1 ||f<1) {return null;}
		String[][] array=new String[f][c];
		String[] letras= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		//como el char de la letra a es 65 en lugar de crear un array con las letras e ir escogiéndolas, lo haremos con los char.
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				array[i][j]=letras[i]+letras[i+j]+letras[i];
				//array[j][i]=Character.toString((char)(97+i))+Character.toString((char)(97+i+j))+Character.toString((char)(97+i));
			}
		}
		return (array);
	}
	
	public static int max3x3sum(int [][] matriz) {
		int valor=0;
		int dim1=matriz.length, dim2=matriz[0].length;
		if (dim1<3 || dim2<=3) {return(-1);}
		for (int i=0;i<=dim1-3;i++) {
			for (int j=0;j<=dim2-3;j++) {
				int suma=0;
				for (int ct1=i;ct1<i+3;ct1++) {
					for (int ct2=j;ct2<j+3;ct2++) {
						suma+=matriz[ct1][ct2];
					}
				}
				if (suma>valor) {valor=suma;}
			}
		}
		return (valor);
	}
	
}
