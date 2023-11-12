/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;


class Akun {
    private String username;
    private String password;

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

class AkunPengguna extends Akun {
    private String nama;

    public AkunPengguna(String username, String password, String nama) {
        super(username, password);
        this.nama = nama;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nama: " + nama);
    }
}


class AkunAdmin extends Akun {
    private String level;

    public AkunAdmin(String username, String password, String level) {
        super(username, password);
        this.level = level;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level);
    }
}


public class studykasus3 {
    public static void main(String[] args) {

        System.out.println("-------------Informasi Akun Pengguna-------------");
        AkunPengguna userAccount = new AkunPengguna("user123", "pass123", "John Doe");
        userAccount.displayInfo();
        System.out.println();

        System.out.println("--------------Informasi Akun Admin--------------");
        AkunAdmin adminAccount = new AkunAdmin("admin123", "adminpass", "Super Admin");
        adminAccount.displayInfo();
    }
}

