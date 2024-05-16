package fr.esisar.calculatrice;

public class CalculatriceException extends Exception {
	private static final long serialVersionUID = 6874342431513124660L;
	private final String messageOperation;

	public CalculatriceException(String message) {
		super();
		this.messageOperation = message;
	}

	@Override
	public String toString() {
		return "CalculatriceException: " + messageOperation;
	}
}
