
package alakzatok;

 class Teglalap extends Negyzet {
     
     Teglalap(int x,int y)
     {
     super(x,y);
     }
    int terulet()
    {
    //System.out.println("Teglalap terulete:");
    return x * y;
    }
    int kerulet()
    {
    //System.out.println("Teglalap kerulete:");
    return (x + y) * 2;
    }
}
