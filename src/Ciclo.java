import java.util.Scanner;


public class Ciclo {

	public static void main(String[] args) {
		{
			Scanner s = new Scanner (System.in); 
			int numero = 0;
			while (numero%2 ==0)
			{ 
				System.out.print("Ingrese un numero:");
				numero = s.nextInt();
				if (numero ==0)
				{
					break;
				}
			}
			System.out.println("Final del Progrma:"); 
		}
	}

}
