import java.util.*;

class Set_A_1{
    public static void main(String[] args) {

        ArrayList Al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\n Enter  number of  cities :  ");
        n=sc.nextInt();

        System.out.print("\nEnter Cities : \n  ");
        for(int i=1;i<=n;i++)
        {
            System.out.print("\n citie " +i +" : ");
            Al.add(sc.next());

        }
        //print
        System.out.print("\n Elements of Arraylist : \n  ");
        System.out.println(Al);

        System.out.print("\n Enter  particular  element to remove:  ");
        String k =sc.next();
        for(int i=1;i<=n;i++)
        {
            if(Al.contains(k))
            {
                Al.remove(k);
                System.out.print("\n Element " +k+ " is removed  \n  ");
                break;

            }
            else
            {
                System.out.print("\n Element " +k+ " is not found  \n  ");
                break;

            }

        }

        System.out.print("\n Elements of Arraylist  after removing element " +k+ " are \n  ");
        System.out.println(Al);

        //remove
       // Al.clear();
        //System.out.print("\n Arraylist after removing all elements : \n  ");
        //System.out.println(Al);

    }
}