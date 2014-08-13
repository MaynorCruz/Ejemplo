import java.util.Scanner;
public class Ciclos {
	
	public static void main(String[] args) {
		{ 
			Scanner s= new Scanner(System.in); 
			System.out.print("Ingrese las repeticiones: ");
			int repeticiones = s.nextInt();
			int i = 0;
			while (i<repeticiones)
			{
				System.out.println(i);
				i = i+i;
			}
		}

	}

}

