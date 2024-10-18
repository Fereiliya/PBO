package UTS;

public class Windows extends Laptop {
    String fitur;

    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrei, String fitur) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatrei);
        this.fitur = fitur;
    }

    public void info() {
        System.out.println("Informasi PC");
        System.out.println("Merk: " + merk);
        System.out.println("Kec. Processor: " + kecProcessor);
        System.out.println("Size Memory: " + sizeMemory);
        System.out.println("Jenis Processor: " + jnsProcessor);
        System.out.println("Jenis Baterai: " + jnsBatrei);
        System.out.println("Fitur: " + fitur);
    }
}