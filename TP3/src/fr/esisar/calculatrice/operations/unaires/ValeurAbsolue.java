package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.*;

public class ValeurAbsolue extends OperationUnaire {

	public String getNom() {
		return "abs";
	}

	protected Double doCalculer(Double operande) {
		return Math.abs(operande);
	}
}
