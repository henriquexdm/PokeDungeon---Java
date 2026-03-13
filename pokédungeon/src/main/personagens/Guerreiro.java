package main.personagens;

public class Guerreiro extends Heroi{
	
	public Guerreiro (String nome) {
		super (nome, 120, 15, 10);
	}

	@Override
	public int usarHabilidade() {
		System.out.println(getNome() + " usou Golpe Devastador!");
		return getAtaque() * 2;
	}
}
