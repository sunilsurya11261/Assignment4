import java.util.Arrays;

public class Anagram {
	public static void main(String[]args)
	{
		String s1= "a gentle man";
		String s2 = "elegant man";
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");


		char[]ar = s1.toCharArray();
		char[]ar2 = s2.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[i])
				{
				char temp = ar[i];
				ar[i] = ar[j];
				ar[j]= temp;
				}
			}
		}
		for(int i=0;i<ar2.length;i++)
		{
			for(int j=1+i;j<ar2.length;j++)
			{
				if(ar2[j]<ar2[i])
				{
					char temp = ar2[i];
					ar2[i] = ar2[j];
					ar2[j] = temp;
				}
			}
		}
		System.out.println(ar);
		System.out.println(ar2);
		if(Arrays.equals(ar,ar2))
		{
			System.out.println("It's a Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
	}

}
