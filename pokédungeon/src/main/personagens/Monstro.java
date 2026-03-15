package main.personagens;

public class Monstro extends Personagem {
	
	public Monstro(String nome, int hpMaximo, int ataque, int defesa) {
		super(nome, hpMaximo, ataque, defesa);	
	}
	
	private int turnosQueimadura = 0;
	private int danoQueimadura = 0;
	
	public void aplicarQueimadura (int dano, int turnos) {
		this.danoQueimadura = dano;
		this.turnosQueimadura = turnos;
	}
	
	public void processarQueimadura () {
		if (turnosQueimadura > 0) {
			int danoReal = receberDano(danoQueimadura);
			System.out.println(getNome() + " sofre " + danoReal + " pontos de dano de queimadura!");
			turnosQueimadura--;
		}
	}
	
	@Override
	public int atacar() {
		return getAtaque();
	}
	
}
