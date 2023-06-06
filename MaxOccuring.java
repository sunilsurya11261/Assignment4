
public class MaxOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ineuron Java";
        int[] charcount = new int[128]; 

        
        for (char ch : s.toCharArray()) {
            charcount[ch]++;
        }

        int maxCount = 0;
        for (int count : charcount) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.print("Characters with maximum occurrence: ");
        for (int i = 0; i < charcount.length; i++) {
            if (charcount[i] == maxCount) {
                System.out.print((char) i + " ");
            }
        }

	}

}
