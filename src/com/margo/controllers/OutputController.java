package com.margo.controllers;

import com.margo.objects.Cerc;
import com.margo.objects.Dreptunghi;
import com.margo.objects.Patrat;
import com.margo.objects.Triunghi;
import com.margo.utils.ShapeUtils;

public class OutputController {
    public static void print(Triunghi t) {
        System.out.println(t.getLatura1() + " " + t.getLatura2() + " " + t.getLatura3());
    }

    public static void printAreaAndPerimeter(Triunghi t) {
        double perimetru = ShapeUtils.calcPerimetru(t);
        double aria = ShapeUtils.calcAria(t);
        System.out.println("Perimetru triunghiului= " + perimetru + " Aria triunghiului=" + aria);
    }

    public static void print(Dreptunghi d) {
        System.out.println(d.getLungime() + " " + d.getLatime());
    }

    public static void printAreaAndPerimeter(Dreptunghi d) {
        double perimetru = ShapeUtils.calcPerimetru(d);
        double aria = ShapeUtils.calcAria(d);
        System.out.println("Perimetru dreptunghi= " + perimetru + " Aria dreptunghi=" + aria);
    }

    public static void print(Patrat p) {
        System.out.println(p.getLatura());
    }

    public static void printAreaAndPerimeter(Patrat p) {
        double perimetru = ShapeUtils.calcPerimetru(p);
        double aria = ShapeUtils.calcAria(p);
        System.out.println("Perimetru patratului= " + perimetru + " Aria patratului=" + aria);
    }

    public static void print(Cerc c) {
        System.out.println(c.getRaza());
    }

    public static void printAreaAndPerimeter(Cerc c) {
        double cercumferinta = ShapeUtils.calcPerimetru(c);
        double aria = ShapeUtils.calcAria(c);
        System.out.println(
                String.format("Cercumferinta=%1$,.2f, Aria cercului=%2$,.2f", cercumferinta, aria)
        );

    }


}
