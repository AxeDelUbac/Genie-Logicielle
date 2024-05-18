package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.*;

public class Tangente extends OperationUnaire {

	public String getNom() {
		return "tan";
	}

	protected Double doCalculer(Double operande) {
		return Math.tan(operande);
	}
}
