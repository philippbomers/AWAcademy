package Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop;

import java.util.Scanner;

public class ComputerMain {
    public static void main(String[] args) {

        Scanner placeHolder = new Scanner(System.in);

        // generate a computer with some values
        Computer PhilippsPC = new Computer("Philipps Computer", "Dell", 32, true);
        PhilippsPC.setPurchasingPrice(670.65);
        PhilippsPC.setSellingPrice(455.59);
        PhilippsPC.setOperatingSystem("Fedora");
        PhilippsPC.setRamGb(16);
        PhilippsPC.setNumberOfUsbPorts((byte) 6);
        PhilippsPC.setGraphicCard("AMD");
        PhilippsPC.setHddGb(250);
        PhilippsPC.setCpuMhz(3600);
        PhilippsPC.setType("Workstation");
        System.out.println(PhilippsPC);

        System.out.println("\nZum Fortfahren drücke ENTER.");
        placeHolder.nextLine();

        // double the ram
        System.out.println("\nNach der Speichererweiterung:\n");

        PhilippsPC.setRamGb(PhilippsPC.getRamGb() * 2);
        PhilippsPC.setSellingPrice(PhilippsPC.getSellingPrice() + 40);
        PhilippsPC.setPurchasingPrice(PhilippsPC.getPurchasingPrice() + 60);
        System.out.println(PhilippsPC);

        System.out.println("\nZum Fortfahren drücke ENTER.");
        placeHolder.nextLine();

        //generate 5 more computers
        Computer[]
                allComputers = new Computer[5];
        String[]
                manufacturerNames = {"Dell", "IBM", "Apple", "Microsoft", "Samsung"},
                computerTypes = {"Workstation", "Workstation", "Workstation", "Notebook", "Tablet"},
                graphicCards = {"AMD", "AMD", "Intel", "Nvidia", "Adreno"},
                operatingSystems = {null, "RHEL", "MacOs", "Windows", "Android"};
        int[]
                screenSize = {32, 24, 16, 18, 7},
                cpuSpeeds = {3600, 2700, 1600, 3800, 700},
                hddSpaces = {512, 256, 256, 1024, 36},
                ramSpaces = {16, 16, 8, 8, 4};
        boolean[]
                preInstalledOs = {false, true, true, true, true};
        double[]
                purchasingPrices = {857.22, 451.99, 2045.99, 1599.29, 345},
                sellingPrices = {650, 400.10, 1200.99, 1200.20, 300.11};
        byte[]
                numberOfUsbPorts = {5, 8, 2, 3, 1};

        for (int i = 0; i < allComputers.length; i++) {
            allComputers[i] = new Computer("Computer " + (i + 1), manufacturerNames[i], screenSize[i], preInstalledOs[i]);
            allComputers[i].setType(computerTypes[i]);
            allComputers[i].setCpuMhz(cpuSpeeds[i]);
            allComputers[i].setHddGb(hddSpaces[i]);
            allComputers[i].setSellingPrice(sellingPrices[i]);
            allComputers[i].setPurchasingPrice(purchasingPrices[i]);
            allComputers[i].setRamGb(ramSpaces[i]);
            allComputers[i].setGraphicCard(graphicCards[i]);
            allComputers[i].setNumberOfUsbPorts(numberOfUsbPorts[i]);
            allComputers[i].setOperatingSystem(operatingSystems[i]);

            System.out.println(allComputers[i] +
                    "\nZum Fortfahren drücke ENTER.\n");
            placeHolder.nextLine();
        }

        // calculate the profit when selling all computers
        double completeProfit = 0;
        for (Computer computer : allComputers) {
            completeProfit += computer.getProfit();
        }

        System.out.println("Wenn ich alle Computer verkaufe, erhalte ich " +
                MathOperations.reduceDecimals(completeProfit) +
                " Euro Gewinn.");
    }

}
