public class Computer {

    private int storage;
    private String printer;
    private boolean isPrinterConnected;

    public Computer(int inputStorage){
        this.storage = inputStorage;
        this.printer = "no printer";
        this.isPrinterConnected = false;
    }

    public int getStorage(){
        return this.storage;
    }
    
    public String getPrinter(){
        return this.printer;
    }

    public void setStorage(int newStorage){
        this.storage = newStorage;
    }
    
    public void setPrinter(String newPrinter){
        this.printer = newPrinter;
        this.isPrinterConnected = true;
    }

    public void addStorage(int extraStorage){
        this.storage += extraStorage;
    }
    
    public void printMessage(String message){
        if (isPrinterConnected){
            System.out.println(message);
        }
    }
    
}
