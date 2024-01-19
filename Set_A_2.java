import java.util.*;

class Set_A_2 {
    public static void main(String[] args) {
// creating an Array List named colors
        LinkedList ll= new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\n Enter  number records  :  ");
        n=sc.nextInt();

        System.out.print("\nEnter Friends names : \n  ");
        for(int i=1;i<=n;i++)
        {
            System.out.print("\n Friend" +i +" : ");
            ll.add(sc.next());

        }
        //print
        System.out.print("\n Elements of LinkedList : \n\n  ");
        System.out.println(ll);
        //remove


    }
}