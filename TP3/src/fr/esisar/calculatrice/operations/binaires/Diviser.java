package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.*;
import fr.esisar.calculatrice.CalculatriceException;

public class Diviser extends OperationBinaire {
	public String getNom() {
		return "/";
	}

	protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
		if (operande2 == 0.0) {
			throw new CalculatriceException("Division par zero non réalisable");
		} else {
			return operande1 / operande2;
		}
	}
}
