package alakzatok;

import java.util.List;

public abstract class Alakzat {
    /**
     * Betolti az adatokat ebbe az alakzatba egy adatfile listabol
     *
     * @param list
     */
    private int x,y;
    
    int GetX() { return x; }
    int GetY() { return y; }
    
    public Alakzat(int x, int y)
    {
    this.x = x;
    this.y = y;
    }
    
    public abstract void loadFromList(List<Integer> list);

    /**
     * Megmondja az alakzat teruletet.
     *
     * @return
     */
    public abstract Integer terulet();

  
    /**
     * Megmondja az alakzat keruletet.
     *
     * @return
     */
    
    public abstract Integer kerulet();
}
