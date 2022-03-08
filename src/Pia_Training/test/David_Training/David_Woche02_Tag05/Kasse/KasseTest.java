package Pia_Training.test.David_Training.David_Woche02_Tag05.Kasse;

import David_Training.Training_Week02.Training_Day05.Kasse;
import David_Training.Training_Week02.Training_Day05.Produkt;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class KasseTest {

    @Test
    public void einfacherZwischensummeTest() {
        Kasse kasse = new Kasse();
        assertEquals(0, kasse.getZwischensumme());
    }

    @Test
    public void einfacherScanTest() {
        Kasse kasse = new Kasse();
        for (int i = 0; i < 10; i++) {
            Produkt produkt = new Produkt("", i);
            kasse.scan(produkt);
        }
        assertEquals(45, kasse.getZwischensumme());
    }

    @Test
    public void einfacherBezahlenTest() {
        Kasse kasse = new Kasse();
        Produkt produkt = new Produkt("", 50);
        kasse.scan(produkt);
        assertEquals(50, kasse.bezahlen());
        assertEquals(0, kasse.getZwischensumme());
    }

    @Test
    public void einfacherBezahlenMitWechselgeldTest() {
        Kasse kasse = new Kasse();
        Produkt produkt = new Produkt("", 50);
        kasse.scan(produkt);
        assertEquals(-10, kasse.bezahlen(60));
        assertEquals(0, kasse.getZwischensumme());
    }

}
