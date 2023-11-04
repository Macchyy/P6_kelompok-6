package mahasiswa;

// Kelas Induk (Superclass)
public class Hewan {
    String jenis;
    protected int umur;
    String warna; // Default access modifier

    public Hewan(String jenis, int umur, String warna) {
        this.jenis = jenis;
        this.umur = umur;
        this.warna = warna;
    }

    public void makan() {
        System.out.println("Hewan ini sedang makan.");
    }

    protected void tidur() {
        System.out.println("Hewan ini sedang tidur.");
    }
}
