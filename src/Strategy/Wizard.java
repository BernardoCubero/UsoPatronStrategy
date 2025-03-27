package Strategy;
/**
 * 
 * Clase de Mago 
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 
 * @version 1.0
 * 
 */


public class Wizard {
	
    private Spell spell;
    
    
    /**
     * Establece el hechizo que este objeto debe usar.
     * Este método asigna un hechizo a la instancia actual, lo que permite cambiar 
     * el hechizo que se lanzará más adelante en el juego.
     * 
     * @param spell El hechizo que se desea asignar a este objeto.
     *              Debe ser una instancia de una clase que implemente la interfaz {@link Spell}.
     */
    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    /**
     * Lanza el hechizo que ha sido asignado a este objeto.
     * Si se ha asignado un hechizo previamente, este se ejecuta llamando a su
     * método. Si no se ha asignado ningún hechizo, se
     * muestra un mensaje indicando que no se ha elegido un hechizo.
     */
  
    public void castSpell() {
        if (spell != null) {
            spell.cast();
        } else {
            System.out.println("No has elegido un hechizo.");
        }
    }
}
