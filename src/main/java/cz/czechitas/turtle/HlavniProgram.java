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
        nakresliCtverec(50, 90);
        nakresliObdelnik(80d, 40d, 90, Color.pink);
        nakresliMnohouhelnik(18, 10, 25);

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

    public void nakresliCtverec(double velikostStrany, double uhel){
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(Color.CYAN);
            zofka.move(50);
            zofka.turnRight(90);
        }
        novaKresba();
    }

    public void nakresliObdelnik(double velikostStranyA, double velikostStranyB, double uhel, Color pink) {
        zofka.setPenColor(pink);

        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(uhel);
            zofka.move(velikostStranyB);
            zofka.turnRight(uhel);
        }
        novaKresba();
    }

    public void nakresliMnohouhelnik(double pocetKroku, double posun, double uhel){
        zofka.setPenColor(Color.CYAN);
        for (int i = 0; i < pocetKroku; i++) {
            zofka.move(posun);
            zofka.turnRight(uhel);
        }
        novaKresba();
    }



    public void novaKresba(){
        initialPositionX = zofka.getX();
        initialPositionY = zofka.getY();

        zofka.setX(initialPositionX);
        zofka.setY(initialPositionY);

        zofka.turnRight(90);

        zofka.penUp();
        zofka.move(90);
        zofka.penDown();
    }



}
