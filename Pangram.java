
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String s="The Quick Brown Fox Jumps Over Lazy Dog";
		String s1 = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s1 =s1+(char)(s.charAt(i)+32);
			}
			else
			{
				s1+=(char)(s.charAt(i));
			}
		}
		s1=s1.replace(" ","");

		char[] ch=s1.toCharArray();
		int[] ar=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-97;
			ar[index]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not a panagram");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("It's a panagram");
		}

	}

}
