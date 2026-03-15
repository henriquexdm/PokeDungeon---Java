package main;

import java.util.Scanner;
import main.personagens.*;
import main.util.*;
import main.dungeon.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("""
			  __                                                                                                                                               
                         /_/                                                     
______   _____  _   _  _____  ____   _   _  _    _  ______  _____  _____  _    _ 
\\   _ \\ | ___ || | / /|  ___||  _ \\ | | | || \\  | ||  ____||  ___|| ___ || \\  | |
 | │_) )| | | || |/ / | |___ | | \\ || | | ||  \\ | || |  __ | |___ | | | ||  \\ | |
 |  __/ | | | ||   <  |  ___|| | | || | | || |\\\\| || | |_ ||  ___|| | | || |\\\\| |
 | |    | |_| || |\\ \\ | |___ | |_/ || |_| || | \\  || |__| || |___ | |_| || | \\  |
 |_|    |_____||_| \\_\\|_____||____/ |_____||_|  \\_||______||_____||_____||_|  \\_|
				""");
		
		String nome = EntradaUsuario.lerString("\nInsira o nome do seu herói: ");
		
		System.out.println("\nEscolha a classe:");
        System.out.println("[1] - Guerreiro");
        System.out.println("[2] - Mago");
        System.out.println("[3] - Arqueiro");

        Heroi heroi;
        
        while (true) {
        	
        	int escolhaClasse = EntradaUsuario.lerInt("");
        
	        switch (escolhaClasse) {
	
		        case 1:
		            heroi = new Guerreiro(nome);
		            break;
		
		        case 2:
		            heroi = new Mago(nome);
		            break;
		
		        case 3:
		            heroi = new Arqueiro(nome);
		            break;
		
		        default:
		            System.out.println("Opção inválida");
		            continue;
		    }
	        
	        break;
        }
		
        System.out.println("\nNome do herói: " + heroi.getNome());
        System.out.println("Classe: " + heroi.getClass().getSimpleName());
		
        Dungeon dungeon = new Dungeon();
        dungeon.iniciar(heroi, scan);
		
        EntradaUsuario.fechar();
	}
	
}
