package aufgabe1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	/**
	 * diese Methode testet ob die Elemente eingefügt worden sind.
	 */

	@Test
	public void testAdd() {
		Console console1 = new Console(11);
		Console console2 = new Console(42);
		Console console3 = new Console(55);
		LinkedList<Console> linkedListe = new LinkedList<>();
		linkedListe.add(console1);
		linkedListe.add(console2);
		linkedListe.add(console3);
		assertEquals(console3, linkedListe.get(2));

	}
	
	
         /**
	 * diese Methode testet ob der Anzahl angegebene elemente mit Anzahl der
	 * elemente in der Liste das gleiche ist .
	 */

	@Test
	public void testSize() {
		Console console1 = new Console(11);
		Console console2 = new Console(42);
		LinkedList<Ding> linkedListe = new LinkedList<>();
		linkedListe.add(console1);
		linkedListe.add(console2);
		assertEquals(2, linkedListe.size());
	}
	
	/**
	 * diese Methode testet ob das gesuchte Element an der angegebene Position
	 * mit der zurück gegebenes Elment übereinstimmt.
	 */

	@Test
	public void testGet() {
		Console console1 = new Console(11);
		Console console2 = new Console(42);
		Console console3 = new Console(55);
		LinkedList<Ding> linkedListe = new LinkedList<>();
		linkedListe.add(console1);
		linkedListe.add(console2);
		linkedListe.add(console3);
		assertEquals(console2, linkedListe.get(1));
	}
	/**
	 * diese Methode testet ob das angegebene Element an der angegebene Position
	 * gelöscht worden ist.
	 */

	@Test
	public void testRemove() {
		Console console1 = new Console(11);
		Console console2 = new Console(42);
		Console console3 = new Console(55);
		LinkedList<Ding> linkedListe = new LinkedList<>();
		linkedListe.add(console1);
		linkedListe.add(console2);
		linkedListe.add(console3);
		assertEquals(console3, linkedListe.remove(2));
	}
	
	/**
	 * diese Methode testet ob das gesuchte Element Vorhanden ist worden ist..
	 */

	@Test
	public void testContains() {
		Console console1 = new Console(11);
		Console console2 = new Console(42);
		Console console3 = new Console(55);
		LinkedList<Ding> linkedListe = new LinkedList<>();
		linkedListe.add(console1);
		linkedListe.add(console3);
		assertEquals(false, linkedListe.contains(console2));
	}
}
