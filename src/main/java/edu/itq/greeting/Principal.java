/**
 * 
 */
package edu.itq.greeting;

/**
 * 
 */
public class Principal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Greeting objeto = new Greeting();
        String greet = objeto.greet("Liz");
        System.out.println(greet);
    }

}
