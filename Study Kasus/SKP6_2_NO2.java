package skp6;

class LayangLayang extends Bentuk {
    private final double diagonal1;
    private final double diagonal2;

    public LayangLayang(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double hitungLuas() {
        return (diagonal1 * diagonal2) / 2;
    }
}
