package aufgabe1;

public class ListTools
{
	/**
	 * statische Methode gibt jedes Element einer Liste auf der Konsole aus
	 */
	public static void toConsole(Listen<? extends Consolable> l) {
		for (int i = 0; i < l.getSize(); i++) {
			l.getElem(i).toConsole();
		}
	}
	
	


}
