package fr.esisar.calculatrice;

import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {
	Set<Operation> Ensemble;

	public Calculatrice(Set<Operation> operation) {
		super();
		this.Ensemble = operation;
	}

	public Operation chercherOperation(String nom) {
		for (Operation operation : Ensemble) {
			if (operation.getNom().equals(nom)) {
				return operation;
			}
		}
		return null;
	}

	public Double calculer(String nom, Double... operandes) throws CalculatriceException {
		for (Operation operation : Ensemble) {
			if (operation.getNom().equals(nom)) {
				return operation.calculer(operandes);
			}
		}
		throw new CalculatriceException("Operation non trouvee: " + nom);
	}

	public void ajouterOperation(Operation operation) {
		Ensemble.add(operation);
	}

	public void retirerOperation(Operation operation) {
		Ensemble.remove(operation);
	}
}
