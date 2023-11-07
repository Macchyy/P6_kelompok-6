package skp6;

class PersegiPanjang extends Bentuk {
    private final double panjang;
    private final double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

