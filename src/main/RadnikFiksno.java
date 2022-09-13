package main;

public final class RadnikFiksno extends Radnik{
    public RadnikFiksno(String name, String lastname, long idNum, long accNum, long payment) {
        super(name, lastname, idNum, accNum, payment);
    }

    @Override
    void move() {
        System.out.println("Radi fiksno...");
    }
}
