package aufgabe1;

public class ArrayListImpl<T extends Consolable> implements Listen<T>
{
	private Object[] _array = new Object[0];
	//private final int _anfangskapazität;
	private int _size = 0;
	
	/**
	 * Initialisiert eine Array-List
	 * @param type 
	 * 				Der Typ des Arrays
	 */
	

	
	/**
	 *  Fügt ein Element am Ende ein
	 *  
	 *  @param element 
	 *  				Das Element welches gesetzt wird
	 *  @param pos 
	 *  				Die Position an welcher das Element gesetzt wird
	 */
	@Override
	public void addElem(T element) throws IllegalArgumentException
	{
		darfNichtNullSein(element);
		
		if (_array.length == _size) {
			// Typ des Arrays
			Object[] tmp = new Object[Math.max(1, _array.length * 2)];

			System.arraycopy(_array, 0, tmp, 0, _size);
			_array =  tmp;
		}
		_array[_size] = element;
		_size++;
		
	}
	
	/**
	 *  Gibt die Anzahl der Elemente in der Liste wieder
	 *  
	 *  @return _size 
	 *  				Die Größe des Arrays
	 */
	@Override
	public int getSize() 
	{
		return _size;
	}

	/**
	 *  Löscht ein Element an einer Position Stelle 
	 *  
	 *  @param pos 	
	 *  			Die Position an welcher das Elemnent gelöscht werden soll
	 */

	@Override

	public T removeElem(int pos) throws IllegalArgumentException
	{
		mussGueltigeEinfuegepositionSein(pos);
//		_array[pos] = null;
		
		@SuppressWarnings("unchecked")
		
		T entferntesElement = (T) _array[pos];

		for (int i = pos; i < _size; i++) {
			_array[i] = _array[i + 1];
		}
		_size--;
		return entferntesElement;


		
	}
		
	/**
	 * Gibt ein Element von einer beliebigen Position wieder
	 * 
	 * @param pos 
	 * 				Die Position von welcher das Element zurückgegeben werden soll
	 * 
	 * @return gesuchtesElement
	 *							Das gesuchte Element 								
	 */
	@SuppressWarnings("unchecked")
	@Override

	public T getElem(int pos) throws IllegalArgumentException
	{
		mussGueltigeEinfuegepositionSein(pos);
		
		return (T) _array[pos];
	}
		
	/**
	 * prüft ob das angegebene Elemnt vorhanden ist.
	 * @param elem
	 * 				Das Element welches gesucht werden soll.
	 * @return 
	 *           false oder true
	*/
	public boolean contains(T elem) {
		for (int i = 0; i < _size; i++) {
			@SuppressWarnings("unchecked")
			T aktuell = (T) _array[i];
			if (aktuell == elem) {
				return true;
			}

		}
		return false;
	}


		
		
			
	
	
	/**
     * Wirft eine IllegalArgumentException, falls die uebergebene Element-Referenz null ist.
     */
    private  void darfNichtNullSein(T element)
    {
        if (element == null)
        {
            throw new IllegalArgumentException("Die Titel-Referenz darf nicht null sein.");
        }
    }
    
    /**
	 * Prüft ob die übergebene Position gültig ist
	 * 
	 * @param pos
	 * 				Die übergebene Position
	 * 
	 * @throws IllegalAccessException
	 */
	private void mussGueltigeEinfuegepositionSein(int pos) throws IllegalArgumentException
	{
		if(pos < 0 && pos > _array.length)
		{
			throw new IllegalArgumentException("Ungültige Position");
		}
	}
}
