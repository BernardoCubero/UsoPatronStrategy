# *Patrones de Diseño*

## *Wizzard of Legends (Strategy)*

En este ejercicio, aplicamos el patrón de diseño *Strategy* al juego *Wizzard of Legends, donde los jugadores pueden elegir entre varios ataques elementales. El patrón **Strategy* permite cambiar el comportamiento de un objeto en tiempo de ejecución sin alterar su clase, facilitando la selección dinámica de un comportamiento de ataque. Este enfoque mejora la flexibilidad y escalabilidad del sistema, manteniendo el código modular y fácil de mantener.

---

## *Índice del Documento*
1. [Explicación del patrón de diseño Strategy](#explicación-del-patrón-de-diseño-strategy)
2. [Beneficios de usar el patrón Strategy](#beneficios-de-usar-el-patrón-strategy)
3. [Diferencias entre usar el patrón Strategy y no usarlo](#diferencias-entre-usar-el-patrón-strategy-y-no-usarlo)
4. [Conclusión](#conclusión)

---

## *1. Explicación del patrón de diseño Strategy*

El patrón de diseño *Strategy* pertenece a la categoría de patrones de comportamiento. Este patrón permite cambiar el comportamiento de un objeto en tiempo de ejecución al encapsular los diferentes comportamientos en clases separadas, y delegar la ejecución a uno de estos comportamientos en función de la necesidad del momento.

### *¿Cómo funciona?*
1. Se define una interfaz común (AtaqueStrategy) que tiene un método común para todas las estrategias (como atacar()).
2. Luego, se crean diferentes estrategias concretas (como AtaqueFuego, AtaqueAgua, etc.) que implementan la interfaz AtaqueStrategy.
3. Un objeto de la clase Contexto (por ejemplo, Personaje) contiene una referencia a un objeto de tipo AtaqueStrategy. Este objeto puede ser cambiado en tiempo de ejecución para seleccionar diferentes comportamientos sin que el contexto (el personaje) necesite saber cómo se ejecutan los ataques concretos.

### *Aplicación en Wizzard of Legends:*
En este juego, el jugador puede elegir entre diferentes ataques elementales (fuego, agua, aire, tierra y rayo). Cada uno de estos ataques está representado por una estrategia concreta. El personaje puede cambiar de ataque en tiempo real sin tener que conocer los detalles internos de cada tipo de ataque, lo que hace el código más modular y escalable.

---

## *2. Beneficios de usar el patrón Strategy*

- *Flexibilidad en el comportamiento*: Permite cambiar el comportamiento de un objeto en tiempo de ejecución sin modificar su código. En el juego, el jugador puede elegir su ataque en cualquier momento sin alterar la lógica interna de Personaje.

- *Separación de responsabilidades*: Cada ataque se maneja en su propia clase, haciendo el código más limpio y modular, evitando condicionales complejos como if-else.

- *Escalabilidad*: Agregar nuevos ataques es sencillo, solo creando una nueva clase de estrategia sin modificar el código existente. Sin Strategy, habría que modificar el método atacar() para cada nuevo ataque.

- *Reutilización de código*: Las estrategias son independientes y reutilizables, lo que mejora la eficiencia y facilita su uso en otros contextos del sistema.

---

## *3. Diferencias entre usar el patrón Strategy y no usarlo*

### *Sin patrón Strategy (con if-else)*

En un enfoque sin el patrón Strategy, toda la lógica de selección de ataques estaría contenida dentro de un solo método (atacar()) utilizando estructuras condicionales (if-else). El código sería algo como esto:

java
class Personaje {
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
### **Problemas de este enfoque:**

- **Dificultad para escalar**: Si agregamos un nuevo ataque, debemos modificar el método `atacar()`. Esto hace que el código sea difícil de mantener.
  
- **Código desorganizado**: El código se vuelve largo y difícil de entender a medida que se agregan más ataques. Todo está dentro del mismo método, lo que viola el principio de responsabilidad única.

- **No se aprovecha el polimorfismo**: Cada tipo de ataque se maneja de manera manual y no puede ser cambiado fácilmente en tiempo de ejecución.

---

### **Con patrón Strategy**

Con el patrón **Strategy**, el código se ve mucho más limpio y modular. Cada tipo de ataque se define en su propia clase que implementa la interfaz `AtaqueStrategy`, y la clase `Personaje` solo tiene que delegar la ejecución del ataque a la estrategia seleccionada en ese momento. Aquí, la clase `Personaje` no sabe cómo se ejecutan los ataques, solo interactúa con las estrategias de manera abstracta.

java
public void atacar() {
    estrategia.atacar();
}
### *Ventajas de este enfoque:*

- *Escalabilidad*: Si agregamos un nuevo ataque, solo necesitamos crear una nueva clase de ataque que implemente la interfaz AtaqueStrategy y no modificar el código de Personaje.

- *Flexibilidad*: Podemos cambiar el comportamiento de ataque en cualquier momento sin alterar la lógica interna del personaje, solo cambiando la estrategia seleccionada.

- *Modularidad*: Cada tipo de ataque está encapsulado en su propia clase, lo que hace que el código sea más fácil de entender y mantener.

---

## *Conclusión*

Aplicar el patrón *Strategy* en un juego como *Wizzard of Legends* facilita una mayor flexibilidad, escalabilidad y claridad en el código. Gracias a este patrón, el jugador puede seleccionar su ataque de manera dinámica sin que la lógica del personaje se vea afectada por el tipo de ataque elegido. A diferencia de una implementación sin *Strategy*, donde el código se vuelve complejo y difícil de modificar, este patrón proporciona una solución más ordenada, flexible y fácil de mantener.
