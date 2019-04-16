package aufgabe1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

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

	@Test
	public void testSize() {
		Console console1 = new Console(11);
		Console console2 = new Console(42);
		LinkedList<Ding> linkedListe = new LinkedList<>();
		linkedListe.add(console1);
		linkedListe.add(console2);
		assertEquals(2, linkedListe.size());
	}

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
