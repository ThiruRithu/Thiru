import java.util.Scanner;
public class LargestNumber {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Three Numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b && a>c)
            System.out.println("a is biggest");
        if(b>c && b>a)
            System.out.println("b is biggest");
        else
            System.out.println("c is biggest");
    }    
}
