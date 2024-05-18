package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationUnaire implements Operation {

	protected abstract Double doCalculer(Double operandes) throws CalculatriceException;

	public Double calculer(Double... operande) throws CalculatriceException {
		if (operande.length != 1) {
			throw new CalculatriceException("Operation unaire nécessite exactement 1 operande.");
		}
		return doCalculer(operande[0]);
	}
}