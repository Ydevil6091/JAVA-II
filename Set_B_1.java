import java.util.*;

class Set_B_1
{
    public static void main(String[] args) {
// creating Ts
        Set_B_1 ts = new Set_B_1();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\n Enter  how many Integers   :  ");
        n=sc.nextInt();

        System.out.print("\nEnter " + n + " Integers \n");
        for(int i=1;i<=n;i++)
        {
            System.out.print("\n Integer " +i +" : ");
            //ts.add(sc.nextInt());

        }
        //in ts duplicated elements are not allowd and sorting is by default Acsending
        //print
        System.out.print("\n Elements of Treeset : \n\n  ");
        System.out.println(ts);
        //remove


    }
}