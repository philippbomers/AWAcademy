package test.David_Training.David_Woche02.Tag_05.Produkt;

import David_Training.Training_Week02.Training_Day05.Produkt;
import org.junit.Test;

import static junit.framework.Assert.*;

public class ProduktTest {

    @Test
    public void einfacherNameTest() {
        Produkt produkt = new Produkt("", 0);
        assertEquals("", produkt.getName());
    }

    @Test
    public void einfacherPreisTest() {
        Produkt produkt = new Produkt("", 200);
        assertEquals(200, produkt.getPreis());
    }

}
