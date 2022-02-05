import java.util.Scanner;

public class Dawid_Brach_lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    System.out.println("Wpisz Tekst:");
        	String word = sc.nextLine();
        	
        	char[] alfabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	int przesuniecie = Integer.valueOf(args[1])%26;
	String tryb=args[0];
	int litery=word.length();
	int liczba=0;
if(tryb.equals("code"))
   {
    System.out.println();
for(int i=0; i<litery; i++)
	{
	    for(int j=0; j<26; j++)
	    {
	        if(word.charAt(i)==' ')
	        {
	        System.out.print(" ");
	        break;
	        }
	        if(word.charAt(i)==alfabet[j])
	        {
	        liczba=j+przesuniecie;
	             if(liczba>25)
	            {
	            liczba-=26;
	            }
	        System.out.print(alfabet[liczba]);
	        break;
	        }
	    }
	}
}
if(tryb.equals("decode"))
{
    System.out.println();
	for(int i=0; i<litery; i++)
	{
	    for(int j=0; j<26; j++)
	    {
	        if(word.charAt(i)==' ')
	        {
	        System.out.print(" ");
	        break;
	        }
	        if(word.charAt(i)==alfabet[j])
	        {
	        liczba=j-przesuniecie;
	             if(liczba<0)
	            {
	            liczba+=26;
	            }
	        System.out.print(alfabet[liczba]);
	        break;
	        }
	    }
	}
}
	    
	System.out.println();
	}
	

}

