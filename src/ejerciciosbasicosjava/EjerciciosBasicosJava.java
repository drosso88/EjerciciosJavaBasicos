
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
    // ejercicio 7
         public boolean multiploMultiple (int numero){
         if (numero % 3==0 && numero %5 ==0){//el numero es multiplo de 3 y 5
             return false;
         }
         if (numero % 3 == 0 || numero %5 ==0){// el numero es multiplo de 3 o 5 
             //pero no de los dos
             return  true;
         }
         return false;
             }
         
         // ejercicio 8
    
         public boolean menos20 (int numero){
         if ((numero %20==20-1) ||(numero %20==20-2)){
    return true;
  }
  
  return false;
}
//ejercicio 9
          public int loteria (int a,int b, int c){
                 if ((a==2)&& (b==2)&&(c==2)){
                 return 10;
             }
                if ((a==b)&&(a==c)&&(b==c)){
               return 5;
                }
              if ((a==b)||(a==c)||(b==c)){
                  return 1;
              }
          
             return 0;
          }
           
          //ejercicio 10
       public int withoutDoubles (int a, int b,boolean dados){
         
    if (dados==true){
           if (a==b && b==a){
               return a+b+1;
           }
              
         }else{
        return a+b;
    }
    
        return a+b;
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
        
        //testeo el ejercicio 7 
        System.out.println("multiploMultiple (3) " + ejercicios.multiploMultiple(3) ); 
        System.out.println("multiploMultiple (10)" + ejercicios.multiploMultiple(10) );
        System.out.println("multiploMultiple (15)" + ejercicios.multiploMultiple (15) );
        
    //testeo ejercicio 8
       
        System.out.println("menos20 (18) " + ejercicios.menos20(18) ); 
        System.out.println("menos20(19)" + ejercicios.menos20(19) );
        System.out.println("menos20 (20)" + ejercicios.menos20(20) );
        
        // testeo ejercicio 9
        System.out.println("loteria (2,2,2) " + ejercicios.loteria(2,2,2) ); 
        System.out.println("loteria(2,2,1)" + ejercicios.loteria(2,2,1) );
        System.out.println("loteria (0,0,0)" + ejercicios.loteria(0,0,0) );
        
        //testeo ejercicio 10
        
       System.out.println("withoutDoubles (2,3,true) " + ejercicios.withoutDoubles(2,3,true) ); 
       System.out.println("withoutDoubles(3,3,true)" + ejercicios.withoutDoubles(3,3,true) );
       System.out.println("withoutDoubles (3,3,false)" + ejercicios.withoutDoubles(3,3,false) );
       System.out.println("withoutDoubles (6,6,true)" + ejercicios.withoutDoubles(6,6,true) );
        
}

}


