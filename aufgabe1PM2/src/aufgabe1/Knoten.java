package aufgabe1;

	/**
	 * Die Klasse modelliert doppelt verkettbare Knoten.
	 * 
	 * @author Arezoo Pashaeefam	
	 *         Pouria Jahan
	 *         
	 * @version 23.10.2018
	 */
	public class Knoten<T>
	{
		
		protected  T _element = null;
		protected Knoten<T> _nachfolger = null;
		
		/**
		 * Erzeugt einen Knoten und es wird Typ, Vorgaenger, Nachfolger gesetzt
		 * 
		 *  @param typ 
		 *        		Der Typ welcher dem Knoten zugeordnet werden kann
		 *  @param vorgaenger 
		 *        		Der vorherige Knoten
		 *  @param nachfolger 
		 *        		Der nachfolgende Knoten
		 * 
		 */
		
		/**
		 * Erzeugt ein DoppellinkKnoten ohne Element und Verkettungen
		 */
		
		public Knoten(T element)
		{
			
			this._element = element;
			this._nachfolger = null;
		}
		
		/**
		 * Setzt den Nachfolger des Knotens
		 * 
		 * @param nachfolger
		 * 						Der nachfolgende Knoten
		 */
		public void setNachfolger(Knoten<T> nachfolger)
		{
			this._nachfolger = nachfolger;
		}
		
		/**
		 * Gibt den Nachfolger des Knotens zurück
		 * 
		 * @return _nachfolger
		 * 						Der nachfolgende Knoten
		 */
		public Knoten<T> getNachfolger()
		{
			return _nachfolger;
		}
		
		
		/**
		 * Setzt das Element des Knotens 
		 * 
		 * @param element
		 * 					Das Element des Knotens
		 */
		public void setElem(T element)
		{
			_element = element;
		}
		
		/**
		 * Gibt das Element des Knotens zurück
		 * 
		 * @return _element
		 * 					Das zurückgegebene Element des Knotens
		 */
		public T getElem()
		{
			return _element;
		}
		
		@Override
		public String toString() {
			return _element.toString();
		}
	}



