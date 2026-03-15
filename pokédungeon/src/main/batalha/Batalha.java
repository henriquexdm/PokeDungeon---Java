package main.batalha;

import java.util.Scanner;
import main.personagens.*;
import main.util.EntradaUsuario;

public class Batalha {

	public static boolean iniciar(Heroi heroi, Monstro monstro, Scanner scan) {
		
		System.out.println("\n=== INICIAR BATALHA ===");
		
		System.out.println("\n" + monstro.getNome() + " aparece!");
			
		while (heroi.estaVivo() && monstro.estaVivo()) {
			
			System.out.println();
			System.out.println(heroi.getNome() + " " + heroi.barraDeHP());
			System.out.println(monstro.getNome() + " " + monstro.barraDeHP());
				
			System.out.println("\nEscolha uma ação:");
			System.out.println("[1] Atacar");
			System.out.println("[2] Habilidade");
				
			int escolhaAcao = EntradaUsuario.lerInt("");
				
			int dano;
			int danoReal;
			int danoMonstro;
			int danoRealMonstro;
				
			switch (escolhaAcao) {
				
				case 1:
					dano = heroi.atacar();
					danoReal = monstro.receberDano(dano);
					System.out.println(heroi.getNome() + " usou ataque básico!");
					EntradaUsuario.pressioneEnter();
					System.out.println(heroi.getNome() + " causou " + danoReal + " pontos de dano!");
					EntradaUsuario.pressioneEnter();
					break;
						
				case 2:
					dano = heroi.usarHabilidade(monstro);
					danoReal = monstro.receberDano(dano);
					System.out.println(heroi.getNome() + " causou " + danoReal + " pontos de dano!");
					EntradaUsuario.pressioneEnter();	
					break;
						
				default:
					System.out.println("Ação inválida!");
					continue;
			}
				
			if (monstro.estaVivo()) {
				danoMonstro = monstro.atacar();
				danoRealMonstro = heroi.receberDano(danoMonstro);
				System.out.println(monstro.getNome() + " ataca " + heroi.getNome() + "!");
				EntradaUsuario.pressioneEnter();	
				System.out.println(heroi.getNome() + " recebeu " + danoRealMonstro + " pontos de dano!");
				EntradaUsuario.pressioneEnter();	
			}
			
			monstro.processarQueimadura();
			
		}
			
		return heroi.estaVivo();			
			
	}

}
