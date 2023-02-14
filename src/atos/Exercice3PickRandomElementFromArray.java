package atos;

import java.util.ArrayList;
import java.util.Random;

public class Exercice3PickRandomElementFromArray {
	
	 /**
     * Cette méthode prend en entrée une liste d'éléments de type `String` et retourne un élément choisi au hasard.
     *
     * @param values la liste d'éléments à partir de laquelle un élément sera choisi
     * @return un élément choisi au hasard de la liste `values`
     */
    public static String random(ArrayList<String> values) {
        int randomIndex = new Random().nextInt(0, values.size());
        return values.get(randomIndex);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
