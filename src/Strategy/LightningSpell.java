package Strategy;
/*
 * Representa un hechizo de rayo en el juego
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
 */
public class LightningSpell implements Spell {
	/**
	 * Ejecuta el hechizo de rayo, causando un impacto de energía eléctrica.
	 * Este método imprime un mensaje en la consola indicando que se ha lanzado
	 * un hechizo de rayo con el símbolo correspondiente.
	 * 
	 * @see Spell  es una interfaz
	 */
	@Override
	public void cast() {
	    System.out.println("¡Lanzando hechizo de rayo! ⚡");
	}
    
}