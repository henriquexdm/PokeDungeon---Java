package main;

import java.util.Scanner;
import main.personagens.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o nome do seu herói: ");
		String nome = scan.nextLine();
		
		System.out.println("\nEscolha a classe:");
        System.out.println("[1] - Guerreiro");
        System.out.println("[2] - Mago");
        System.out.println("[3] - Arqueiro");

        int escolhaClasse = scan.nextInt();

        Heroi heroi;
        
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
	            heroi = new Guerreiro(nome);
	    }
		
        System.out.println("\nNome do herói: " + heroi.getNome());
        System.out.println("Classe: " + heroi.getClass().getSimpleName());
		
		Monstro monstro = new Monstro("Goblino", 60, 20, 3);
		
		System.out.println("\nMonstro: " + monstro.getNome());

		System.out.println("\n=== BATALHA INICIADA ===");
		
		while (heroi.estaVivo() && monstro.estaVivo()) {
			System.out.println();
			System.out.println(heroi.getNome() + " " + heroi.barraDeHP());
			System.out.println(monstro.getNome() + " " + monstro.barraDeHP());
			
			System.out.println("\nEscolha uma ação:");
			System.out.println("[1] Atacar");
			System.out.println("[2] Habilidade");
			
			int escolhaAcao = scan.nextInt();
			scan.nextLine();
			
			int dano;
			
			switch (escolhaAcao) {
			
				case 1:
					dano = heroi.atacar();
					monstro.receberDano(dano);
					System.out.println(heroi.getNome() + " usou ataque básico!");
					pressEnterToContinueSimple(scan);
					System.out.println(heroi.getNome() + " causou " + dano + " pontos de dano!");
					pressEnterToContinueSimple(scan);
					break;
					
				case 2:
					dano = heroi.usarHabilidade();
					pressEnterToContinueSimple(scan);
					monstro.receberDano(dano);
					System.out.println(heroi.getNome() + " causou " + dano + " pontos de dano!");
					pressEnterToContinueSimple(scan);
					break;
					
				default:
					System.out.println("Ação inválida!");
					continue;
			}
			
			if (monstro.estaVivo()) {
				int danoMonstro = monstro.atacar();
				heroi.receberDano(danoMonstro);
				
				System.out.println(monstro.getNome() + " ataca " + heroi.getNome() + "!");
				pressEnterToContinueSimple(scan);
				System.out.println(heroi.getNome() + " recebeu " + danoMonstro + " pontos de dano!");
				pressEnterToContinueSimple(scan);
			}
		}
		
		if (heroi.estaVivo()) 
			System.out.println(heroi.getNome() + " venceu!");
		else 
			System.out.println(heroi.getNome() + " foi derrotado!");
		
		scan.close();
		
	}
	
	private static void pressEnterToContinueSimple(Scanner scan) {
	    scan.nextLine();
	}

}
