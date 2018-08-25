
public class TresClasses {

	public static void main(String[] args) {
		
		ClasseA a = new ClasseA();
		ClasseB b = new ClasseB(a);
		ClasseC c = new ClasseC(b);
		
		a.start();
		b.start();
		c.start();

	}

}
