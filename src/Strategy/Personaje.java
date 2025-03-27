package Strategy;
/**
 * 
 * Una clase antigua para crear los ataques de los personajes 
 * 
 * @author Marisa Orrtega Lucena
 * @author Antonio Rodriguez Cortes
 * @author Bernardo Cubero Martínez
 * 
 * 
 * @version 1.0
 * 
 * @deprecated Ya no se usa 
 * 
 */


public class Personaje {
	public void atacar(String tipoAtaque) {
        if (tipoAtaque.equals("fuego")) {
            System.out.println("🔥 Lanzas una bola de fuego!");
        } else if (tipoAtaque.equals("agua")) {
            System.out.println("💧 Disparas un chorro de agua!");
        } else if (tipoAtaque.equals("tierra")) {
            System.out.println("🌱 Invocas una roca gigante!");
        } else if (tipoAtaque.equals("aire")) {
            System.out.println("🌪 Generas un tornado!");
        } else if (tipoAtaque.equals("rayo")) {
            System.out.println("⚡ Lanzas un rayo eléctrico!");
        } else {
            System.out.println("❌ Ataque desconocido!");
        }
    }
}


