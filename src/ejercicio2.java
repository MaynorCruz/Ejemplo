import java.util.Scanner; 
public class ejercicio2 {
	public static void main(String[] args) {
		Scanner Loqueasea = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		int numero = Loqueasea.nextInt();
		System.out.println(numero*2); 
		System.out.print("Ingrese un numero:");
		int numero1 = Loqueasea.nextInt(); 
		System.out.println(numero+5);
		if(numero > 10) 
		{ 
			System.out.println( " Es mayor que 10"); 
			
		}else 
		{
			System.out.println(" Es mayor que 10");
		}
			
		
		
		
	}
}