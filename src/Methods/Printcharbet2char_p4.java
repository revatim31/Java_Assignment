package Methods;
public class Printcharbet2char_p4
{
	static void printLetters(char a,char b)
	{
		a = Character.toUpperCase(a);
		b = Character.toUpperCase(b);
		
		for(char i = a<b?a:b;i<=(a>b?a:b);i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printLetters('P', 'a');
	}
}