/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Clase principal para ejecutar ejemplos de hilos en Java.
 */
package poop12;

/**
 * Clase principal que demuestra el uso de hilos.
 * 
 * @author poo03alu24
 */
public class POOP12 {

    /**
     * Método `main` para iniciar la ejecución de los hilos.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Crear e iniciar hilos utilizando la clase Hilo.
        /*
        Hilo h1 = new Hilo("Hilo 1");
        Hilo h2 = new Hilo("Hilo 2");
        Hilo h3 = new Hilo("Hilo 3");

        h1.start();
        h2.start();
        h3.start();

        new Hilo("Hilo 4").start();
        new Hilo("Hilo 5").start();
        */

        // Crear e iniciar hilos utilizando la clase HiloR (Runnable).
        new Thread(new HiloR(), "Hilo R1").start();
        new Thread(new HiloR(), "Hilo R2").start();
        new Thread(new HiloR(), "Hilo R3").start();

        // Comentarios adicionales:
        // El planificador de hilos de Java utiliza el algoritmo Round Robin (RR).
        // La prioridad de los hilos puede establecerse mediante `setPriority()`.
    }
}
