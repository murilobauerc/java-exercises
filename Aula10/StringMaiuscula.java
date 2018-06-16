
public class StringMaiuscula {
	public static void verificaString(String string) throws NotLetterCharacterOnStringException, NotUpcaseCharacterOnStringException{
		for(int i=0; i < string.length(); i++){
			if(!Character.isLetter(string.charAt(i))){
				throw new NotLetterCharacterOnStringException("Existe um caractere que não é uma letra.");
			}
		}
		for(int i=0; i < string.length(); i++){
			if(!Character.isUpperCase(string.charAt(i))){
				throw new NotUpcaseCharacterOnStringException("Alguma das letras da string não é uma maiúscula.");
			}
		}
		System.out.println("String: " +string);
	}

}
