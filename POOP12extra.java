/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * POOP12.java
 * Esta clase principal ejecuta el programa en el método main.
 * El propósito de esta clase parece estar relacionado con la ejecución de tareas mínimas o atómicas en un contexto de hilos.
 */

package poop12extra;

/**
 * Clase principal POOP12
 * En esta clase se inicia el programa y se definen operaciones mínimas para ser ejecutadas.
 * Es posible que estas operaciones se realicen mediante el uso de hilos.
 */
public class POOP12extra {

    /**
     * Método main
     * Este es el punto de entrada del programa. Se puede ver que se pretende realizar
     * operaciones atómicas en pantalla, posiblemente con el uso de hilos para lograr
     * concurrencia y ejecución simultánea de tareas.
     *
     * @param args Los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear e iniciar instancias de Hilo (extends Thread)
        Hilo hilo1 = new Hilo("Hilo-1");
        Hilo hilo2 = new Hilo("Hilo-2");

        hilo1.start(); // Inicia el primer hilo
        hilo2.start(); // Inicia el segundo hilo

        // Crear e iniciar instancias de HiloR (implements Runnable)
        Thread hiloRunnable1 = new Thread(new HiloR(), "HiloR-1");
        Thread hiloRunnable2 = new Thread(new HiloR(), "HiloR-2");

        hiloRunnable1.start(); // Inicia el primer hilo con Runnable
        hiloRunnable2.start(); // Inicia el segundo hilo con Runnable

        // Esperar a que todos los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
            hiloRunnable1.join();
            hiloRunnable2.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido: " + e.getMessage());
        }

        System.out.println("Todos los hilos han terminado.");
    }
}
