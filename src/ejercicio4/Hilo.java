/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;


//import static ejercicio4.Ejercicio4.cerradura;
import static ejercicio4.Ejercicio4.lock;
import static ejercicio4.Ejercicio4.numero;

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
                            lock.lock();
                            try {
                                numero++;
                            } finally {
                                lock.unlock();
                            }       
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50000; i++) {
                        lock.lock();
                        try {
                            numero++;
                        } finally {
                            lock.unlock();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50000; i++) {
                        lock.lock();
                        try {
                            numero--;
                        } finally {
                            lock.unlock();
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < 50000; i++) {
                        lock.lock();
                        try {
                            numero--;
                        } finally {
                            lock.unlock();
                        }
                    }
                    break;
        }
    }
}
