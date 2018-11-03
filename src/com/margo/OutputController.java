package com.margo;

public class OutputController {
    public static void print(Triunghi triunghi){
        System.out.println(triunghi.getLatura1()+" "+ triunghi.getLatura2()+" "+triunghi.getLatura3());
    }

    public static void printAreaAndPerimeter(Triunghi t){
        double perimetru = t.getLatura1() + t.getLatura2() + t.getLatura3();
        double aria = 0;
        System.out.println("Perimetru triunghiului= "+perimetru+ " Aria triunghiului="+aria);
    }


}
