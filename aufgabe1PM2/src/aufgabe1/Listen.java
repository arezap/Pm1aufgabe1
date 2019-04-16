package aufgabe1;

public interface Listen<T>
{
	/**
	 *  Gibt die Anzahl der Elemente in der Liste wieder
	 * @return 
	 * 			Die Anzahl der Elemente in der Liste
	 * 
	 */
	public int getSize();
	
	/**
	 *  Fügt ein Element am Ende der Liste.
	 * @param elem
	 * 				Das Element welches eingefügt werden soll
	 *
	 */
	public void addElem(T elem) ;

	/**
	 * Löscht ein Element aus der Liste
	 * @param pos
	 * 				Die Position an welcher das Element eingefügt werden soll
	 * @return angegebene Element
	 * @throws IllegalArgumentException
	 */
	public T removeElem(int pos) throws IllegalArgumentException;
	
	/**
	 * Gibt ein Element von einer beliebigen Position wieder
	 * @param pos
	 * 				Die Position von welcher das Element wiedergegeben werden soll
	 * 
	 * @return
	 * 				Das gesuchte Element
	 * 
	 * @throws IllegalArgumentException
	 */
	public T getElem(int pos) throws IllegalArgumentException;
	
	/**
	 * prüft ob das angegebene Elemnt vorhanden ist.
	 * @param elem
	 * 				Das Element welches gesucht werden soll.
	 * @return 
	 *           false oder true
	 */
	public boolean  contains(T elem); 

}
