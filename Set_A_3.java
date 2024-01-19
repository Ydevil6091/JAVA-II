import java.util.*;

class Treeset{
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\n Enter  number records  :  ");
        n=sc.nextInt();

        System.out.print("\nEnter Color names : \n  ");
        for(int i=1;i<=n;i++)
        {
            System.out.print("\n Color " +i +" : ");
            ts.add(sc.next());

        }
        //print
        System.out.print("\n Elements of Treeset : \n\n  ");
        System.out.println(ts);
        //remove


    }
}