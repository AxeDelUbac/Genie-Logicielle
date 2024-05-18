package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationEnsembliste implements Operation {

	protected abstract Double doCalculer(Double operandes[]) throws CalculatriceException;

	public Double calculer(Double... operandes) throws CalculatriceException {
		if (operandes.length == 0) {
			throw new CalculatriceException("Operation ensembliste nécessite au moins 1 operande.");
		}
		return doCalculer(operandes);
	}
}