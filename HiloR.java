/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * HiloR.java
 * Implementa la interfaz Runnable para definir un hilo mediante el método run().
 */

package poop12extra;

/**
 * Clase HiloR
 * Implementa Runnable para definir una tarea que puede ser ejecutada por un hilo.
 * A diferencia de la clase Hilo, esta clase no extiende Thread directamente.
 */
public class HiloR implements Runnable {

    private static int contador = 0; // Recurso compartido entre hilos

    /**
     * Método sincronizado incrementarContador
     * Incrementa el contador en 1 de manera sincronizada para evitar conflictos
     * cuando varios hilos intentan acceder al contador simultáneamente.
     */
    public synchronized void incrementarContador() {
        contador++;
        System.out.println("Hilo (Runnable) incremento el contador a: " + contador);
    }

    /**
     * Método run()
     * Este es el método abstracto de la interfaz Runnable que debe implementarse.
     * Define la tarea que se ejecutará cuando el hilo sea iniciado.
     */
    @Override
    public void run() {
        incrementarContador(); // Llama al método sincronizado
    }
}