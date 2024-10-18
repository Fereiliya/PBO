package UTS;

public class PC extends komputer {
    int ukuranMonitor;

    public PC(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, int ukuranMonitor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void info() {
        System.out.println("Informasi PC");
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran Monitor: " + ukuranMonitor);
        System.out.println("Jenis Processor: " + jnsProcessor);
        System.out.println("Kec. Processor: " + kecProcessor);
        System.out.println("Size Memory: " + sizeMemory);
    }
}