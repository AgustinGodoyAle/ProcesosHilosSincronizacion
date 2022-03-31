/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


import java.io.IOException;
/**
 *
 * @author Agustin
 */
public class Ejercicio1 {

    public static void main(String[] args) throws IOExcepion, IOException, InterruptedException{
        
        Process proceso = Runtime.getRuntime().exec(new String[]{"cmd", "/c","c:/temp2/tp.pdf"});
        proceso.waitFor();
        System.out.println("Valor devuelto luego de cerrar: "+proceso.exitValue());
        
    }

    private static class IOExcepion extends Exception {

        public IOExcepion() {
        }
    }
        
}
