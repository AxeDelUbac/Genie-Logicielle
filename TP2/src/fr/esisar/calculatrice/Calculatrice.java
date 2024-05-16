package fr.esisar.calculatrice;

import java.util.*;

import fr.esisar.calculatrice.operations.*;

public class Calculatrice {
	Set<Operation> Ensemble;

	public Calculatrice() {
		Ensemble = new HashSet<>();
	}

	public void ajouterOperation(Operation operation) {
		Ensemble.add(operation);
	}

	public Operation chercherOperation(String nom) {
		for (Operation operation : Ensemble) {
			if (operation.getNom().equals(nom)) {
				return operation;
			}
		}
		return null;
	}

	public double calculer(String nom, Double operande1, Double operande2) throws CalculatriceException {
		for (Operation operation : Ensemble) {
			if (operation.getNom().equals(nom)) {
				return operation.calculer(operande1, operande2);
			}
		}
		throw new CalculatriceException("Opération non trouvée: " + nom);
	}
}
