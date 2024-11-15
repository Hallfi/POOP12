/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Hilo.java
 * Esta clase extiende Thread para crear un hilo que ejecutará una tarea con un nombre definido.
 */

package poop12extra;

/**
 * Clase Hilo
 * Extiende la clase Thread para definir un hilo que ejecuta una tarea.
 * Permite personalizar el nombre del hilo y sobreescribe el método run()
 * para ejecutar la tarea deseada.
 */
public class Hilo extends Thread {

    private static int contador = 0; // Recurso compartido entre hilos

    /**
     * Constructor de la clase Hilo
     * Permite asignar un nombre al hilo.
     *
     * @param name El nombre del hilo
     */
    public Hilo(String name) {
        super(name);
    }

    /**
     * Método sincronizado incrementarContador
     * Incrementa el contador en 1 de manera sincronizada para evitar conflictos
     * cuando varios hilos intentan acceder al contador simultáneamente.
     */
    public synchronized void incrementarContador() {
        contador++;
        System.out.println("Hilo " + getName() + " incremento el contador a: " + contador);
    }

    /**
     * Método run()
     * Este método es ejecutado cuando el hilo inicia. En este punto, se define
     * la tarea específica que el hilo debe realizar.
     * Sobreescribe el método run() de la clase Thread.
     */
    @Override
    public void run() {
        incrementarContador(); // Llama al método sincronizado
    }
}