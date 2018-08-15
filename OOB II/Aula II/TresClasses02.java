public class TresClasses02{

	public static void main(String[] args) {
		Letra a = new Letra('A', null);
		Letra b = new Letra('B', a);
		Letra c = new Letra('C', b);

		a.start();
		b.start();
		c.start();
	}
}
