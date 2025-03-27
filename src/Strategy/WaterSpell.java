package Strategy;
/**
 * 
 * Representa un hechizo de agua en el juego
 * Esta clase implenta una interfaz
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 
 * @version 1.0
 * 
 */

public class WaterSpell implements Spell {
	/**
	 * Ejecuta el hechizo de agua, desatando una ola torrencial.
	 * Este método imprime un mensaje en la consola indicando que se ha desatado
	 * una ola torrencial con el símbolo de agua.
	 * 
	 * @see Spell llama a una interfaz
	 */
	   @Override
	    public void cast() {
	        System.out.println("💧 Desataste una Ola Torrencial!");
	    }
	}


