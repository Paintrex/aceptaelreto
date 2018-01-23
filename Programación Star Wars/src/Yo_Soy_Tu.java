import java.util.Scanner;

public class Yo_Soy_Tu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuantos casos de prueba? : ");
		int casos = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		while (casos > 0){
			
			System.out.print("¿Introduce un nombre? : ");
			String nombre = sc.nextLine();
			
			System.out.print("¿Introduce su parentesco? : ");
			String parentesco = sc.nextLine();
			
			if(nombre.equals("Luke") && parentesco.equals("padre")){
				
				System.out.println();
				System.out.println("TOP SECRET");
				System.out.println();
				
			}else{
				
				System.out.println();
				System.out.println(nombre + ", yo soy tu " + parentesco);
				System.out.println();
				
			}
			
			casos--;
			
		}	
		
		sc.close();
	}//CIERRE MAIN
}//CIERRE CLASE
