
package alakzatok;

import java.util.List;

/**
 *
 * @author egyed.sandor_1
 */
class Negyzet extends Alakzat {
    
public void loadFromList(List<Integer> list) {
        list.add(x,y);
        System.out.println("hozzáadva");
    }    
    
 Negyzet(int x, int y){
 super(x,y);    
 }
 int terulet()
 {
 //System.out.println("Negyzet terulete:");
 return x * x;
 }
 int kerulet()
 {
 //System.out.println("Negyzet kerulete:");
 return x * 4;
 }
 
 
}
