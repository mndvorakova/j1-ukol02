package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();
    private double initialPositionX;
    private double initialPositionY;

    private double velikostStrany = 80.0;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

        Color tmaveZelenaAsi;
        tmaveZelenaAsi = new Color(10,70,50);

        Color ruzovaBarva = Color.pink;

        nakresliRovnoStrannyTrojuhelnik(Color.pink);
        nakresliCtverec();
        nakresliObdelnik(80d, 40d, tmaveZelenaAsi);
        nakresliMnohouhelnik(18, 10);
    }




    public void nakresliRovnoStrannyTrojuhelnik(Color ruzova) {
        zofka.turnRight(90);
        zofka.setPenColor(ruzova);
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(120);
        }
        novaKresba();

    }

    public void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(Color.CYAN);
            zofka.move(velikostStrany);
            zofka.turnRight(90);
        }
        novaKresba();
    }

    public void nakresliObdelnik(double velikostStranyA, double velikostStranyB, Color tmaveZelenaAsi) {
        zofka.setPenColor(tmaveZelenaAsi);

        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(90);
            zofka.move(velikostStranyB);
            zofka.turnRight(90);
        }
        novaKresba();
    }

    public void nakresliMnohouhelnik(int pocetStran ,double velikostStrany){
        zofka.setPenColor(Color.CYAN);
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(uhel);
        }
        novaKresba();
    }



    public void novaKresba(){
        /*
        initialPositionX = zofka.getX();
        initialPositionY = zofka.getY();
        zofka.setX(initialPositionX);
        zofka.setY(initialPositionY);

        zofka.turnRight(90);
         */
        zofka.penUp();
        zofka.move(velikostStrany + 50); //posun + mezera
        zofka.penDown();
    }



}
