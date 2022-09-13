package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Omer", "Omerović", 2811987, 140101001, 50);
    RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Izet", "Izović", 1306992, 140101002, 400);
    RadnikFiksno radnikFiksno = new RadnikFiksno("Ado", "Adilović", 2411977, 140101003, 500);

    Radnik [] radniks = {radnikPoSatu, radnikPoDanu, radnikFiksno};

    System.out.println(Arrays.toString(radniks));

    moveRadniks(radnikPoSatu);
    moveRadniks(radnikPoDanu);
    moveRadniks(radnikFiksno);
    }

    private static void moveRadniks(Radnik radnik) { radnik.move(); }



}//end class
