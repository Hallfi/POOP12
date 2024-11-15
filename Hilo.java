/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Clase que hereda de Thread para representar un hilo con un nombre específico.
 */
package poop12;

/**
 * Clase Hilo que extiende la clase Thread.
 * 
 * @author poo03alu24
 */
public class Hilo extends Thread {

    // Constructor para inicializar el hilo con un nombre.
    public Hilo(String name) {
        super(name);
    }

    /**
     * Método `run` que se ejecutará cuando el hilo inicie.
     * En este método, se imprimen 10 iteraciones junto con el nombre del hilo.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion " + i + " del hilo " + getName());
        }
        System.out.println("Termina " + getName());
    }
}
