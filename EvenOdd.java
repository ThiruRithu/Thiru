import java.util.Scanner;
/**
 *
 * @author THIRU
 */
public class EvenOdd 
{
 public static void main(String args[])
 {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter an Integer Number");
     int number=s.nextInt();
     if(number%2==0)
         System.out.println(number+" is Even Number");
     else
         System.out.println(number+" is Odd Number");
 }
}
