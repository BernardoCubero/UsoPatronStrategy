package Strategy;

/**
 * 
 * Representa un hechizo de aire el juego
 * Esta clase implenta una interfaz
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 
 * 
 * @version 1.0
 * 
 */

public class AirSpell implements Spell {
	 /**
     * Ejecuta el hechizo de aire, generando un fuerte viento.
     * Este método imprime un mensaje en la consola indicando que se ha lanzado
     * un hechizo de aire con el símbolo correspondiente.
     */
	
    @Override
    public void cast() {
        System.out.println("¡Lanzando hechizo de aire! 🌬️");
    }
}