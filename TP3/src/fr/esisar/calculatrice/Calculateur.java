package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.*;
import fr.esisar.calculatrice.operations.binaires.*;
import fr.esisar.calculatrice.operations.unaires.*;
//import fr.esisar.calculatrice.operations.ensemblistes.*;
import java.util.HashSet;
import java.util.Set;

public class Calculateur {

	public static void main(String[] args) throws CalculatriceException {
		double solution;

		Set<Operation> operations = new HashSet<>();

		Ajouter Ajoute = new Ajouter();
		Multiplier Multiple = new Multiplier();
		Diviser Divise = new Diviser();
		Soustraire Soustrait = new Soustraire();

		System.out.println("Les operation sont " + operations);
		Calculatrice myCalculatrice = new Calculatrice(operations);

		myCalculatrice.ajouterOperation(Ajoute);
		myCalculatrice.ajouterOperation(Multiple);
		myCalculatrice.ajouterOperation(Divise);
		myCalculatrice.ajouterOperation(Soustrait);

		solution = myCalculatrice.calculer("*", 5.0, 4.0);
		System.out.println("Le resultat est " + solution);

		//myCalculatrice.retirerOperation(Ajoute);
		solution = myCalculatrice.calculer("+", 5.0, 4.0);
		System.out.println("Le resultat est " + solution);

		Operation operationChercher = myCalculatrice.chercherOperation("+");
		System.out.println(operationChercher);

		operations.add(new Tangente());
	}

}