/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.concurrent.*;
/**
 *
 * @author Agustin
 */
public class Buffer {
    private int[]b;
    private int i=0, j=0; //punteros al buffer i=productor j=consumidor
    private Semaphore mutex = new Semaphore(1,true);
    private Semaphore hayDatos = new Semaphore(0, true);
    private Semaphore hayEspacio;
    
    public Buffer(int tam){
        b=new int [tam];
        hayEspacio = new Semaphore(tam,true);
    }
    
    public void poner (int dato) throws InterruptedException{
        hayEspacio.acquire(); //si no hay espacio espera, si hay espacio lo pone
        mutex.acquire();
        b[i] = dato;
        
        i=(i+1)%b.length;
        mutex.release();//libero mutex
        hayDatos.release(); //libero haydatos
    }
    
    public int extraer() throws InterruptedException{
        hayDatos.acquire();
        mutex.acquire();
        int actual=j; //posicion que extraigo
        j=(i+1)%b.length;
        mutex.release();
        hayEspacio.release();
        
        return b[actual];
    }
    
}
