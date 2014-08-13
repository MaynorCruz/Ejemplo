import java.util.Scanner;

public class Ejercicio3 {

	
		public static void main (String[] args)
		{ 
			Scanner scanner= new Scanner (System.in);
			System.out.print("Ingrese un numero:");
			int numero= scanner.nextInt();
			System.out.print("Ingrese otro numero: ");
			int numero2 = scanner.nextInt(); 
			
			if (numero == numero2)
			{ 
				System.out.print("Son iguales:");
			}else if(numero > numero2)
			{ 
				System.out.print("Numero1 es mayor que Numero2");
			}else if(numero2 > numero);
			{
				System.out.print("Numero2 es mayor que numero1");
			      
			}
			
		}
}		

