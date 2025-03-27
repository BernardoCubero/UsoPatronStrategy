package Strategy;

/**
 * Interfaz que define un comportamiento de ataque.
 * Las clases que implementen esta interfaz deben definir la lógica de ataque específica.
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 
 * @version 1.0
 * 
 */


public interface Spell {
	 /**
     * Ejecuta el hechizo.
     * Este método debe ser implementado por las clases que representen un hechizo
     * específico, proporcionando el comportamiento detallado de cómo se lanza el hechizo.
     */
	
    void cast();
}