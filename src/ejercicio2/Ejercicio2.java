/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Agustin
 */
public class Ejercicio2 {
    
    public static int [] vector1 = new int[100000];
    public static int [] vector2 = new int[100000];
    
    public static void main(String[] args) throws InterruptedException {
    
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            vector1[i]= (int) Math.round(Math.random());
        }
         
         
        long fin = System.currentTimeMillis();
         
        double tiempo = (double) ((fin - inicio));
         
        System.out.println("Procedimiento secuencial: "+ tiempo +" milisegundos");
    
        long inicio2 = System.currentTimeMillis();
       
        Hilo h1= new Hilo(1);
        Hilo h2= new Hilo(2);
        Hilo h3= new Hilo(3);
        Hilo h4= new Hilo(4);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);
        Thread t4 = new Thread(h4);

        t1.start();
        t2.start();        
        t3.start();
        t4.start();
         
        long fin2 = System.currentTimeMillis();
         
        double tiempo2 = (double) ((fin2 - inicio2));
         
        System.out.println("Procedimiento hilos: "+ tiempo2 +" milisegundos");
    }
   
}
