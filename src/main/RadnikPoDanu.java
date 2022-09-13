package main;

public class RadnikPoDanu extends Radnik{
    public RadnikPoDanu(String name, String lastname, long idNum, long accNum, long payment) {
        super(name, lastname, idNum, accNum, payment);
    }

    @Override
    void move() {
        System.out.println("Radi po danu...");
    }
}
