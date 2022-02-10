/**
 * Eine Zeile Code
 * Schreibe den folgenden Code in einer Zeile. Das Ergebnis soll dabei erhalten bleiben.
 * double x = 15.5;
 * double a = Math.sqrt(3.5 + x);
 * double b = a * 5;
 * double c = b / 3;
 * double d = x + 10;
 * double e = x - 4.1;
 * double f = d * e;
 * double g = c - f;
 * System.out.println(g);
 * <p>
 * [Result: -283.4351684274322]
 */

package Philipp_Woche2.Operators;

public class OneCodeLine {
    public static void main() {
        System.out.println(((Math.sqrt(3.5 + 15.5) * 5) / 3) - ((15.5 + 10) * (15.5 - 4.1)));
    }
}
