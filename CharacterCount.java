
public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Virtual Machine!";
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharCount = 0;

       

        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);

            if (isVowel(ch)) {
                vowelCount++;
            } else if (isConsonant(ch)) {
                consonantCount++;
            } else if (isSpecialCharacter(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("String: " + s);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("Special character count: " + specialCharCount);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }

    public static boolean isSpecialCharacter(char ch) {
        return !(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9') && !Character.isWhitespace(ch);

	}

}
