
package ejerciciosbasicosjava;

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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //todos los proyectos en java 
        //tienen una clase con este metodo, es el run de aqui
        EjerciciosBasicosJava ejercicios= new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.println(ejercicios.fiestaArdillas(70, true));
       
    }

  
    
}
