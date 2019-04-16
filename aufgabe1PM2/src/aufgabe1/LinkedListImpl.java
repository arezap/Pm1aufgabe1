package aufgabe1;

public class LinkedListImpl <T extends Consolable> implements Listen<T>
{
	
		Knoten<T> erster = null;
		
		
		/**
		 * Fügt ein Element am Ende der Liste ein
		 * 
		 * @param elem
		 *            Das Element welches eingefügt wird	
                 **/

		@Override
		public void addElem(T elem) {
			if (this.erster == null) {
				this.erster = new Knoten<T>(elem);
			} else {
				Knoten<T> index = this.erster;
				while (index._nachfolger != null) {
					index = index._nachfolger;
				}
				index._nachfolger = new Knoten<T>(elem);

			}

		}

		
		/**
		 * Gib die Laenge der Liste zurueck.
		 * 
		 * @return Anzahl der Elemente in der Liste.
		 */
		@Override
		public int getSize()
		{

			if (this.erster == null) {
				return 0;
			} else {
				int zaehler = 0;
				Knoten<T> tmp = this.erster;
				while (tmp != null) {
					tmp = tmp._nachfolger;

					zaehler++;
				}
				return zaehler;
			}

		}

		/**
		 * Fügt ein Element in die Liste an einer bestimmten Position ein
		 * 
		 * @param elem
		 *            Das Element welches eingefügt wird
		 * 
		 * @param pos
		 *            Die Position an welcher das Element eingefügt wird
		
**/
		
		@Override
		public T removeElem(int index) throws IllegalArgumentException {
			if (index < this.getSize()) {
				Knoten<T> k = this.erster;
				Knoten<T> tmp = null;

				if (index == 0) {
					k = this.erster;
					this.erster = k._nachfolger;
				} else {
					for (int zaehler = 0; zaehler < index - 1; zaehler++) {
						k = k._nachfolger;
					}
					tmp = k._nachfolger;
					k._nachfolger = k._nachfolger._nachfolger;
					k = tmp;
				}

				return k._element;

			} else {
				throw new IllegalArgumentException();
			}
		}
	
		
		
		
		
		/**
		 * Gibt ein Element an einer bestimmten Position wieder
		 * 
		 * @return Das gesucht Element wird zurückgegeben
		 */
		@Override
		public T getElem(int index) throws IllegalArgumentException
		{
			if (index < this.getSize()) {
				Knoten<T> k = null;
				for (int zaehler = 0; zaehler <= index; zaehler++) {
					if (zaehler == 0) {
						k = this.erster;
					} else {
						k = k._nachfolger;
					}
				}
				return k._element;
			} else {
				throw new IllegalArgumentException();
			}

		}
		
		
		/**
		 * Vergleicht ob das Object in der List enthalten ist 
		 */

		@Override
		public boolean contains(T element) {
			Knoten<T> k = this.erster;
			boolean contain = false;
			while (k != null && !contain) {
				// Prüfen ob es das gleiche element ist
				contain = k._element.equals(element);

				k = k._nachfolger;
			}

			return contain;
		}

		
		
		
		/**
		 * Prüft ob die übergebene Position gültig ist
		 * 
		 * @param pos
		 *            Die übergebene Position
		 * 
		 * @throws IllegalAccessException
		 *
		private void mussGueltigeEinfuegepositionSein(int pos)
				throws IllegalArgumentException
		{
			if (pos < 0 && pos > _size)
			{
				throw new IllegalArgumentException("Ungültige Position");
			}
		}

		/**
		 * Wirft eine IllegalArgumentException, falls die uebergebene
		 * Element-Referenz null ist.
		 *
		private void darfNichtNullSein(T element) throws IllegalArgumentException
		{
			if (element == null)
			{
				throw new IllegalArgumentException(
						"Die Titel-Referenz darf nicht null sein.");
			}
		}

		**/
}
