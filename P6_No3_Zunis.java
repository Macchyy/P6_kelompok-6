package main;

class Orang {
    private final String nama;
    private final String alamat;
    private final String ttl;
    private final String email;
    private final String telepon;

    public Orang(String nama, String alamat, String ttl, String email, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.email = email;
        this.telepon = telepon;
    }

    public void cetakInfoPribadi() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("TTL : " + ttl);
        System.out.println("Email: " + email);
        System.out.println("Telepon: " + telepon);
    }
}

class CV extends Orang {
    private final String pengalamanKerja;
    private final String pendidikan;
    private final String keterampilan;

    public CV(String nama, String alamat, String ttl, String email, String telepon, String pengalamanKerja, String pendidikan, String keterampilan) {
        super(nama, alamat, ttl, email, telepon);
        this.pengalamanKerja = pengalamanKerja;
        this.pendidikan = pendidikan;
        this.keterampilan = keterampilan;
    }

    public void cetakCV() {
        cetakInfoPribadi();
        System.out.println("Pengalaman Kerja: " + pengalamanKerja);
        System.out.println("Pendidikan: " + pendidikan);
        System.out.println("Keterampilan: " + keterampilan);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CV cv1 = new CV("Lalu Sirdi Zunistira", "Gerung", "Atambua, 03 Juni 2023", "Zunis@gmail.com", "085238491167", "Software Engineer", "Sarjana Teknik", "Java, Python");
        
        cv1.cetakCV();
        
    }
}
