package Strategy;

/**
 * 
 * Representa un hechizo de tierra en el juego
 * Esta clase implenta una interfaz
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 
 * 
 * @version 1.0
 * 
 * 
 * 
 */
public class EarthSpell implements Spell{
	
	/**
	 * Ejecuta el hechizo de barrera de rocas, creando una protección natural.
	 * Este método imprime un mensaje en la consola indicando que se ha creado
	 * una barrera de rocas con el símbolo correspondiente.
	 * 
	 * @see Spell se implenta a una interfaz
	 */
	
	  @Override
	    public void cast() {
	        System.out.println("🌿 Creaste una Barrera de Rocas!");
	    }

}
