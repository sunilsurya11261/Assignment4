
public class StringPalindrome {

	public static void main(String[] args) {
		String num = "2002";
		String num2="";
		for(int i=num.length()-1;i>=0;i--)
		{
			num2=num2+num.charAt(i);
		}
		if(num2.equals(num))
		{
			System.out.println(num2+" is a Palindrome");
		}
		else
		{
			System.out.println(num2+" is Not a Palindrome");
		}
	}

}
