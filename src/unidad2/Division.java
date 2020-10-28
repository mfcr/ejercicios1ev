package unidad2;

public class Division {
	public static double dividendo=1234;
	public static double divisor=532;
	/**Divide 1234 entre 532 
	 * y muestra el resultado formateado.
	 */
	public static void main(String[] Args) {
		System.out.println("El resultado de dividir "+String.format("%.0f",dividendo)+" entre "+String.format("%.0f",divisor)+ 
				" ocupando el resultado 15 caracteres siendo dos de los decimales es de "+String.format("%13.2f",(dividendo/divisor)));
	}
	
}
