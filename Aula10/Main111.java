
public class Main {

	public static void main(String[] args) {
		StringMaiuscula string = new StringMaiuscula();
		try {
			string.verificaString("Sport Club Internacional2006");
//			string.verificaString("MURILO");
		} catch (NotLetterCharacterOnStringException e) {
			System.out.println(e.getMessage());
		} catch (NotUpcaseCharacterOnStringException e) {
			System.out.println(e.getMessage());
		}

	}

}
