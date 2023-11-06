/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

class BangunRuang {
    protected double volume;
    

    public BangunRuang() {
        volume = 0.0;
     
    }

    protected void hitungVolume() {
       
    }

    public void tampilkanVolume() {
        System.out.println("Volume   : " + volume+"cm^3");
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
        hitungVolume();
    }

    @Override
    protected void hitungVolume() {
        volume = Math.pow(sisi, 3);
    }
}

class Prismasegitiga extends BangunRuang {
    private double alas;
    private double tinggi;
    private double tinggiprisma;

    public Prismasegitiga(double alas, double tinggi, double tinggiprisma) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiprisma = tinggiprisma;
        hitungVolume();
    }

    @Override
    protected void hitungVolume() {
        volume = ((alas*tinggi)/2)*tinggiprisma; 
    }

}



class Prismasegiempat extends BangunRuang {
    private double luasalas;
    private double tinggi;

    public Prismasegiempat(double luasalas, double tinggi) {
        this.luasalas = luasalas;
        this.tinggi = tinggi;
        hitungVolume();
    }

    @Override
    protected void hitungVolume() {
        volume = luasalas * tinggi;
    }
}

public class studykasus {
 public static void main (String[] args){
        
        
        Kubus kubus = new Kubus(2);
        Prismasegitiga prismasegitiga = new Prismasegitiga(5, 3, 2);
        Prismasegiempat prismasegiempat = new Prismasegiempat(3, 2);

        prismasegitiga.tampilkanVolume();
        kubus.tampilkanVolume();
        prismasegiempat.tampilkanVolume();
    }
}

