package aufgabe1;

public class Console implements Consolable
{

	private int zahl;

	public Console(int zahl)
	{
		this.zahl = zahl;
	}

	/**
	 * diese Methode überschreibt hashcode methode.
	 * gibt den Hashwert für das Objekt
	 */

	@Override

	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + zahl;
		return result;

	}

	/**
	 * prüft ob das angegeben Objekt mit diese Objekt übereinstimmt.
	 */
	@Override

	public boolean equals(Object obj)
	{
		if (obj instanceof Console) {
			Console d = (Console) obj;
			if (this.zahl == d.zahl) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}


	}
	
	public static void main(String[] args) {
		LinkedListImpl<Console> linkedListe = new LinkedListImpl<>();
		Console Console1 = new Console(17);
		Console Console2 = new Console(23);
		Console Console3 = new Console(38);

		linkedListe.addElem(Console1);
		linkedListe.addElem(Console2);
		linkedListe.addElem(Console3);
		ListTools.toConsole(linkedListe);
		System.out.println(linkedListe.getSize());
		linkedListe.removeElem(1);
		System.out.println(linkedListe.getSize());
		System.out.println(linkedListe.contains(Console2));
		linkedListe.getElem(0).toConsole();
	
	}
	/**
	*schreibt den Zahl auf die Konsole
	*/

	public void toConsole()
	{
		System.out.println(this.zahl);

	}

	public int getZahl()
	{
		return zahl;

	}
	
	public void setZahl (int zahl) {
		this.zahl = zahl;
		
	}



}
