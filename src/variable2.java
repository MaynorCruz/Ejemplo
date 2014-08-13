import java.util.Scanner;


public class variable2 {

	private static final char[] Letra = null;
	private static final char[] Suficiente_para_chocolate = null;

	public static void main(String[] args) {
		{ 
			int lempiras; 
			System.out.print("Ingrese cuantos lempiras tiene:");
			Scanner s = new Scanner (System.in) ; 
			lempiras = s.nextInt(); 
			int lempriras = 0;
			boolean suficiente_para_chocolate = lempriras > 10;
			System.out.print(Suficiente_para_chocolate);	
			
			
			if (suficiente_para_chocolate)
			{
				System.out.print("Tiene suficiente para el chocolate");
			}else
			{
				System.out.print("No tiene suficiente para el chocolate");
			}
		}

	}

}
