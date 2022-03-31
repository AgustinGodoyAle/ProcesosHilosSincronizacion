/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;



/**
 *
 * @author Agustin
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer b= new Buffer(4);
        AplicacionHilo h1= new AplicacionHilo(1,b);
        AplicacionHilo h2= new AplicacionHilo(2,b);
        AplicacionHilo h3= new AplicacionHilo(3,b);
        ImpresoraHilo i1= new ImpresoraHilo(1,b);

        
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);
        Thread t4 = new Thread(i1);

        t1.start();
        t2.start();        
        t3.start();
        t4.start();
        
    }
    
}
