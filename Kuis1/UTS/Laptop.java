package UTS;
import UTS.komputer;

public class Laptop extends komputer {
    String jnsBatrei;

    public Laptop(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrei) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBatrei = jnsBatrei;
    }

    public void info() {
        System.out.println("Informasi Laptop");
        System.out.println("Merk: " + merk);
        System.out.println("Kec. Processor: " + kecProcessor);
        System.out.println("Size Memory: " + sizeMemory);
        System.out.println("Jenis Processor: " + jnsProcessor);
        System.out.println("Jenis Batrei: " + jnsBatrei);
    
    }
}