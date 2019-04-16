package aufgabe1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListImplTest
{
	/**
	 * diese Methode testet ob die Elemente eingefügt werden.
	 */
	@Test
	public void testAdd()
	{
		Console Console1 = new Console(11);
		Console Console2 = new Console(42);
		Console Console3 = new Console(55);
		ArrayListImpl<Console> liste = new ArrayListImpl<>();
		liste.addElem(Console1);
		liste.addElem(Console2);
		liste.addElem(Console3);
		assertEquals(Console3, liste.getElem(2));

	}

	/**
	 * diese Methode testet ob der Anzahl angegebene elemente mit Anzahl der
	 * elemente in der Liste das gleiche ist .
	 */
	@Test
	public void testSize()
	{
		Console Console1 = new Console(11);
		Console Console2 = new Console(42);
		ArrayListImpl<Console> liste = new ArrayListImpl<>();
		liste.addElem(Console1);
		liste.addElem(Console2);
		assertEquals(2, liste.getSize());
	}

	/**
	 * diese Methode testet ob das gesuchte Element an der angegebene Position
	 * mit der zurück gegebenes Elment übereinstimmt.
	 */

	@Test
	public void testGet()
	{
		Console Console1 = new Console(11);
		Console Console2 = new Console(42);
		Console Console3 = new Console(55);
		ArrayListImpl<Console> liste = new ArrayListImpl<>();
		liste.addElem(Console1);
		liste.addElem(Console2);
		liste.addElem(Console3);
		assertEquals(Console2, liste.getElem(1));
	}

	/**
	 * diese Methode testet ob das angegebene Element an der angegebene Position
	 * gelöscht worden ist..
	 */

	@Test
	public void testRemove()
	{
		Console Console1 = new Console(11);
		Console Console2 = new Console(42);
		Console Console3 = new Console(55);
		ArrayListImpl<Console> liste = new ArrayListImpl<>();
		liste.addElem(Console1);
		liste.addElem(Console2);
		liste.addElem(Console3);
		assertEquals(Console3, liste.removeElem(2));
	}

	/**
	 * diese Methode testet ob das gesuchte Element Vorhanden ist worden ist..
	 */
	@Test
	public void testContains()
	{
		Console Console1 = new Console(11);
		Console Console2 = new Console(42);
		Console Console3 = new Console(55);
		ArrayListImpl<Console> liste = new ArrayListImpl<>();
		liste.addElem(Console1);
		liste.addElem(Console3);
		assertEquals(false, liste.contains(Console2));
	}

}
