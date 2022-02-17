package Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop;

public class ComputerShopMain {
    public static void main(String[] args) {
        Computer PhilippsPC = new Computer("Dell", 32, true);
        PhilippsPC.setPurchasingPrice(670.65);
        PhilippsPC.setSellingPrice(455.59);
        System.out.println(PhilippsPC.getProfit());
    }

}
