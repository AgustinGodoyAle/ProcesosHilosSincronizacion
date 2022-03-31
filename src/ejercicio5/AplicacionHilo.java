/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Agustin
 */
public class AplicacionHilo implements Runnable{
    private Random x=new Random();
    private int nAplicacion;
    private Buffer b;

    public AplicacionHilo(int nAplicacion, Buffer b) {
        this.nAplicacion = nAplicacion;
        this.b=b;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            int r = (int) (Math.random() * (4500 - 500)) + 500;
            try {
                Thread.sleep(r);
                } catch (InterruptedException ex) {
            }
            
            int aux= x.nextInt(10);
            
            try {
                b.poner(aux);
                System.out.println("Aplicación "+nAplicacion+" imprimio su trabajo número "+i);
            } catch (InterruptedException ex) {
               Logger.getLogger(AplicacionHilo.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }

    
}
