package main.personagens;

public abstract class Personagem {
	 private String nome;
	 private int hpAtual;
	 private int hpMaximo;
	 private int ataque;
	 private int defesa;
	 public Personagem(String nome, int hpMaximo, int ataque, int defesa) {
		 
	 // TODO: inicializar os atributos
		 
		 this.nome = nome;
		 this.hpMaximo = hpMaximo;
		 this.hpAtual = hpMaximo;
		 this.ataque = ataque;
		 this.defesa = defesa;
	 }
		 
		 public String getNome() {
			 return nome;
		 }

		 public int getHpAtual() {
		     return hpAtual;
		 }

		 public int getHpMaximo() {
		     return hpMaximo;
		 }

		 public int getAtaque() {
		     return ataque;
		 }

		 public int getDefesa() {
		     return defesa;
		 }

		 public void setHpAtual(int hpAtual) {
		     this.hpAtual = hpAtual;
		 }
	 
	 // TODO: criar getters e setters para todos os atributos
		    
	 public abstract int atacar(); // cada subclasse define como ataca
	 
	 public int receberDano(int dano) {
		 
	 // TODO: subtrair dano da defesa, depois do HP (HP não pode ser negativo)
		 
		 int danoFinal = dano - defesa;
		 
		 if (danoFinal < 0) {
			 danoFinal = 0;
		 }
		 
		 if (hpAtual < 0) {
			 hpAtual = 0;
		 }
		 
		 hpAtual -= danoFinal;

		 return danoFinal;
	 }
	 public boolean estaVivo() {
		 
	 // TODO: retornar true se hpAtual > 0
		 
		 return hpAtual > 0;
	 }
	 public String barraDeHP() {
		 
	 // TODO: retornar uma string visual como [ ████░░░ 40/80 ]
		 
		 int barras = (hpAtual * 10) / hpMaximo;

	        String barra = "[ ";

	        for (int i = 0; i < barras; i++)
	            barra += "█";

	        for (int i = barras; i < 10; i++)
	            barra += "░";

	        barra += " " + hpAtual + "/" + hpMaximo + " ]";

	        return barra;
	 }
}