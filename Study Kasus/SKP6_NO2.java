package skp6;

class Bentuk {
    public double hitungLuas() {
        return 0.0;
    }
}

public class SKP6 {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
        double luasPersegiPanjang = persegiPanjang.hitungLuas();
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);

        LayangLayang layangLayang = new LayangLayang(6, 8);
        double luasLayangLayang = layangLayang.hitungLuas();
        System.out.println("Luas Layang-layang: " + luasLayangLayang);

        Trapesium trapesium = new Trapesium(4, 8, 6);
        double luasTrapesium = trapesium.hitungLuas();
        System.out.println("Luas Trapesium: " + luasTrapesium);
    }
}
