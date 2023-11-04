package mahasiswa;

// Kelas Anak (Subclass) yang mewarisi Hewan
public class Kucing extends Hewan {
    private String nama;

    public Kucing(String jenis, int umur, String warna, String nama) {
        super(jenis, umur, warna);
        this.nama = nama;
    }

    public void meong() {
        System.out.println(nama + " si " + jenis + " berwarna " + warna + " meong.");
    }

    public void info() {
        System.out.println("Kucing: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + ", Warna: " + warna);
    }
}
