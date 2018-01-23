import java.util.Scanner;


public class Tendencia_al_lado_oscuro {
	
	static int cont = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuantos casos de prueba? : ");
		int casos = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		while(casos > 0){
			
			System.out.print("¿Introduce el número de midiclorianos? : ");
			int power = sc.nextInt();
			
			System.out.println("Numero de base 10 a base 5 : " + base10to5(power));
			
			String str = (String)(base10to5(power));
			
			cuantos4(str);
			
			System.out.println("El contador es : " + cont);
			
			
			if(cont > 1){
				
				System.out.println();
				System.out.println("NO");
				System.out.println();
				
			}else{
				
				System.out.println();
				System.out.println("SI");
				System.out.println();
				
			}
			
			casos--;
		}
		
		sc.close();
		
	}//CIERRE MAIN
	
	
	public static String base10to5(int power){
		
		String powerbase5 = Integer.toString(power, 5);
		
		return powerbase5;
		
	}//CIERRE FUNCION
	
	
	public static int cuantos4 (String str){
		
		char[] charArray = str.toCharArray();
		
		for(int i = 0; i <= charArray.length-1; i++){
			
			if(charArray[i] == '4'){
				
				cont++;
				
			}
			
		}
		
		return cont;
		
		
	}//CIERRE FUNCION
	
}//CIERRE CLASE
