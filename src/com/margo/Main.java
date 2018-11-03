package com.margo;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("introduceti laturile");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();
        double r = new Scanner(System.in).nextDouble();

        Triunghi triunghi = InputController.create(a, b, c);
        OutputController.print(triunghi);

         OutputController.printAreaAndPerimeter(triunghi);


        double perimetruPatrat = calcPerimetruPatrat(a);
        System.out.println(perimetruPatrat);

        double perimetruCerc = calcPerimetruCerc(r);
        System.out.println(perimetruCerc);

        double ariaTriunghi = calcAriaTriunghi(a, b, c);
        System.out.println(ariaTriunghi);

        double ariaPatrat = calcAriaPatrat(a);
        System.out.println(ariaPatrat);

        double ariaCerc = calcAriaCerc(r);
        System.out.println(ariaCerc);


    }




    static double calcPerimetruPatrat(double d) {
        return d * 4;
    }

    static double calcPerimetruCerc(double z) {
        return 2 * Math.PI * z;

    }

    static double calcAriaTriunghi(double d, double e, double f) {
        double semiperipetru = d + e + f / 2;
        return semiperipetru * Math.sqrt(semiperipetru * (semiperipetru - d) * (semiperipetru - e) * (semiperipetru - f));
    }

    static double calcAriaPatrat(double d) {
        return d * d;

    }

    static double calcAriaCerc(double d) {
        return Math.PI * (d * d);

    }

}