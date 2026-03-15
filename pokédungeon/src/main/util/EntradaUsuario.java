package main.util;

import java.util.Scanner;

public class EntradaUsuario {

	private static Scanner scan = new Scanner(System.in);
	
	public static String lerString (String mensagem) {
		System.out.print(mensagem);
		return scan.nextLine();
	}
	
	public static int lerInt (String mensagem) {
		System.out.print(mensagem);
		int valor = scan.nextInt();
		scan.nextLine();
		return valor;
	}
	
	public static void fechar() {
		if (scan != null) {
			scan.close();
		}
	}
	
	public static void pressioneEnter() {
		System.out.println("\n[Pressione ENTER para continuar]");
		scan.nextLine();
	}

}
