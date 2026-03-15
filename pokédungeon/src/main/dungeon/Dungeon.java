package main.dungeon;

import java.util.Scanner;

import main.batalha.Batalha;
import main.personagens.*;
import main.util.*;

public class Dungeon {

	private int sala = 1;
	
	public void iniciar(Heroi heroi, Scanner scan) {
		while (heroi.estaVivo()) {
			
			System.out.println("\n=== SALA " + sala + " ===");
			
			EntradaUsuario.pressioneEnter();
			
			Monstro monstro = GeradorMonstro.gerarMonstro(sala);
			
			boolean venceu = Batalha.iniciar(heroi, monstro, scan);
			
			if (!venceu) {
				System.out.println("\n" + heroi.getNome() + " foi derrotado!");
				break;
			}
			
			if (sala == 4) {
				System.out.println("\nChefe final derrotado!");
				EntradaUsuario.pressioneEnter();
				System.out.println("\nPARABÉNS, VOCÊ TERMINOU O JOGO!");
				break;
			}
			
			System.out.println("\n" + heroi.getNome() + " venceu o nível!");
			sala++;
		}
	}

}
