package Pia_Training.test.Philipp_Training.Philipp_Woche6.Day1.Kasse;

import Philipp_Training.Philipp_Woche6.Day1.Kasse.Kasse;
import Philipp_Training.Philipp_Woche6.Day1.Kasse.Produkt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KasseTest {
    @Test
    public void checkProductName() {
        Produkt produkt = new Produkt("Loeffel", 100);
        assertEquals("Loeffel", produkt.getName());
    }

    @Test
    public void checkProductPrice() {
        Produkt produkt = new Produkt("Loeffel", 100);
        assertEquals(100, produkt.getPreis());
    }

    @Test
    public void checkZwischenSummeMitEinemProdukt() {
        Kasse kasse = new Kasse();
        Produkt produkt = new Produkt("Loeffel", 100);
        kasse.scan(produkt);
        assertEquals(100, kasse.getZwischensumme());
    }

    @Test
    public void checkZwischenSummeMitMehrerenProdukten() {
        Kasse kasse = new Kasse();
        Produkt produkt = new Produkt("Loeffel", 100);
        kasse.scan(produkt);
        Produkt produkt2 = new Produkt("Gabel", 50);
        kasse.scan(produkt2);
        assertEquals(150, kasse.getZwischensumme());
    }

    @Test
    public void checkBezahlen() {
        Kasse kasse = new Kasse();
        Produkt produkt = new Produkt("Loeffel", 100);
        kasse.scan(produkt);
        Produkt produkt2 = new Produkt("Gabel", 50);
        kasse.scan(produkt2);
        kasse.bezahlen(25);
        assertEquals(125, kasse.getZwischensumme());
    }

    @Test
    public void checkBezahlenWechselgeld() {
        Kasse kasse = new Kasse();
        Produkt produkt = new Produkt("Loeffel", 100);
        kasse.scan(produkt);
        Produkt produkt2 = new Produkt("Gabel", 50);
        kasse.scan(produkt2);
        kasse.bezahlen(25);
        assertEquals(125, kasse.getZwischensumme());
    }
}
