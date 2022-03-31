/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


import static ejercicio3.Ejercicio3.numero;

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
                    for (int i = 0; i <50000; i++) {
                        numero++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50000; i++) {
                        numero++;
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50000; i++) {
                        numero--;
                    }
                    break;
                case 4:
                    for (int i = 0; i < 50000; i++) {
                        numero--;
                    }
                    break;
            }
        }
    
}
