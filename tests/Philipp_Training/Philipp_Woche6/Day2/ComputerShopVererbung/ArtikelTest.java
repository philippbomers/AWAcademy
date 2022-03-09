package Philipp_Training.Philipp_Woche6.Day2.ComputerShopVererbung;


import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArtikelTest {

//    @Test
//    public void testGesamtPreisFuerArtikelArray() {
//        Artikel[] artikels = new Artikel[2];
//        artikels[0] = new Prozessor(300, "Name", "AMD", "123312", 400);
//        artikels[1] = new Prozessor(300, "Name", "AMD", "123312", 400);
//        Kasse kasse1 = new Kasse();
//        assertEquals(800, kasse1.gesamtPreis(artikels));
//    }

    @Test
    public void getKassenZettel() {
        Artikel[] artikels = new Artikel[2];
        artikels[0] = new Prozessor(300, "Name", "AMD", "123312", 400);
        artikels[1] = new Prozessor(300, "Name", "AMD", "123312", 400);
        Kasse kasse2 = new Kasse();
        kasse2.gesamtPreis(artikels);
        assertEquals(100, kasse2.kassenZettel(700));
    }
}
