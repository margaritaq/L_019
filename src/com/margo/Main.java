package com.margo;


import com.margo.controllers.InputController;
import com.margo.controllers.OutputController;
import com.margo.objects.Cerc;
import com.margo.objects.Dreptunghi;
import com.margo.objects.Patrat;
import com.margo.objects.Triunghi;

public class Main {
    public static void main(String[] args) {


        //   double raza = InputController.readDouble();


        Triunghi triunghi = InputController.createShape(new Triunghi());
        OutputController.print(triunghi);
        OutputController.printAreaAndPerimeter(triunghi);

        Patrat patrat = InputController.createShape(new Patrat());
        OutputController.print(patrat);
        OutputController.printAreaAndPerimeter(patrat);

        Cerc cerc = InputController.createShape(new Cerc());
        OutputController.print(cerc);
        OutputController.printAreaAndPerimeter(cerc);

        Dreptunghi dreptunghi = InputController.createShape(new Dreptunghi());
        OutputController.print(dreptunghi);
        OutputController.printAreaAndPerimeter(dreptunghi);



/*

        double perimetruPatrat = calcPerimetruPatrat(latura1);
        System.out.println(perimetruPatrat);

        double perimetruCerc = calcPerimetruCerc(r);
        System.out.println(perimetruCerc);

        double ariaTriunghi = calcAriaTriunghi(latura1, latura2, latura3);
        System.out.println(ariaTriunghi);

        double ariaPatrat = calcAriaPatrat(latura1);
        System.out.println(ariaPatrat);

        double ariaCerc = calcAriaCerc(r);
        System.out.println(ariaCerc);
*/





/*


    static double calcPerimetruPatrat(double d) {
        return d * 4;
    }

    static double calcPerimetruCerc(double z) {
        return 2 * Math.PI * z;

    }

    static double calcAriaTriunghi(double d, double e, double f) {
        double perimetru = d + e + f;
        return Math.sqrt(perimetru * (perimetru - d) * (perimetru - e) * (perimetru - f));
    }

    static double calcAriaPatrat(double d) {
        return d * d;

    }

    static double calcAriaCerc(double d) {
        return Math.PI * (d * d);

    }
*/


/*


        int a=6,b=5,c=15,d=9,s=3,t=4,w=12,x,y;
        x=++b - --a;
        System.out.println("x= "+x);
        t*=3+c/b;
        System.out.println("t= "+t);
        s/=b++ -a;
        System.out.println("s= "+s);
        y=c-- + b--;
        System.out.println("y= "+y);
        w%=1+c%4;
        System.out.println("w= "+w);
        d-= 3*a++ + ++c;
        System.out.println("d= "+d);

*/


       /* int n,i,k=14, m =3;
        for ( i=1; i<=5; i+=2){
            n=k%m;
            if(i==1) System.out.println("n="+n);
            n+=m; if(n>0)if(n!=7)
                System.out.println(("n="+n));
            else System.out.println("n="+n/2);
        }

        int a=5, b=2, t=5,c;
        while (a>1){
            if(a!=3){
                t=t<<b;
                System.out.println("t="+t);
            }else {t=t>>b;
                System.out.println("t="+t);
        }
        b++; a--;

        }*/

    }

    private static void print(String a) {
        System.out.println(a);
    }
}

