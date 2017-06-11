import java.util.Scanner;
public class Sum_Of_N_Numbers {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter a Number");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Total: "+sum);
    }
}
