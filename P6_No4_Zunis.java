package main;

class DataMahasiswa {
    private final String nama;
    private final String jurusan;
    private final int angkatan;

    public DataMahasiswa(String nama, String jurusan, int angkatan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Angkatan: " + angkatan);
    }
}

class Mahasiswa001 extends DataMahasiswa {
    private final String nim;

    public Mahasiswa001(String nama, String jurusan, int angkatan, String nim) {
        super(nama, jurusan, angkatan);
        this.nim = nim;
    }

    public void tampilkanInfo() {
        tampilkanData();
        System.out.println("NIM: " + nim);
    }
}

class Mahasiswa002 extends DataMahasiswa {
    private final String nim;

    public Mahasiswa002(String nama, String jurusan, int angkatan, String nim) {
        super(nama, jurusan, angkatan);
        this.nim = nim;
    }

    public void tampilkanInfo() {
        tampilkanData();
        System.out.println("NIM: " + nim);
    }
}

class Mahasiswa003 extends DataMahasiswa {
    private final String nim;

    public Mahasiswa003(String nama, String jurusan, int angkatan, String nim) {
        super(nama, jurusan, angkatan);
        this.nim = nim;
    }

    public void tampilkanInfo() {
        tampilkanData();
        System.out.println("NIM: " + nim);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa001 mhs1 = new Mahasiswa001("Zunis", "Teknik Elektro", 2021, "F1B021010");
        Mahasiswa002 mhs2 = new Mahasiswa002("RiFky", "Teknik Elektro", 2021, "F1B021010");
        Mahasiswa003 mhs3 = new Mahasiswa003("Radit", "Teknik Elektro", 2019, "F1B021010");

        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        mhs3.tampilkanInfo();
    }
}
