package unidad4;

import java.util.Scanner;
import java.util.*;

public class Ejercicio15Ud4 {

	/**
	 * Primero el usuario introduce los nombres y las calificaciones de las 3 evaluaciones de una asignatura.
	 * Después el usuario podrá realizar diferentes acciones o informes con dicha información.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> nombres=new ArrayList<String>(); //Ejercicio resuelto con ArrayList. 
		List<double[]> notas=new ArrayList<double[]>();
		//Primera parte, rellenamos los datos.
		boolean continuar=true;
		do {
			System.out.print("Introduzca el nombre del alumno nº "+(nombres.size()+1)+" o intro para salir: ");
			String txt=teclado.nextLine();
			if (txt.equals("")) {
				continuar=false;
			} else {
				nombres.add(txt);
				double[] notasAlumno=new double[3];
				for (int i=0;i<3;i++) {
					System.out.print("Introduzca la nota de la "+(i+1)+"ª Evaluacion de "+txt+": ");
					notasAlumno[i]=teclado.nextDouble();
				}
				notas.add(notasAlumno);
				teclado.nextLine();
			}
		} while (continuar);
		//Segunda parte menus y acciones
		continuar=true;
		int opcion;
		do {
			//Mostramos menú.
			System.out.println("\n\nElija una de las siguientes acciones: ");
			System.out.println("1. Ver la nota media de todos los alumnos.");
			System.out.println("2. Ver la nota media de un alumno.");
			System.out.println("3. Ver las notas por evaluación y la nota de cada evaluación todos los alumnos.");
			System.out.println("4. Ver las notas por evaluación y la nota de cada evaluación de un alumno.");
			System.out.println("5. Ver la nota media del curso.");
			System.out.println("6. Ver la notas mas altas y mas bajas y a qué alumnos y evaluaciones corresponden.");
			System.out.println("7. Salir.");
			opcion=teclado.nextInt();
			//teclado.nextLine();
			int num=0;
			switch (opcion) {
				case 1: //La media de todos loa alumnos
					for (int i=0;i<nombres.size();i++) {
						System.out.println("La nota media del alumno nº"+(i+1)+": "+nombres.get(i)+" es de: " +String.format("%.2f",media(notas.get(i)))+"/10");
					}
					break;
				case 2: //La media de un alumno
					mostrarAlumnos(nombres);
					num=teclado.nextInt();
					System.out.println("La nota media del alumno nº"+(num)+": "+nombres.get(num-1)+" es de: " +String.format("%.2f",media(notas.get(num-1)))+"/10");
					break;
				case 3: //Las notas parciales y la media de todos 
					for (int i=0;i<nombres.size();i++) {
						System.out.println("Las notas del alumno nº"+(i+1)+": "+nombres.get(i)+" son: "+notas.get(i)[0]+"/"+notas.get(i)[1]+"/"+
								notas.get(i)[2]+" y su media es de: " +String.format("%.2f",media(notas.get(i)))+"/10");
					}
					break;
				case 4: //Las notas parciales y la media de un alumno
					mostrarAlumnos(nombres);
					num=teclado.nextInt();
					System.out.println("Las notas del alumno nº"+(num)+": "+nombres.get(num-1)+" son: "+notas.get(num-1)[0]+"/"+notas.get(num-1)[1]+"/"+
							notas.get(num-1)[2]+" y su media es de: " +String.format("%.2f",media(notas.get(num-1)))+"/10");
					break;
				case 5: //Nota media del curso.
					double suma=0;
					for (int i=0;i<nombres.size();i++) {
						suma+=media(notas.get(i));
					}
					System.out.printf("La Media del curso ha sido de : %.2f",suma/nombres.size());
					break;
				case 6: //Encontrar máximo y minimo y decir de quien son y de que eval es.
					int maxNm=0,maxEv=0,minNm=0,minEv=0;
					double max=0,min=11;
					for (int i=0;i<nombres.size();i++) {
						double[] notasNm=notas.get(i);
						for (int j=0;j<notasNm.length;j++) {
							if (notasNm[j]>max) {max=notasNm[j]; maxNm=i; maxEv=j;}
							if (notasNm[j]<min) {min=notasNm[j]; minNm=i; minEv=j;}
						}
					}
					System.out.printf("/nLa nota máxima es de %.2f y corresponde al alumno %s y a la %dª evaluación",max,nombres.get(maxNm),maxEv+1);
					System.out.printf("/nLa nota minima es de %.2f y corresponde al alumno %s y a la %dª evaluación",min,nombres.get(minNm),minEv+1);
					break;
				case 7:
					continuar=false;
					System.out.println("\n\n Hasta la vista.");
			}
		} while (continuar);
	}
	
	/**Recibe el listado de las notas y devuelve la media del alumno que esta en la posicion indicada.
	 * @param notasParciales
	 * @param posicion
	 * @return NotaMedia
	 */
	public static double media(double[] notasParciales) {
		double suma=0;
		for (int i=0;i<notasParciales.length;i++) {
			suma+=notasParciales[i];
		}
		return(suma/notasParciales.length);
	}
	
	public static void mostrarAlumnos(List<String> nombres) {
		System.out.println("Escoja 1 alumno por su código:");
		for (int i=0;i<nombres.size();i++) {
			System.out.println((i+1)+". "+nombres.get(i));
		}
	}

	
	
}
