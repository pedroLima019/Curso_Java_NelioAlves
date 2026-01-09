package entities; // pacote da classe

public class Triangle  {
    public double a ; // atributos da classe
    public double b ;
    public double c ;

    public double area (){ // método para calcular area
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b ) * (p - c ));

    }
}


