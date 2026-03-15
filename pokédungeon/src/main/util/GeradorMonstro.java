package main.util;

import java.util.Random;
import main.personagens.Monstro;

public class GeradorMonstro {

    private static Random rand = new Random();

    public static Monstro gerarMonstro(int nivel) {
        if (nivel % 4 == 0) {
            return gerarChefe(nivel);
        }

        int tipo = rand.nextInt(5);

        switch (tipo) {

            case 0:
                return new Monstro("Dragãozinho", 70, 12, 7);

            case 1:
                return new Monstro("Esqueleto", 45, 10, 5);

            case 2:
                return new Monstro("Zumbi", 60, 7, 3);
                
            case 3:
            	return new Monstro("Goblino", 50, 6, 3);
                
            default:
            	return new Monstro("Aranha gigante", 40, 8, 4);
        }
    }

    private static Monstro gerarChefe(int nivel) {

        return new Monstro("Dracolich", 180, 15, 9);
    }



}
