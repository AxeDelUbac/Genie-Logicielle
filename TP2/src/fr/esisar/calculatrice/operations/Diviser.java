package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public class Diviser implements Operation {
	public String getNom() {
		return "/";
	}

	public Double calculer(Double operande1, Double operande2) throws CalculatriceException {
		if (operande2 == 0.0) {
			throw new CalculatriceException("Division par zero non réalisable");
		} else {
			return operande1 / operande2;
		}
	}
}
