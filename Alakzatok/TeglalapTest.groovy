package Alakzatok

class TeglalapTest {

    void testTerulet() {
        Teglalap t = new Teglalap(2, 2);
        assertEquals('A 2x2 teglalap terulete legyen 4', 4, t.terulet());
    }

    void testKerulet() {
        Teglalap t = new Teglalap(2, 2);
        assertEquals('A 2x2 teglalap kerulete legyen 8', 8, t.kerulet());
    }
}
