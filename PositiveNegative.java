import java.util.Scanner;
/**
 *
 * @author THIRU
 */
public class PositiveNegative 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter a Number");
        a=s.nextInt();
        if(a<0)
            System.out.println("Negative Number");
        else if(a>0)
            System.out.println("Positive Number");
        else
            System.out.println("Zero");
    }
}
