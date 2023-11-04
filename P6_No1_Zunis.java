package mahasiswa;
class Hewan {
    void makan() {
        System.out.println("Hewan ini makan.");
    }
}

class Kucing extends Hewan {
    void meong() {
        System.out.println("Kucing ini meong.");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        
        kucing.makan();
        
        kucing.meong();
    }
}

