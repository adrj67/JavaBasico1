
package com.company;

public class Tipos {
    
    public static void main(String[] args) {
        
    
    //1. numericos
    //1.1 enteros
    byte variable1 = 5;
        System.out.println("El byte es: " + variable1);
    short variable2 = 10;
        System.out.println("El short es: " + variable2);
    int variable3 = 30;
        System.out.println("El int es: " + variable3);
    long variable4 = 100;
        System.out.println("El long es: " + variable4);
    
    //1.2 decimales
    float variable5 = 5.5f; // se usa punto para el decimal
        System.out.println("El float es: " + variable5);
    double variable6 = 10.7d;
        System.out.println("El double es: " + variable6);
    double precioSilla = 49.99;
        System.out.println("El precio de la silla es: " + precioSilla);
    
    //2. booleanos
    boolean variable7 = false;
        System.out.println("El boolean no verdadero es: " + variable7);
    boolean variable8 = true;
        System.out.println("El boolean no falso es: " + variable8);
    
    //3. texto
    char variable9 = 'a';
        System.out.println("El char es: " + variable9);
    String variable10 = "Hola, como estas!!";
        System.out.println("El String es: " + variable10);
    }
}
