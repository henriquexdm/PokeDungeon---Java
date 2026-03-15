package main.personagens;

import main.util.EntradaUsuario;

public class Arqueiro extends Heroi{

	public Arqueiro(String nome) {
        super(nome, 100, 18, 6);
    }

    @Override
    public int usarHabilidade(Monstro monstro) {
    	System.out.println(getNome() + " dispara Tiro Certeiro!");
        EntradaUsuario.pressioneEnter();
        int dano =  getAtaque() * 2;
        
        double chanceCritico = Math.random();
        
        if (chanceCritico < 0.80) {
        	System.out.println("DANO CRÍTICO!");
        	dano *= 1.5;
        }
        
        return dano;
    }
	
}
