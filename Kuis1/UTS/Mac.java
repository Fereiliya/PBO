package UTS;

public class Mac extends Laptop {
    String security;

    public Mac(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrei) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatrei);
    }
    
    public void info() {
        System.out.println("Informasi Laptop");
        System.out.println("Merk: " + merk);
        System.out.println("Kec. Processor: " + kecProcessor);
        System.out.println("Size Memory: " + sizeMemory);
        System.out.println("Jenis Processor: " + jnsProcessor);
        System.out.println("Jenis Baterai: " + jnsBatrei);
    }
}