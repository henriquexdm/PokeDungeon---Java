package main.personagens;

public class Mago extends Heroi{

	public Mago(String nome) {
        super(nome, 80, 25, 4);
    }

    @Override
    public int usarHabilidade() {
        System.out.println(getNome() + " lançou Bola de Fogo!");
        return getAtaque() * 3;
    }
}
