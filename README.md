# Gestión de Palabras Únicas con TreeSet

Este programa en Java permite gestionar un conjunto de palabras únicas utilizando un `TreeSet<String>`. Permite al usuario registrar palabras, buscarlas y visualizar la lista ordenada de manera interactiva.

## Características

- Permite registrar múltiples palabras sin duplicados.
- Almacena la información en un `TreeSet<String>` para mantener el orden alfabético automáticamente.
- Ofrece un menú interactivo con opciones para:
  - Buscar una palabra en el conjunto.
  - Mostrar todas las palabras registradas.
- Manejo básico de excepciones para evitar fallos inesperados.

## Tecnologías utilizadas

- Java 8 o superior
- Librerías utilizadas: `java.util.TreeSet`, `java.util.Scanner`

## Cómo ejecutar el programa

1. Compila el archivo con el siguiente comando:
   ```bash
   javac Main.java
   ```
2. Ejecuta el programa con:
   ```bash
   java ejercicio3_palabras_unicas.Main
   ```

## Explicación del código

1. Se utiliza un `Scanner` para capturar la entrada del usuario.
2. Se solicita la cantidad de palabras a registrar.
3. Cada palabra ingresada se almacena en un `TreeSet<String>`, asegurando que no haya duplicados y manteniendo el orden alfabético.
4. Se permite al usuario buscar una palabra dentro del conjunto.
5. Se muestra la lista ordenada de palabras ingresadas.

## Autor

Este código fue creado como un ejercicio de práctica en Java para manejo de conjuntos y entrada de usuario.

jedier stivenson correa amariz

