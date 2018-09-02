package mx.com.twg.entrada;

import java.util.Scanner;

public class EntradaScanner {

	public static void entradaScanner(){
		
		String captura = null;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce un dato:");
		captura = ent.nextLine();
		
		while(captura!=null){
			
			System.out.println("Dato de entrada:"+captura);
			captura=ent.nextLine();
			
		}
	}
}
