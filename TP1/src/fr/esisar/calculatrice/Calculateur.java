package fr.esisar.calculatrice;

/**
 * 
 * @author Maxence et le X
 * @version 1.0
 *
 */
public class Calculateur {

	public static void main(String[] args) {
		Calculatrice Calcul = new Calculatrice();
		Integer Op1=3;
		Integer Op2=9;
		Integer Entier =Calcul.soustraire(Op1,Op2);
		System.out.println(Entier);

	}

}
