package mx.com.twg.entrada;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {

	public static void entrada(){
		
		String captura= null;
		InputStreamReader in = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(in);
		
		try{
			
			System.out.println("Introduce datos:");
			captura = br.readLine();
			
			while(captura!=null){
				System.out.println("Dato introducido:"+captura);
				captura = br.readLine();
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
