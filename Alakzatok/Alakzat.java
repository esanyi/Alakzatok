
package alakzatok;

import java.util.List;

/**
 *
 * @author egyed.sandor_1
 */
abstract class Alakzat
{
int x,y;   

   

Integer GetX()
{
return x;
}
Integer GetY()
{
return y;
}
public Alakzat()
{
this.x = 0;
this.y = 0;
}

Alakzat(int x, int y)
{
this.x = x;
this.y = y;
} 

public abstract void loadFromList(List<Integer> list);


abstract int terulet();

abstract int kerulet();

}
