package main.personagens;

public class Arqueiro extends Heroi{

	public Arqueiro(String nome) {
        super(nome, 100, 18, 6);
    }

    @Override
    public int usarHabilidade() {
        System.out.println(getNome() + " dispara Tiro Certeiro!");
       int dano =  getAtaque() * 2;
        
        double chanceCritico = Math.random();
        
        if (chanceCritico < 0.80) {
        	System.out.println("DANO CRÍTICO!");
        	dano *= 2;
        }
        
        return dano;
    }
	
}
