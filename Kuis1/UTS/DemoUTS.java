package UTS;

import UTS.Mac;
import UTS.PC;
import UTS.Windows;
import UTS.komputer;
import UTS.Laptop;

public class DemoUTS {

    public static void main(String[] args) {
        
       
        
         
                Mac mac = new Mac("Apple", 6, 8, "A15", "Lithium");
                Windows windows = new Windows("Dell", 4, 8, "Intel", "Lithium", "Windows Hello");
                PC pc = new PC("HP", 4, 32, "AMD", 27);
                Laptop Laptop = new Laptop("Dell", 4, 16, "AMD", "Lithium");
                komputer komputer = new komputer("MSI", 8, 64, "AMD");
        
                // Display the data for each object
                mac.info();
                System.out.println();
                windows.info();
                System.out.println();
                pc.info();
                System.out.println();
                Laptop.info();
                System.out.println();
                komputer.info();
    }
}
    
    

