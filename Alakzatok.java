package alakzatok;

import java.util.ArrayList;
import java.util.List;


public class Alakzatok {

  
    public static void main(String[] args) {
        
        
        Negyzet n = new Negyzet(3,2);
        Teglalap t = new Teglalap(3,5);
        Rombusz r = new Rombusz(3,2);
        Alakzat a;
        Alakzat b;
        Alakzat c;
        a = n;
        b = t;
        c = r;
        System.out.println(a.terulet());
        System.out.println(a.kerulet());
        System.out.println(b.terulet());  
        System.out.println(b.kerulet());
        System.out.println(c.terulet());
        System.out.println(c.kerulet());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
    }
}
