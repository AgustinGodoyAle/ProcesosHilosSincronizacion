/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import static ejercicio2.Ejercicio2.vector2;

/**
 *
 * @author Agustin
 */
public class Hilo implements Runnable{
    
    private int tipo;

    public Hilo(int tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void run(){
            switch(tipo){
                case 1:
                    for (int i = 0; i <25000; i++) {
                        vector2[i]= (int) Math.round(Math.random());
                    }
                    break;
                case 2:
                    for (int i = 25000; i < 50000; i++) {
                        vector2[i]= (int) Math.round(Math.random());
                    }
                    break;
                case 3:
                    for (int i = 50000; i < 75000; i++) {
                        vector2[i]= (int) Math.round(Math.random());
                    }
                    break;
                case 4:
                    for (int i = 75000; i < 100000; i++) {
                        vector2[i]= (int) Math.round(Math.random());
                    }
                    break;
            }
        }
    
}
