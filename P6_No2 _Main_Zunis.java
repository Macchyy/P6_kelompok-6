package mahasiswa;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Persia", 3, "Putih", "Miki");
        kucing.makan();
        kucing.tidur(); // Bisa diakses karena protected
        kucing.meong();
        kucing.info();
    }
}
