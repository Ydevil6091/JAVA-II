import java.util.*;

class Set_B_2 {
    public static void main(String[] args) {
// creating an Array List named colors
        HashMap<Long, String> ht = new HashMap
                <Long, String>();

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\n Enter  number records  :  ");
        n = sc.nextInt();

        System.out.print("\n Enter Mob  StuName: \n  ");
        for (int i = 1; i <= n; i++) {
            System.out.print("\n Record " + i + " : ");
            ht.put(sc.nextLong(), sc.next());

        }
        System.out.print("\n Before Sorting   ---> \n ");
        for (long k : ht.keySet())
            System.out.print("\nMob No  : " + k + "   StuName : " + ht.get(k) + "\n");

        TreeMap<Long, String> tm = new TreeMap<Long, String>(ht);

        System.out.print("\n After Sorting  ----> \n  ");
        for (long p : tm.keySet())
            System.out.print("\nMob No  : " + p + "   StuName : " + tm.get(p) + "\n");


    }
}

