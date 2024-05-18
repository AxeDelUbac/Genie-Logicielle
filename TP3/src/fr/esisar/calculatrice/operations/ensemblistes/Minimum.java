package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.*;

public class Minimum extends OperationEnsembliste {

	public String getNom() {
		return "min";
	}

	protected Double doCalculer(Double operandes[]) {
		Double min = operandes[0];
		for (Double valeur : operandes) {
			if (valeur < min) {
				min = valeur;
			}
		}
		return min;
	}
}
