package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.*;

public class Calculateur {

	public static void main(String[] args) throws CalculatriceException {
		double solution;
		Calculatrice myAddition = new Calculatrice();
		myAddition.ajouterOperation(new Ajouter());
		myAddition.ajouterOperation(new Multiplier());
		myAddition.ajouterOperation(new Soustraire());
		myAddition.ajouterOperation(new Diviser());
		
		Operation operationChercher = myAddition.chercherOperation("+");
		System.out.println(operationChercher);
		
		solution = myAddition.calculer("+", 5.0, 4.0);
		System.out.println("Le resultat est " + solution);
	}

}
