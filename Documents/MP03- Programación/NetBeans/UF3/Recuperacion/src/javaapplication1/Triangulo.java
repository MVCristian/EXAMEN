/*
Propiedades:
* - Base
* - Altura

Metodos:
* - Area
* - Perimetro
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double area() throws Exception{
        if (base <=0) throw new Exception("La base no puede ser 0 o negativo");
        return base*altura/2;
    }
    
    public double perimetro() throws Exception{
        if (altura <=0) throw new Exception("La altura no puede ser 0 o negativo");
        double hipotenusa;
        
        hipotenusa = Math.sqrt(((base/2)*(base/2))+((altura)*(altura)));
        
        return hipotenusa*2+base;
    }
    
    public static void main(String[] args) {
        Triangulo c1 = new Triangulo(19.0, 17.0);
        System.out.println(c1);
        try {
            System.out.println(c1.area());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            System.out.println(c1.perimetro());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
