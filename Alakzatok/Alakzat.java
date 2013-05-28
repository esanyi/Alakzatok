package Alakzatok;

import java.util.List;

public abstract class Alakzat {

    protected int x, y;

    Integer GetX() {
        return x;
    }

    Integer GetY() {
        return y;
    }

    public Alakzat() {
        this.x = 0;
        this.y = 0;
    }

    public Alakzat(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Betolti az adatokat ebbe az alakzatba egy adatfile listabol
     *
     * @param list
     */
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
