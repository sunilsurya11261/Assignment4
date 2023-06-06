
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sunil";
        boolean hasUniqueCharacters = checkUniqueCharacters(s);

        System.out.println("String: " + s);
        System.out.println("Contains all unique characters ? \n" + hasUniqueCharacters+"!");
    }

    public static boolean checkUniqueCharacters(String str) {
        boolean[] charSet = new boolean[128]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charSet[ch])
            {
                return false; 
            }
            charSet[ch] = true; 
        }
        return true;

	}

}
