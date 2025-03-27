/**
 * 
 * Clase principal donde se ejecuta el juego
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

package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wizard wizard = new Wizard();
        String choice;

        System.out.println("🧙‍♂ ¡Bienvenido a Wizard of Legend!");
        System.out.println("Elige un hechizo: fuego, agua, tierra, rayo, aire (o escribe 'salir' para terminar)");

        while (true) {
            System.out.print("Selecciona tu hechizo: ");
            choice = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas

            switch (choice) {
                case "fuego":
                    wizard.setSpell(new FireSpell());
                    break;
                case "agua":
                    wizard.setSpell(new WaterSpell());
                    break;
                case "tierra":
                    wizard.setSpell(new EarthSpell());
                    break;
                case "rayo":
                    wizard.setSpell(new LightningSpell());
                    break;
                case "aire":
                    wizard.setSpell(new AirSpell());
                    break;
                case "salir":
                    System.out.println("¡Gracias por jugar!");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠ Hechizo no reconocido. Elige: fuego, agua, tierra, rayo, aire.");
                    continue;
            }

            wizard.castSpell(); // Ejecutar el hechizo elegido
        }
    }
}

