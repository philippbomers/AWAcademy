package Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop;

public class Main {
    public static void main(String[] args) {

        // generate a computer with some values
        Computer PhilippsPC = new Computer("Dell", 32, true);
        PhilippsPC.setPurchasingPrice(670.65);
        PhilippsPC.setSellingPrice(455.59);
        PhilippsPC.setOperatingSystem("Fedora");
        PhilippsPC.setRamGb(16);
        System.out.println(PhilippsPC);

        System.out.println("\n--------------\nSpeichererweiterung:\n");

        // double the ram
        PhilippsPC.setRamGb(PhilippsPC.getRamGb()*2);
        System.out.println(PhilippsPC);

        System.out.println("\n--------------\n");

        //generate more computers
        Computer ChristophsPC = new Computer("LinuxHeld", 24, true);
        ChristophsPC.setPurchasingPrice(1033);
        ChristophsPC.setSellingPrice(431);
        ChristophsPC.setOperatingSystem("Ubuntu");
        System.out.println(ChristophsPC);

        System.out.println("\n--------------\n");

        Computer JuergensLaptop = new Computer("NoName", 16, false);
        JuergensLaptop.setSellingPrice(2133);
        JuergensLaptop.setPurchasingPrice(4322);
        JuergensLaptop.setType("Laptop");
        JuergensLaptop.setHddGb(500);
        JuergensLaptop.setCpuMhz(3500);
        System.out.println(JuergensLaptop);

        System.out.println("\n--------------\n");

        Computer MichellesRaspberry = new Computer("Raspberry", 6, true);
        MichellesRaspberry.setOperatingSystem("Raspberry Os/Debian");
        MichellesRaspberry.setPurchasingPrice(60);
        MichellesRaspberry.setSellingPrice(35);
        System.out.println(MichellesRaspberry);
    }

}
