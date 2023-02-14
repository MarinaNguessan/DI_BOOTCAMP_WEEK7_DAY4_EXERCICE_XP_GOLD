package atos;
import java.util.Random;
public class Exercice2PickRandomNumber {
	
	private static final Random RANDOM = new Random();

    /**
     * Renvoie un entier aléatoire compris entre a et b, inclus.
     * @param a borne inférieure
     * @param b borne supérieure
     * @return entier aléatoire
     */
	public static int next(int a, int b) {
        return RANDOM.nextInt(b - a + 1) + a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
