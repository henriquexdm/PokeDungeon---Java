package main.personagens;

public class Heroi extends Personagem {
public Heroi(String nome, int hpMaximo, int ataque, int defesa) {
 super(nome, hpMaximo, ataque, defesa);
 }
 @Override
 public int atacar() {
	 
 // TODO: retornar valor de ataque base
	 
	 return getAtaque();
 }
 public int usarHabilidade() {
	 
 // TODO: será sobrescrito nas subclasses
	 
	 return getAtaque();
 }

}
