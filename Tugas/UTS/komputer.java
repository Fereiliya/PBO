package UTS;

public class komputer {

    String merk;
    int kecProcessor;
    int sizeMemory;
    String jnsProcessor;


    public komputer(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }

    public void info() {
        System.out.println("Informasi PC");
        System.out.println("Merk: " + merk);
        System.out.println("Kec. Processor: " + kecProcessor);
        System.out.println("Size Memory: " + sizeMemory);
        System.out.println("Jns. Processor: " + jnsProcessor);
    }
}

