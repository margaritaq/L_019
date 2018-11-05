package com.margo.utils;

import com.margo.objects.Cerc;
import com.margo.objects.Dreptunghi;
import com.margo.objects.Patrat;
import com.margo.objects.Triunghi;

public class ShapeUtils {

    public static double calcPerimetru(Triunghi t) {

        return t.getLatura1() + t.getLatura2() + t.getLatura3();
    }
    public static double calcAria(Triunghi t){
        double p = calcPerimetru(t);
        return Math.sqrt(p*(p-t.getLatura1())*(p-t.getLatura2())*(p-t.getLatura3()));
    }

    public static double calcPerimetru(Dreptunghi d) {

        return 2* d.getLungime() + 2 * d.getLatime();
    }
    public static double calcAria(Dreptunghi d){

        return d.getLungime() * d.getLatime();
    }


    public static double calcPerimetru(Patrat p) {

        return p.getLatura()*4;
    }
    public static double calcAria(Patrat p){

        return p.getLatura()*p.getLatura();
    }

    public static double calcPerimetru(Cerc c){

        return 2* Math.PI * c.getRaza();
    }



    public static double calcAria(Cerc c){

        return Math.PI * (c.getRaza() * c.getRaza());
    }

}
