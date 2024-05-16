package fr.esisar.calculatrice;
/**
 * 
 * @author Maxence et le X
 * @version 1.0
 *
 */
 public class Calculatrice {
	/**
	 * On Ajoute 2 Objet entier
	 * @param operande1
	 * @param operande2
	 * @return Integer
	 * @see Integer
	 */
	public Integer ajouter(Integer operande1,Integer operande2) {
		return operande1+operande2;
	}
	
	/**
	 * On Soustrait 2 Objet entier
	 * @param operande1
	 * @param operande2
	 * @return Integer
	 * @see Integer
	 */
	public Integer soustraire(Integer operande1,Integer operande2) {
		return operande1-operande2;
	}
	
	/**
	 * On Multiple 2 Objet entier
	 * @param operande1
	 * @param operande2
	 * @return Integer
	 * @see Integer
	 */
	public Integer multiplier(Integer operande1,Integer operande2) {
		return operande1*operande2;
	}
	
	/**
	 * On Divise 2 Objet entier attention pas de division par 0
	 * @param operande1
	 * @param operande2
	 * @return Integer
	 * @see Integer
	 */
	public Integer diviser(Integer operande1,Integer operande2) {
		return operande1/operande2;
	}
}
