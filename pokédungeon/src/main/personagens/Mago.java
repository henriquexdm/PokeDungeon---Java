package main.personagens;

import main.util.EntradaUsuario;


public class Mago extends Heroi{

	public Mago(String nome) {
        super(nome, 80, 15, 4);
    }

    @Override
    public int usarHabilidade(Monstro monstro) {
        System.out.println(getNome() + " lançou Bola de Fogo!");
        EntradaUsuario.pressioneEnter();
        int dano = getAtaque() * 2;
        
        double chanceQueimadura = Math.random();
        
        if (chanceQueimadura < 0.50) {
        	monstro.aplicarQueimadura(5, 3);
        	System.out.println(monstro.getNome() + " foi queimado!");
        }
        
        return dano;
    }
}
