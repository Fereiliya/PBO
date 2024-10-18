import java.util.Scanner;
// Class DemoHP untuk menguji HandPhone
public class DemoHP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek HandPhone dengan konstruktor default
        Handphone hp1 = new Handphone();
        hp1.info();
        hp1.power(); // Menghidupkan handphone
        hp1.tambahVolume();
        hp1.kurangVolume();
        hp1.mute();
        hp1.unmute();
        hp1.info();
        
        System.out.println();

        // Membuat objek HandPhone dengan konstruktor parameter
        Handphone hp2 = new Handphone("123456", "Samsung Galaxy", "Android 12");
        hp2.info();
        System.out.println("");
        while (true) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Info");
            System.out.println("2. Power");
            System.out.println("3. Tambah Volume");
            System.out.println("4. Kurang Volume");
            System.out.println("5. Mute");
            System.out.println("6. Unmute");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            System.out.println("");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                System.out.println("");
                hp2.info(); 
                    break;

                case 2:
                System.out.println("");
                hp2.power();
                    break;

                case 3:
                System.out.println("");
                   hp2.tambahVolume();
                    break;

                case 4:
                System.out.println("");
                    hp2.kurangVolume();
                    break;

                case 5:
                System.out.println("");
                  hp2.mute();
                    break;

                case 6:
                System.out.println("");
                 hp2.unmute();
                    break;

                case 7:         
                    
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Coba Lagi.");
            }
        }
    }
    
}

    


