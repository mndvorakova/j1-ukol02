package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();
    private double initialPositionX;
    private double initialPositionY;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

        Color ruzovaBarva = Color.pink;


        nakresliRovnoStrannyTrojuhelnik(70.0, 120.0, Color.pink);

        nakresliCtverec();

    }

    public void nakresliRovnoStrannyTrojuhelnik(double velikostStrany, double uhel, Color pink) {
        zofka.turnRight(90);
        zofka.setPenColor(pink);
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(uhel);
        }
        novaKresba();

    }

    public void nakresliCtverec(){

    }


    public void novaKresba(){

        initialPositionX = zofka.getX();
        initialPositionY = zofka.getY();

        zofka.setX(initialPositionX);
        zofka.setY(initialPositionY);

        zofka.turnRight(90);
    }

}
