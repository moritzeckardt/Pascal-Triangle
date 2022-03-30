public interface BinomialInterface {

	/**
	 * Berechnet den Binomialkoeffizienten mit der geschlossenen Formel. Stellen
	 * Sie sicher, dass Ueberlaeufe so lange wie moeglich vermieden werden.
	 * 
	 * @param k
	 * @param n
	 * @return k-aus-n
	 */
	public long binomial(int k, int n);

	/**
	 * Berechnet den Binomialkoeffizienten mit einer kaskadenartigen Rekursion.
	 * 
	 * @param k
	 * @param n
	 * @return k-aus-n
	 */
	public long binomialRec(int k, int n);

	/**
	 * Berechnet den Binomialkoeffizienten, indem rekursiv die benoetigten
	 * Eintraege das Pascal-Dreiecks in einer Tabelle berechnet werden.
	 * 
	 * @param k
	 * @param n
	 * @return k-aus-n
	 */
	public long binomialRecPascal(int k, int n);

}
