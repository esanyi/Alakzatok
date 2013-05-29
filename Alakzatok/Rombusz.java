
package alakzatok;


class Rombusz extends Negyzet {
    
    Rombusz(int x,int y)
    {
        super(x,y);
    }

 int terulet()
    { 
    //System.out.println("Rombusz terulete:");
    // y esetében a magasságot kell érteni
    return x * y;
    }
    int kerulet()
    {
    //System.out.println("Rombusz kerulete:");
    return x * 4;
    }
}
