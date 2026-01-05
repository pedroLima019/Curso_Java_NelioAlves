import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;
import  entities.Triangle;

public class exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x , y ;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Descreva as medidas do triangulo X: ");
        /* acessando atributo */
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Descreva as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.b) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        if (areaX > areaY) {
            System.out.println("O triangulo maior é o X");
        } else {
            System.out.println("O triangulo maior é o Y");
        }

        sc.close();
    }
}
