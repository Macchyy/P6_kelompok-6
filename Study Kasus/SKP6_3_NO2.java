package skp6;

class Trapesium extends Bentuk {
    private final double atas;
    private final double bawah;
    private final double tinggi;

    public Trapesium(double atas, double bawah, double tinggi) {
        this.atas = atas;
        this.bawah = bawah;
        this.tinggi = tinggi;
    }
    
    public double hitungLuas() {
        return ((atas + bawah) * tinggi) / 2;
    }
}

