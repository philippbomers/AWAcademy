package Elias_Training.Elias_Woche4.Computershop;

import java.text.NumberFormat;

public class ComputerShopMain {

    public static void main(String[] args) {


        ComputerShopLogic com1 = new ComputerShopLogic("ASUS",6,8,512,3,
                15.5,"Computer",true,1000,1500);
        System.out.println("computer 1 "+com1);

        // Computer mit erhöhtem Arbeitsspeicher
        ComputerShopLogic com2 = new ComputerShopLogic("HP Pavilion",2.30,16,512,3,
                0,"Windows",true,800,1200.50);
        com2.setRamGB(com2.getRamGB()*2);
        System.out.println("computer 2 "+com2);

        // 5 neue Computers
        ComputerShopLogic com3 = new ComputerShopLogic("Dell",1.8,8,512,1,
                13.5,"Windows",true,950,1000.50);

        ComputerShopLogic com4 = new ComputerShopLogic("ASOS",1.3,4,256,5,
                0.00,"Windows",true,650,850);

        ComputerShopLogic com5 = new ComputerShopLogic("MacPro",1.8,8,512,1,
                13.5,"Windows",true,900,1200);

        ComputerShopLogic com6 = new ComputerShopLogic("Dell",1.8,8,512,1,
                13.5,"Windows",true,600,1000);

        ComputerShopLogic com7 = new ComputerShopLogic("HP",1.8,8,512,1,
                13.5,"Windows",true,750.50,1200.50);


        ComputerShopLogic[] computers = {com3,com4,com5,com6,com7};
        NumberFormat formatted = NumberFormat.getCurrencyInstance();
        System.out.println("\ntotal profit: "+formatted.format(determineOverallProfit(computers)));
    }

    public static double determineOverallProfit(ComputerShopLogic[] allComputers){
        double sum=0;
        for (ComputerShopLogic computer: allComputers) {
            sum += computer.determineProfit();
        }
        return sum;
    }

}


