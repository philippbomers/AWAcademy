public class KlassenUndObjekte {

    public static void main(String[] args) {

        //Test Taschenrechner

        KlasseTaschenrechner taschenrechner = new KlasseTaschenrechner();
        taschenrechner.plus(8);
        taschenrechner.mal(2);
        taschenrechner.geteilt(4);
        System.out.println("Das Ergebnis beträgt: " + taschenrechner.getErgebnis());


        //Computer erstellen und Eigenschaften ausgeben
        KlasseComputershop computer = new KlasseComputershop("HP", 20, true);
        computer.setArbeitsspeicherGB(200);
        System.out.println(computer.toString());

        //Speichererweiterung
        computer.doSpeicherErweiterung();
        System.out.println(computer.toString());

        //Gewinnermittelung
        computer.setEinkaufsPreis(4500);
        computer.setVerkaufsPreis(5300);
        System.out.println("Der Gewinn beträgt: " + computer.getGewinn());

        //Erweiterung
        KlasseComputershop computer1 = new KlasseComputershop();
        computer1.setEinkaufsPreis(300);
        computer1.setVerkaufsPreis(500);
        KlasseComputershop computer2 = new KlasseComputershop();
        computer2.setEinkaufsPreis(500);
        computer2.setVerkaufsPreis(700);
        KlasseComputershop computer3 = new KlasseComputershop();
        computer3.setEinkaufsPreis(700);
        computer3.setVerkaufsPreis(900);
        KlasseComputershop computer4 = new KlasseComputershop();
        computer4.setEinkaufsPreis(900);
        computer4.setVerkaufsPreis(1100);
        KlasseComputershop computer5 = new KlasseComputershop();
        computer5.setEinkaufsPreis(900);
        computer5.setVerkaufsPreis(1100);

        System.out.println(getGewinn(arrayErstellen(computer1, computer2, computer3, computer4, computer5)));


    }

    public static KlasseComputershop[] arrayErstellen(KlasseComputershop computer1, KlasseComputershop computer2,
                                                      KlasseComputershop computer3, KlasseComputershop computer4,
                                                      KlasseComputershop computer5) {
        KlasseComputershop[] array = new KlasseComputershop[]{computer1, computer2, computer3, computer4, computer5};

        return array;
    }

    public static int getGewinn(KlasseComputershop[] array){
        int gewinn = 0;
        for(KlasseComputershop k : array){
            gewinn += k.getGewinn();
        }
        return gewinn;
    }
}
