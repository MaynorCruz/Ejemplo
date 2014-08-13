import java.util.Scanner;
public class cadena {

	public static void main(String[] args) {
		{
			Scanner s= new Scanner(System.in);
			String cadena; 
			System.out.print(" Ingrese una cadena :"); 
			cadena = s.next();
			System.out.print("Ingrese otra cadena:");
			String otra_cadena= s.next();
			System.out.print("Usted ha ingresado:");
			String tercera_cadena = cadena+otra_cadena+"Prueba";
			System.out.print(tercera_cadena);
			
		}
	}

}
