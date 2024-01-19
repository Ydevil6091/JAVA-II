import java.util.*;

class HashTable {
    public static void main(String[] args) {
// creating an Array List named colors
        Hashtable<Long, String> ht = new Hashtable
                <Long, String>() ;

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\n Enter  number records  :  ");
        n = sc.nextInt();

        System.out.print("\n Enter Mob  StuName: \n  ");
        for (int i = 1; i <= n; i++) {
            System.out.print("\n Record " + i + " : ");
            ht.put(sc.nextLong(), sc.next());

        }
        //Set set = ht.entrySet();
        //print
        System.out.print("\n Contact List  : \n  ");

        for (long k : ht.keySet())
            System.out.print("\nMob No  : " + k + "   StuName : " + ht.get(k) +"\n");
	
		
		
/*		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map. Entry entry = (Map. Entry) itr.next();

			System.out.print("\nMob No  : " + entry.getKey() + "   StuName : " + entry.getValue() +"\n");
		}*/


    }
}