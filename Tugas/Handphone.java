// Class HandPhone
public class Handphone {
    // Atribut
    private String noSeri;
    private String model;
    private String versiOS;
    private boolean on;
    private int volume;
    private int currentVol;

    // Konstruktor default
    public Handphone() {
        this.noSeri = "";
        this.model = "";
        this.versiOS = "";
        this.on = false;
        this.volume = 0;
        this.currentVol = volume;
    }

    // Konstruktor dengan parameter
    public Handphone(String noSeri, String model, String versiOS) {
        this.noSeri = noSeri;
        this.model = model;
        this.versiOS = versiOS;
        this.on = false;
        this.volume = 0;
        this.currentVol = volume;
    }

    // Metode untuk menghidupkan dan mematikan handphone
    public void power() {
        if (on) {
            on = false;
            System.out.println("Handphone dimatikan.");
        } else {
            on = true;
            System.out.println("Handphone dihidupkan.");
        }
    }

    // Metode untuk menambah volume
    public void tambahVolume() {
        volume = currentVol; // Metode untuk unmute sambil menambah volume
        if (on && volume < 100) {
            volume+= 5;
            System.out.println("Volume ditambah menjadi: " + volume);
            currentVol = volume;
        } else if (!on) {
            System.out.println("Handphone mati. Tidak dapat mengubah volume.");
        } else {
            System.out.println("Volume sudah maksimal.");
        }
    }

    // Metode untuk mengurangi volume
    public void kurangVolume() {
        volume = currentVol; // Metode untuk unmute sambil mengurangi volume
        if (on && volume > 0) {
            volume-= 5;
            System.out.println("Volume dikurangi menjadi: " + volume);
            currentVol = volume;
        } else if (!on) {
            System.out.println("Handphone mati. Tidak dapat mengubah volume.");
        } else {
            System.out.println("Volume sudah minimal.");
        }
    }

    // Metode untuk mute (membuat volume menjadi 0)
    public void mute() {
        if (on) {
           currentVol = volume;
            volume = 0;
            System.out.println("Handphone dimute. Volume sekarang: " + volume);
        } else {
            System.out.println("Handphone mati. Tidak dapat mute.");
        }
    }
    // Motode untuk unmute
    public void unmute() {
            if (on) {
                volume = currentVol;
                System.out.println("Handphone di-unmute. Volume sekarang: " + volume);
            } else {
                System.out.println("Handphone mati. Tidak dapat unmute.");
            }
        }
    

    // Metode untuk menampilkan informasi handphone
    public void info() {
        System.out.println("Informasi HandPhone:");
        System.out.println("No. Seri: " + noSeri);
        System.out.println("Model: " + model);
        System.out.println("Versi OS: " + versiOS);
        System.out.println("Status: " + (on ? "Menyala" : "Mati"));
        System.out.println("Volume: " + volume);
    }
}
