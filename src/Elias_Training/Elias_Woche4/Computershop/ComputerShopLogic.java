package Elias_Training.Elias_Woche4.Computershop;

public class ComputerShopLogic {

    private String manufacturer;
    private double processorMHz;
    private int ramGB;
    private int hddGB;
    private int numOfUsbPorts;
    private double screenSizeInch;
    private String computerType;
    private boolean preInstalledOS;
    private double purchasePrice;
    private double sellingPrice;

    public ComputerShopLogic() {
    }

    public ComputerShopLogic(String manufacturer, double screenSizeInch, boolean preInstalledOS) {
        this.manufacturer = manufacturer;
        this.setScreenSizeInch(screenSizeInch);
        this.preInstalledOS = preInstalledOS;
    }



    public ComputerShopLogic(String manufacturer, double processorMHz, int ramGB, int hddGB, int numOfUsbPorts,
                             double screenSizeInch, String computerType, boolean preInstalledOS, double purchasePrice, double sellingPrice) {
        this.manufacturer = manufacturer;
        this.processorMHz = processorMHz;
        this.ramGB = ramGB;
        this.hddGB = hddGB;
        this.numOfUsbPorts = numOfUsbPorts;
        this.screenSizeInch = screenSizeInch;
        this.computerType = computerType;
        this.preInstalledOS = preInstalledOS;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public double determineProfit(){
        double profit;
        return profit = sellingPrice - purchasePrice;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getProcessorMHz() {
        return processorMHz;
    }

    public void setProcessorMHz(double processorMHz) {
        this.processorMHz = processorMHz;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getHddGB() {
        return hddGB;
    }

    public void setHddGB(int hddGB) {
        this.hddGB = hddGB;
    }

    public int getNumOfUsbPorts() {
        return numOfUsbPorts;
    }

    public void setNumOfUsbPorts(int numOfUsbPorts) {
        this.numOfUsbPorts = numOfUsbPorts;
    }

    public String getScreenSizeInch() {
        if (this.screenSizeInch == 0.0){
            return "kein Bildschirm vorhanden";
        }
        return Double.toString(screenSizeInch);
    }

    public void setScreenSizeInch(double screenSizeInch) {
        this.screenSizeInch = screenSizeInch;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public boolean isPreInstalledOS() {
        return preInstalledOS;
    }

    public void setPreInstalledOS(boolean preInstalledOS) {
        this.preInstalledOS = preInstalledOS;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "has following details: \u2592\u2592\u2592\u2592 " +
                "manufacturer: '" + manufacturer + '\'' +
                ", processor in MHz=" + processorMHz +
                ", ram in GB: " + ramGB +
                ", hdd in GB: " + hddGB +
                "\nnumber of USB ports: " + numOfUsbPorts +
                ", screen size in inch: " + getScreenSizeInch() +
                ", computer type: '" + computerType + '\'' +
                ", pre-Installed OS: " + preInstalledOS +
                ", purchase price: " + purchasePrice + "€, selling price: " + sellingPrice +"€"+
                ", profit: " + determineProfit()+"€ \u2592\u2592\u2592\u2592\n";
    }
}
