import java.util.Scanner;
public class VowelConsonant 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char c;
        System.out.println("Enter any character");
        c=s.next().charAt(0);
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
            System.out.println(c+" is Vowel");
        else
            System.out.println(c+" is Consonant");
    }
}
