package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.*;

public class Maximum extends OperationEnsembliste {

	public String getNom() {
		return "max";
	}

	protected Double doCalculer(Double operandes[]) {
		Double max = operandes[0];
		for (Double valeur : operandes) {
			if (valeur > max) {
				max = valeur;
			}
		}
		return max;
	}
}
