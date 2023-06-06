
public class Duplicates {
	public static void main(String[]args)
	{
		String s="Ineuron Java";
		String s1 = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s1+=(char)(s.charAt(i)+32);
			}
			else
			{
				s1+=(char)(s.charAt(i));
			}
		}
		s1 = s1.replace(" ", "");
		boolean flag=false;
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("The string duplicates are:"+ch[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag=false)
		{
			System.out.println("No duplicates are found");
		}
	}
}
