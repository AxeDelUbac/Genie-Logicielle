package fr.esisar.calculatrice.operations;

public class Soustraire implements Operation {
	public String getNom() {
		return "-";
	}

	public Double calculer(Double operande1, Double operande2) {
		return operande1 - operande2;
	}
}
