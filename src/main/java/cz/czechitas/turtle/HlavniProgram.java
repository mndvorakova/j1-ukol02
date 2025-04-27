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


        //barvičky
        Color tmaveZelenaAsi;
        tmaveZelenaAsi = new Color(10, 70, 50);

        Color svetleModraBarva = new Color(200, 230, 255);
        Color ruzovaBarva = Color.pink;
        Color brown = new Color(160, 82, 45);

        //kreslení základních tvvarů
        nakresliRovnoStrannyTrojuhelnik(80, Color.pink);
        nakresliCtverec();
        nakresliObdelnik(80d, 40d, tmaveZelenaAsi);
        nakresliMnohouhelnik(18, 10, svetleModraBarva);
        nakresliRovnoramennyTrojuhelnik(45, Color.MAGENTA);

        //kreslení obrázků
        nakresliZmrzlinu(brown);
        nakresliSnehulaka();

    }

    //První část úkolu

    private void nakresliMnohouhelnik(int pocetStran, double velikostStrany, Color svetleModraBarva) {
        zofka.setPenColor(svetleModraBarva);
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(uhel);
        }

    }

    void novaKresba() {
        zofka.penUp();
        zofka.move(velikostStrany + 50); //posun + mezera
        zofka.penDown();
    }

    public void nakresliRovnoStrannyTrojuhelnik(double velikostStrany, Color ruzovaBarva) {
        zofka.turnRight(90);
        zofka.setPenColor(ruzovaBarva);
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


    public void nakresliRovnoramennyTrojuhelnik(double velikostOdvesny, Color magenta) {
        double prepona = Math.sqrt(2 * Math.pow(velikostOdvesny, 2));
        zofka.setPenColor(magenta);

        zofka.move(velikostOdvesny);
        zofka.turnRight(90);

        zofka.move(velikostOdvesny);
        zofka.turnRight(135);

        zofka.move(prepona);
        zofka.turnRight(135);

        puvodniPoziceZelvy();
        novaKresba();
    }



    public void puvodniPoziceZelvy() {
        initialPositionX = zofka.getX();
        initialPositionY = zofka.getY();
        zofka.setX(initialPositionX);
        zofka.setY(initialPositionY);

        zofka.turnRight(270);
    }

    //Druhá část úkolu
    public void nakresliZmrzlinu(Color brown) {

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnRight(90);

        zofka.setPenColor(brown);
        zofka.penDown();

        nakresliRovnoStrannyTrojuhelnik(80, brown);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(velikostStrany);
        zofka.penDown();

        nakresliMnohouhelnik(20, 10, Color.PINK);

        novaKresba();
    }



    public void nakresliSnehulaka() {

        nakresliMnohouhelnik(20, 10, Color.blue);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliMnohouhelnik(15, 8, Color.blue);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(45);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliMnohouhelnik(12, 6, Color.blue);
        novaKresba();
    }

}





