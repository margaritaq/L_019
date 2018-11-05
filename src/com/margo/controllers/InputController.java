package com.margo.controllers;

import com.margo.objects.Cerc;
import com.margo.objects.Dreptunghi;
import com.margo.objects.Patrat;
import com.margo.objects.Triunghi;

import java.util.Scanner;

public class InputController {
    public static Triunghi createShape(Triunghi t) {
        System.out.println("Introduceti laturile triunghiului:");
        System.out.println("a: ");
        double a = readDoubleFromConsole();
        System.out.println("b: ");
        double b = readDoubleFromConsole();
        System.out.println("c: ");
        double c = readDoubleFromConsole();
        t.setLatura1(a);
        t.setLatura2(b);
        t.setLatura3(c);
        return t;
    }


    public static Dreptunghi createShape(Dreptunghi d) {
        System.out.println("Introduceti laturile dreptunghiului:");
        System.out.println("a: ");
        double a = readDoubleFromConsole();
        System.out.println("b: ");
        double b = readDoubleFromConsole();

        d.setLungime(a);
        d.setLatime(b);
        return d;
    }

    public static Cerc createShape(Cerc c) {
        System.out.println("Introduceti raza cercului:");
        System.out.println("r: ");
        double r = readDoubleFromConsole();
        c.setRaza(r);


        return c;
    }

    public static Patrat createShape(Patrat p) {
        System.out.println("Introduceti latura patratului:");
        System.out.println("a: ");
        double l = readDoubleFromConsole();
        p.setLatura(l);


        return p;
    }

    private static double readDoubleFromConsole() {
        double d = new Scanner(System.in).nextDouble();
        return d;
    }

}
