package main.personagens;

import main.util.EntradaUsuario;

public class Guerreiro extends Heroi{
	
	public Guerreiro (String nome) {
		super (nome, 120, 15, 10);
	}

	@Override
	public int usarHabilidade(Monstro monstro) {
		System.out.println(getNome() + " usou Golpe Devastador!");
		EntradaUsuario.pressioneEnter();
		return getAtaque() * 2;
	}
}
