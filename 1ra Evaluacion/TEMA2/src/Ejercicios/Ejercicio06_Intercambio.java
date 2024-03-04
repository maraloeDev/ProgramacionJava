package Ejercicios;


public class Ejercicio06_Intercambio {
    
    public static void main(String[] args) {
        
        int a=99;
        int b=1;
        
        System.out.println("ANTES");
        System.out.println("Variable a: " + a);
        System.out.println("Variable b: " + b);
        
        a=b;
        b=a;
        
        System.out.println("DESPUES");
        System.out.println("Variable a: " + a);
        System.out.println("Variable b: " + b);
    }
    
}
