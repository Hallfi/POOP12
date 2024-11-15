/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Clase que implementa Runnable para representar una tarea ejecutable en un hilo.
 */
package poop12;

/**
 * Clase HiloR que implementa la interfaz Runnable.
 * 
 * @author poo03alu24
 */
public class HiloR implements Runnable {

    /**
     * Método `run` que ejecuta la tarea del hilo.
     * Imprime 10 iteraciones junto con el nombre del hilo que lo ejecuta.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion " + i + " del hilo " + Thread.currentThread().getName());
        }
        System.out.println("Termina el hilo " + Thread.currentThread().getName());
    }
}
