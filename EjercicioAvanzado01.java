package ejercicios_avanzados;

import java.util.Scanner;

public class EjercicioAvanzado01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca cadena para transformar");

		String frase = sc.nextLine();
		String palabra="";
		
	

		do {

			Integer espacio1 = frase.indexOf(" ");
			String mayu = frase.substring(0, 1).toUpperCase();
			palabra = frase.substring(1, espacio1);
			
			System.out.print(mayu + palabra);
			
			frase= frase.substring(espacio1).trim();
			
//Do se hace mientras se cumple ()
			
			
		} while (frase.contains(" "));

	
		String mayu = frase.substring(0, 1).toUpperCase();
		palabra = frase.substring(1);
		
		System.out.print(mayu + palabra);
		
		
		sc.close();
	}

}
