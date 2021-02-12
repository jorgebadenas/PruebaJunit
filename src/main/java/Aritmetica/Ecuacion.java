package Aritmetica;
public class Ecuacion {
    private double a;
    private double b;
    public Ecuacion(){}
    public Ecuacion( double a, double b ){
        super();
        this.a = a;
        this.b = b;
    }
    double resolver( ){
        if( a == 0 && b == 0 ) {
            return Double.POSITIVE_INFINITY;
        }
        return -b / a;
    }
}
