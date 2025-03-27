package Strategy;
/**
 * 
 * Representa un hechizo de fuego en el juego
 * Esta clase implenta una interfaz
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 

 * @version 1.0
 * 
 */

public class FireSpell implements Spell{
	/**
	 * Ejecuta el hechizo de fuego, causando una explosión ígnea.
	 * Este método imprime un mensaje en la consola indicando que se ha lanzado
	 * una explosión ígnea con el símbolo de fuego.
	 * 
	 * @see Spell llama a la interfaz
	 */
    @Override
    public void cast() {
        System.out.println("🔥 Lanzaste una Explosión Ígnea!");
    }
}
