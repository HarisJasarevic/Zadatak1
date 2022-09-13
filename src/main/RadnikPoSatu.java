package main;

public class RadnikPoSatu extends Radnik{
    public RadnikPoSatu(String name, String lastname, long idNum, long accNum, long payment) {
        super(name, lastname, idNum, accNum, payment);
    }

    @Override
    void move() {
        System.out.println("Radi po satu...");

    }
}
