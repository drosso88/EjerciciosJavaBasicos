
package ejerciciosbasicosjava;

import java.io.PrintStream;

/**
 *
 * @author Rocio Soriano
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana){
        if (finDeSemana){
        return true;
        }
    
       if (numeroBellotas>=40&& numeroBellotas<=60){
        return true;
       }
            return false;
        }
    
   
    
    public int multa (int velocidad, boolean birthday){
       if (birthday){ //si es mi cumple el guardia me quita 5 de velocidad
       velocidad -=5;
       }
       if (velocidad<=60){ 
       return 0;
       }
       if (velocidad > 60 && velocidad <=80){
       return 1;
       }
        return 2;
        }
    
     
        
    public boolean numeroVanidoso (int numero){
        //hola soy una intil, mejor me dedico a ser mujer florero
       if (numero % 11 == 0 || numero % 11 == 1){

          
           return true;
        
        }
          return false;
    }
      
    
    //ejercicio 04
    public boolean contesta ( boolean matinal, boolean madre, boolean dormido){
        if (dormido){
            return false;
        }
        if (matinal && madre){
            return true;
        }
        if (matinal){
            return false;
        }
        return true;
        
        /*   otra solución más corta
        if (dormido){
            return false;
        }
        if (matinal && !madre){
            return false;
        }
        return true;
        */
        
        //ejercicio 5
    }
         public boolean menorPor10 (int a, int b, int c){
        if (Math.abs(a-b) >= 10  || Math.abs(a-c) >= 10 || Math.abs(b-c) >= 10 ){
            return true;
        }
        return false;
    }
         
         //ejercicio 6
         public boolean digitoIgual (int a, int b){
             int aIzq= a /10;
             int aDer= a %10;
             int bIzq= a/10;
             int bDer= a%10;
             if (aIzq ==bIzq || aIzq==bDer|| aDer==bIzq||aDer==bDer){
                 return true;
             }
              return false;       
         }
    
         
    
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //todos los proyectos en java 
        //tienen una clase con este metodo, es el run de aqui
        EjerciciosBasicosJava ejercicios= new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.println(ejercicios.fiestaArdillas(70, true));
        
        
      //testeo ejercicio multa
        System.out.println(ejercicios.multa(60,false));
         System.out.println(ejercicios.multa(65,false));
          System.out.println(ejercicios.multa(65,true));
          
          // tercer ejercicio 
        System.out.println(ejercicios.numeroVanidoso(22));
         System.out.println(ejercicios.numeroVanidoso(23));
          System.out.println(ejercicios.numeroVanidoso(24));
          
          // testeo cuarto ejercicio
        System.out.println("contesta (falso, falso, falso) " + ejercicios.contesta(false, false, false) );
        System.out.println("contesta (falso, falso, true) " + ejercicios.contesta(false, false, true) );
        System.out.println("contesta (true, falso, falso) " + ejercicios.contesta(true, false, false) );
          
        //testeo quinto ejercicio 
        System.out.println("menorPor10 (1, 7, 11) " + ejercicios.menorPor10(1, 7, 11) );
        System.out.println("menorPor10 (1, 7, 10) " + ejercicios.menorPor10(1, 7, 10) );
        System.out.println("menorPor10 (11, 1, 7) " + ejercicios.menorPor10(11, 1, 7) );
        
        // testeo el ejercicio 6
        System.out.println("digitoIgual (12, 23) " + ejercicios.digitoIgual(12, 23) ); 
        System.out.println("digitoIgual (12, 43) " + ejercicios.digitoIgual(12, 43) );
        System.out.println("digitoIgual (12, 44) " + ejercicios.digitoIgual(12, 44) );
        
    
}

}


