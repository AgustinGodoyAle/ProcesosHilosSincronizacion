/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Agustin
 */
public class ImpresoraHilo implements Runnable{
    
    private int nImpresora;
    private Buffer b;

    public ImpresoraHilo(int nImpresora, Buffer b) {
        this.nImpresora = nImpresora;
        this.b=b;
    }

    @Override
    public void run() {
        for (int i = 1; i < 151; i++) {
            int aux;
            try {
                aux=b.extraer();
                System.out.println("Impresora imprimiendo el trabajo "+i);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImpresoraHilo.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }
    }

    
}