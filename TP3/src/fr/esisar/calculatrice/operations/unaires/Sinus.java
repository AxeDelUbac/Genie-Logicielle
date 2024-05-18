package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.*;

public class Sinus extends OperationUnaire {

	public String getNom() {
		return "sin";
	}

	protected Double doCalculer(Double operande) {
		return Math.sin(operande);
	}
}