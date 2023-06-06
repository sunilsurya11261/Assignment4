
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        int[] frequency = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 0) {
                frequency[currentChar]++;
                result.append(currentChar);
            }
        }

        return result.toString();

	}

}
