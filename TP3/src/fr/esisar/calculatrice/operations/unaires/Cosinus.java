package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.*;

public class Cosinus extends OperationUnaire {

	public String getNom() {
		return "cos";
	}

	protected Double doCalculer(Double operande) {
		return Math.cos(operande);
	}
}
