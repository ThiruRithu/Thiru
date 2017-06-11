import java.util.Scanner;
public class AlphaOrNot {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(Character.isLetter(c))
            System.out.println(c+" is a Alphabet");
        else
            System.out.println(c+" is Not an Alphabet");
    }
}
