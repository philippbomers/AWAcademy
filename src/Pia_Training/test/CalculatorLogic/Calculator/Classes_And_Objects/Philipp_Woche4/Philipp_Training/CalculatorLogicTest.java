package Pia_Training.test.CalculatorLogic.Calculator.Classes_And_Objects.Philipp_Woche4.Philipp_Training;

import Philipp_Training.Philipp_Woche4.Classes_And_Objects.Calculator.CalculatorLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CalculatorLogicTest {

    @Test
    public void ergebnisIstAnfangs0() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        assertEquals("0", taschenrechner.getErgebnis());
    }

    @Test
    public void simpleAddition() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.plus(4);
        assertEquals("4", taschenrechner.getErgebnis());
    }

    @Test
    public void simpleSubtractition() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.minus(5);
        assertEquals("-5", taschenrechner.getErgebnis());
    }

    @Test
    public void simpleDivision() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.plus(5);
        taschenrechner.geteilt(5);
        assertEquals("1", taschenrechner.getErgebnis());
    }

    @Test
    public void simpleMultiplication() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.plus(5);
        taschenrechner.mal(2);
        assertEquals("10", taschenrechner.getErgebnis());
    }

    @Test
    public void simpleTestAll() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.plus(5);
        taschenrechner.mal(2);
        taschenrechner.minus(4);
        taschenrechner.geteilt(2);
        assertEquals("3", taschenrechner.getErgebnis());
    }

    @Test
    public void simpleTestAllWith1000() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.plus(5000);
        taschenrechner.mal(2000);
        taschenrechner.geteilt(2000);
        taschenrechner.minus(4000);
        assertEquals("1000", taschenrechner.getErgebnis());
    }

//    @Test
//    public void simpleAdditionWithNegativeNumber() {
//        CalculatorLogic taschenrechner = new CalculatorLogic();
//        taschenrechner.plus(-27);
//        assertEquals("-26", taschenrechner.getErgebnis());
//    }

    @Test
    public void simpleAdditionWithBillions() {
        CalculatorLogic taschenrechner = new CalculatorLogic();
        taschenrechner.plus(1_000_000_000);
        assertEquals("1000000000", taschenrechner.getErgebnis());
    }

//    @Test
//    public void simpleDivisionWith0() {
//        CalculatorLogic taschenrechner = new CalculatorLogic();
//        taschenrechner.geteilt(0);
//        assertNull(null, taschenrechner.getErgebnis());
//    }
}
