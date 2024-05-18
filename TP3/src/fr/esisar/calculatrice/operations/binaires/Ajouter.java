package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.*;

public class Ajouter extends OperationBinaire {
	public String getNom() {
		return "+";
	}

	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1 + operande2;
	}
}
